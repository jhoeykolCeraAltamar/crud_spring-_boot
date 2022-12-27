package com.estudiantes.estudiante.caseUse.Cursos;
import com.estudiantes.estudiante.entidades.Grado;
import com.estudiantes.estudiante.service.CursoService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObtenerCursos {

    private CursoService cursoService;

    public ObtenerCursos(CursoService cursoService){
        this.cursoService = cursoService;
    }

    public List<Grado> obtener (){
        System.out.println(cursoService.buscarCursos().toString());
        return  cursoService.buscarCursos();
    }

}
