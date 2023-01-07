package com.estudiantes.estudiante.service;

import com.estudiantes.estudiante.entidades.Grado;
import com.estudiantes.estudiante.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Grado save(Grado curso) {
        return cursoRepository.save(curso);
    }

    public List<Grado> buscarCursos() {
        return cursoRepository.findAll();
    }

    public Grado update(Grado grado, long id) {
        return cursoRepository.findById(id).map(grados -> {
            grados.setCurso(grado.getCurso());
            return cursoRepository.save(grados);
        }).get();
    }

    public void delete(long id) {
        cursoRepository.findById(id).map(grados -> {
            grados.setCurso(grados.getCurso());
            grados.setEstado("I");
            return cursoRepository.save(grados);
        }).get();
    }
}
