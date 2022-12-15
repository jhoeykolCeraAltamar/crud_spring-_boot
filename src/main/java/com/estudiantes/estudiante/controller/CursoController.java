package com.estudiantes.estudiante.controller;

import com.estudiantes.estudiante.caseUse.Cursos.CreateCurso;
import com.estudiantes.estudiante.entidades.Curso;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/cursos")
public class CursoController {
    private CreateCurso createCurso;

    public CursoController(CreateCurso createCurso) {
        this.createCurso = createCurso;
    }

    @PostMapping("/save")
    ResponseEntity<Curso> save(@RequestBody Curso curso) {
        return new ResponseEntity<>(createCurso.save(curso), HttpStatus.CREATED);
    }

}
