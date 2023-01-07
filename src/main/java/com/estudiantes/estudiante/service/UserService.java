package com.estudiantes.estudiante.service;

import com.estudiantes.estudiante.dto.EstudianteDTO;
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

    public List<EstudianteDTO> getEstudianteById(Long id) {
        return estudianteRepository.EstudianteById(id);
    }

    public Estudiantes update(Estudiantes newEstudiantes, Long id) {
        return estudianteRepository.findById(id).map(estudiantes -> {
            estudiantes.setNombre(newEstudiantes.getNombre());
            estudiantes.setApellido(newEstudiantes.getApellido());
            estudiantes.setEdad(newEstudiantes.getEdad());
            estudiantes.setCurso(newEstudiantes.getCurso());
            estudiantes.setDenominacion(newEstudiantes.getDenominacion());
            return estudianteRepository.save(estudiantes);
        }).get();
    }

    public void delete(Long id) {
        estudianteRepository.findById(id).map(estudiantes -> {
            estudiantes.setEstado("I");
            estudiantes.setNombre(estudiantes.getNombre());
            estudiantes.setApellido(estudiantes.getApellido());
            estudiantes.setEdad(estudiantes.getEdad());
            estudiantes.setCurso(estudiantes.getCurso());
            estudiantes.setDenominacion(estudiantes.getDenominacion());
            return estudianteRepository.save(estudiantes);
        }).get();
    }

    public List<EstudianteDTO> estudiantesList() {
        return estudianteRepository.estudiantes();
    }
}
