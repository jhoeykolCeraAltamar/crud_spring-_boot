package com.estudiantes.estudiante.caseUse.Cursos;

import com.estudiantes.estudiante.service.CursoService;
import org.springframework.stereotype.Component;

@Component
public class DeleteCursos {

    private CursoService cursoService;

    public DeleteCursos(CursoService cursoService){
        this.cursoService = cursoService;
    }

    public void delete (long id){
        cursoService.delete(id);
    }
}
