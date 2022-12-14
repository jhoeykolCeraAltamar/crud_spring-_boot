package com.estudiantes.estudiante.caseUse.denominacion;

import com.estudiantes.estudiante.entidades.Denominacion;
import com.estudiantes.estudiante.service.DenominacionService;
import org.springframework.stereotype.Component;

@Component
public class CreateDenominacion {

    private DenominacionService denominacionService;

    public CreateDenominacion(DenominacionService denominacionService) {
        this.denominacionService = denominacionService;
    }

    public Denominacion save(Denominacion denominacion) {
        return denominacionService.save(denominacion);
    }

}
