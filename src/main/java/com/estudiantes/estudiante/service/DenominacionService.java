package com.estudiantes.estudiante.service;

import com.estudiantes.estudiante.entidades.Denominacion;
import com.estudiantes.estudiante.repository.DenominacionRepository;

import java.util.List;

public class DenominacionService {
    private DenominacionRepository denominacionRepository;

    public DenominacionService(DenominacionRepository denominacionRepository){
        this.denominacionRepository = denominacionRepository;
    }

    public Denominacion save (Denominacion denominacion){
       return denominacionRepository.save(denominacion);
    }

    public List<Denominacion> search() {
        return denominacionRepository.findAll();
    }

    public Denominacion update(Denominacion denominacion, long id) {
       return denominacionRepository.findById(id).map(denominaciones -> {
            denominaciones.setDenominacion(denominacion.getDenominacion());
            return denominacionRepository.save(denominaciones);
        }).get();
    }

    public void delete(long id) {
        denominacionRepository.findById(id).map(denominaciones -> {
            denominaciones.setDenominacion(denominaciones.getDenominacion());
            denominaciones.setEstado("I");
            return denominacionRepository.save(denominaciones);
        }).get();
    }
}
