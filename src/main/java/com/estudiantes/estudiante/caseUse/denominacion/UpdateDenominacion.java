package com.estudiantes.estudiante.caseUse.denominacion;

import com.estudiantes.estudiante.entidades.Denominacion;
import com.estudiantes.estudiante.service.DenominacionService;
import org.springframework.stereotype.Component;

@Component
public class UpdateDenominacion {
    private DenominacionService denominacionService;

    public UpdateDenominacion (DenominacionService denominacionService){
        this.denominacionService = denominacionService;
    }

    public Denominacion update(Denominacion denominacion, long id){
        return denominacionService.update(denominacion, id);
    }
}
