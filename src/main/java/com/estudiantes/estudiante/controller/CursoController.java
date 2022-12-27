package com.estudiantes.estudiante.controller;

import com.estudiantes.estudiante.caseUse.Cursos.CreateCurso;
import com.estudiantes.estudiante.caseUse.Cursos.ObtenerCursos;
import com.estudiantes.estudiante.entidades.Grado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    private CreateCurso createCurso;
    private ObtenerCursos obtenerCursos;

    public CursoController(CreateCurso createCurso, ObtenerCursos obtenerCursos) {
        this.createCurso = createCurso;
        this.obtenerCursos = obtenerCursos;
    }

    @PostMapping("/save")
    ResponseEntity<Grado> save(@RequestBody Grado curso) {
        return new ResponseEntity<>(createCurso.save(curso), HttpStatus.CREATED);
    }
    @GetMapping("/obtener")
    public List<Grado> cursos(){
        System.out.println(obtenerCursos.obtener().toString());
        return obtenerCursos.obtener();
    }

}
