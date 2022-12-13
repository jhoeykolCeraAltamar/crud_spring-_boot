package com.estudiantes.estudiante.service;

import com.estudiantes.estudiante.entidades.Estudiantes;
import com.estudiantes.estudiante.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final EstudianteRepository estudianteRepository;

    public UserService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public Estudiantes save(Estudiantes estudiantes) {
        return estudianteRepository.save(estudiantes);
    }

    public List<Estudiantes> getAllEstudiante() {
        return estudianteRepository.findAll();
    }
}
