package com.estudiantes.estudiante.controller;

import com.estudiantes.estudiante.caseUse.CreateEstudents;
import com.estudiantes.estudiante.caseUse.DeleteEstudiantes;
import com.estudiantes.estudiante.caseUse.SearchEstudiantes;
import com.estudiantes.estudiante.caseUse.UpdateEstudiante;
import com.estudiantes.estudiante.dto.EstudianteDTO;
import com.estudiantes.estudiante.entidades.Estudiantes;
import com.google.gson.JsonArray;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class ControllerUser {
    private CreateEstudents createEstudents;
    private SearchEstudiantes searchEstudiantes;
    private UpdateEstudiante updateEstudiante;
    private DeleteEstudiantes deleteEstudiantes;

    public ControllerUser(CreateEstudents createEstudents, SearchEstudiantes searchEstudiantes, UpdateEstudiante updateEstudiante, DeleteEstudiantes deleteEstudiantes) {
        this.createEstudents = createEstudents;
        this.searchEstudiantes = searchEstudiantes;
        this.updateEstudiante = updateEstudiante;
        this.deleteEstudiantes = deleteEstudiantes;
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
    List<Estudiantes> getAllEstudiantes() {
        return searchEstudiantes.getAllEstudiantes();
    }

    @GetMapping("/estudiantesList")
    List<EstudianteDTO> estudiantesList(){
        return searchEstudiantes.estudiantesList();
    }

    @PutMapping("/update/{id}")
    ResponseEntity<Estudiantes> updateEstudiantes(@RequestBody Estudiantes estudiantes, @PathVariable Long id) {
        return new ResponseEntity<>(updateEstudiante.update(estudiantes, id), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    ResponseEntity<Estudiantes> deleteEstudiante(@PathVariable Long id) {
        deleteEstudiantes.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
