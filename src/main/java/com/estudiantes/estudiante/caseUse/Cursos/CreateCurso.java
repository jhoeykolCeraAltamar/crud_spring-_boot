package com.estudiantes.estudiante.caseUse.Cursos;

import com.estudiantes.estudiante.entidades.Grado;
import com.estudiantes.estudiante.service.CursoService;
import org.springframework.stereotype.Component;

@Component
public class CreateCurso {
    private CursoService cursoService;
    public CreateCurso(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    public Grado save(Grado curso){
        return cursoService.save(curso);
    }

}
