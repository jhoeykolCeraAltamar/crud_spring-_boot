package com.estudiantes.estudiante.service;

import com.estudiantes.estudiante.entidades.Denominacion;
import com.estudiantes.estudiante.repository.DenominacionRepository;

public class DenominacionService {
    private DenominacionRepository denominacionRepository;

    public DenominacionService(DenominacionRepository denominacionRepository){
        this.denominacionRepository = denominacionRepository;
    }

    public Denominacion save (Denominacion denominacion){
       return denominacionRepository.save(denominacion);
    }
}
