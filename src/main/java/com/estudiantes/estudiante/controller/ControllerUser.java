package com.estudiantes.estudiante.controller;

import com.estudiantes.estudiante.caseUse.CreateEstudents;
import com.estudiantes.estudiante.caseUse.SearchEstudiantes;
import com.estudiantes.estudiante.entidades.Estudiantes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class ControllerUser {
    private CreateEstudents createEstudents;
    private SearchEstudiantes searchEstudiantes;

    public ControllerUser(CreateEstudents createEstudents, SearchEstudiantes searchEstudiantes){
        this.createEstudents = createEstudents;
        this.searchEstudiantes = searchEstudiantes;
    }

    @GetMapping
    private String status() {
        return "toda esta bien pos aqui";
    }

    @PostMapping("/save")
    ResponseEntity<Estudiantes> newEstudiante(@RequestBody Estudiantes estudiantes) {
        return new ResponseEntity<>(createEstudents.save(estudiantes), HttpStatus.CREATED);
    }

    @GetMapping("/estudiantes")
    List<Estudiantes> getAllEstudiantes(){
        return searchEstudiantes.getAllEstudiantes();
    }
}
