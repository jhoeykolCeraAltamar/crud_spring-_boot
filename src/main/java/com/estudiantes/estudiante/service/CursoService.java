package com.estudiantes.estudiante.service;

import com.estudiantes.estudiante.entidades.Grado;
import com.estudiantes.estudiante.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService (CursoRepository cursoRepository){
        this.cursoRepository = cursoRepository;
    }
    public Grado save(Grado curso) {
       return cursoRepository.save(curso);
    }

    public List<Grado> buscarCursos() {
       return  cursoRepository.findAll();
    }
}
