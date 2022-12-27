package com.estudiantes.estudiante.controller;

import com.estudiantes.estudiante.caseUse.denominacion.CreateDenominacion;
import com.estudiantes.estudiante.entidades.Denominacion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/denominacion")
public class ControllerDenominacion {
    private CreateDenominacion createDenominacion;

    public ControllerDenominacion(CreateDenominacion createDenominacion){
        this.createDenominacion = createDenominacion;
    }

    @PostMapping("/save")
    ResponseEntity<Denominacion> saveDenominacion (@RequestBody Denominacion denominacion){
        return new ResponseEntity<>(createDenominacion.save(denominacion), HttpStatus.CREATED);
    }

}
