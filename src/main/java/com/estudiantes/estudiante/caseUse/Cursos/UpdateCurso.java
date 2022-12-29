package com.estudiantes.estudiante.caseUse.Cursos;

import com.estudiantes.estudiante.entidades.Grado;
import com.estudiantes.estudiante.service.CursoService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UpdateCurso {
    private CursoService cursoService;

    public UpdateCurso(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    public Grado update(Grado grado, long id){
       return cursoService.update(grado, id);
    }
}
