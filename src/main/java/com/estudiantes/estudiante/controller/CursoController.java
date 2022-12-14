package com.estudiantes.estudiante.controller;

import com.estudiantes.estudiante.caseUse.Cursos.CreateCurso;
import com.estudiantes.estudiante.caseUse.Cursos.DeleteCursos;
import com.estudiantes.estudiante.caseUse.Cursos.ObtenerCursos;
import com.estudiantes.estudiante.caseUse.Cursos.UpdateCurso;
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
    private UpdateCurso updateCurso;
    private DeleteCursos deleteCursos;

    public CursoController(CreateCurso createCurso, ObtenerCursos obtenerCursos, UpdateCurso updateCurso, DeleteCursos deleteCursos) {
        this.createCurso = createCurso;
        this.obtenerCursos = obtenerCursos;
        this.updateCurso = updateCurso;
        this.deleteCursos = deleteCursos;
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

    @PutMapping("/update/{id}")
    ResponseEntity<Grado> update(@RequestBody Grado grado, @PathVariable long id){
        return new ResponseEntity<>(updateCurso.update(grado, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Grado> delete (@PathVariable long id){
        deleteCursos.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
