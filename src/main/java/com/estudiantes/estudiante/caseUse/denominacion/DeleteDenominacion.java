package com.estudiantes.estudiante.caseUse.denominacion;

import com.estudiantes.estudiante.service.DenominacionService;
import org.springframework.stereotype.Component;

@Component
public class DeleteDenominacion {
    private DenominacionService denominacionService;

    public DeleteDenominacion(DenominacionService denominacionService){
        this.denominacionService = denominacionService;
    }

    public void delete(long id){
        denominacionService.delete(id);
    }
}
