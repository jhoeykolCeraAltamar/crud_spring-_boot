package com.estudiantes.estudiante.service;

import com.estudiantes.estudiante.entidades.Estudiantes;
import com.estudiantes.estudiante.repository.EstudianteRepository;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public Estudiantes update(Estudiantes newEstudiantes, Long id) {
        return estudianteRepository.findById(id).map(estudiantes -> {
            estudiantes.setNombre(newEstudiantes.getNombre());
            estudiantes.setApellido(newEstudiantes.getApellido());
            estudiantes.setEdad(newEstudiantes.getEdad());
            return estudianteRepository.save(estudiantes);
        }).get();
    }

    public void delete(Long id) {
        estudianteRepository.delete(new Estudiantes(id));
    }

    public JsonArray estudiantesList() {
        JsonArray data = new JsonArray();
        estudianteRepository.estudiantes().forEach(estudiantes -> {
            JsonObject obj = new JsonObject();
            obj.addProperty("id", estudiantes.getId());
            obj.addProperty("nombre", estudiantes.getNombre());
            obj.addProperty("apeliido", estudiantes.getApellido());
            obj.addProperty("edad", estudiantes.getEdad());
            obj.addProperty("curso", estudiantes.getCurso().getCurso());
            obj.addProperty("denominacion", estudiantes.getDenominacion().getDenominacion());
            data.add(obj);
        });
        System.out.println(data);
        return data;
    }
}
