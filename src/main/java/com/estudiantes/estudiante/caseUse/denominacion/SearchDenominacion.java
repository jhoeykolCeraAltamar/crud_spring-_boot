package com.estudiantes.estudiante.caseUse.denominacion;

import com.estudiantes.estudiante.entidades.Denominacion;
import com.estudiantes.estudiante.service.DenominacionService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchDenominacion {

    private DenominacionService denominacionService;

    public SearchDenominacion ( DenominacionService denominacionService) {
        this.denominacionService = denominacionService;
    }


    public List<Denominacion> search(){
       return denominacionService.search();
    }
}
