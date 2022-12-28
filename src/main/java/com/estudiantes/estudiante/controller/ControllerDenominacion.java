package com.estudiantes.estudiante.controller;

import com.estudiantes.estudiante.caseUse.denominacion.CreateDenominacion;
import com.estudiantes.estudiante.caseUse.denominacion.DeleteDenominacion;
import com.estudiantes.estudiante.caseUse.denominacion.SearchDenominacion;
import com.estudiantes.estudiante.caseUse.denominacion.UpdateDenominacion;
import com.estudiantes.estudiante.entidades.Denominacion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/denominacion")
public class ControllerDenominacion {
    private CreateDenominacion createDenominacion;
    private SearchDenominacion searchDenominacion;
    private UpdateDenominacion updateDenominacion;
    private DeleteDenominacion deleteDenominacion;

    public ControllerDenominacion(CreateDenominacion createDenominacion, SearchDenominacion searchDenominacion, UpdateDenominacion updateDenominacion, DeleteDenominacion deleteDenominacion) {
        this.createDenominacion = createDenominacion;
        this.searchDenominacion = searchDenominacion;
        this.updateDenominacion = updateDenominacion;
        this.deleteDenominacion = deleteDenominacion;
    }

    @PostMapping("/save")
    ResponseEntity<Denominacion> saveDenominacion(@RequestBody Denominacion denominacion) {
        return new ResponseEntity<>(createDenominacion.save(denominacion), HttpStatus.CREATED);
    }

    @GetMapping("/search")
    List<Denominacion> search() {
        return searchDenominacion.search();
    }

    @PutMapping("/update/{id}")
    ResponseEntity<Denominacion> updateDenominacion(@RequestBody Denominacion denominacion, @PathVariable long id) {
        return new ResponseEntity<>(updateDenominacion.update(denominacion, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Denominacion> delete(@PathVariable long id){
        deleteDenominacion.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
