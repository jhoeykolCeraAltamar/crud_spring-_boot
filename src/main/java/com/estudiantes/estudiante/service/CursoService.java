package com.estudiantes.estudiante.service;

import com.estudiantes.estudiante.entidades.Curso;
import com.estudiantes.estudiante.repository.CursoRepository;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService (CursoRepository cursoRepository){
        this.cursoRepository = cursoRepository;
    }
    public Curso save(Curso curso) {
       return cursoRepository.save(curso);
    }
}
