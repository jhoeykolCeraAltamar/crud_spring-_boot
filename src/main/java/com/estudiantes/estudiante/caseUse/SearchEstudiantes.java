package com.estudiantes.estudiante.caseUse;

import com.estudiantes.estudiante.dto.EstudianteDTO;
import com.estudiantes.estudiante.entidades.Estudiantes;
import com.estudiantes.estudiante.service.UserService;
import com.google.gson.JsonArray;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchEstudiantes {
    private UserService userService;

    public SearchEstudiantes(UserService userService){
        this.userService = userService;
    }

    public List<EstudianteDTO> getEstudiantesById(long id){
        return userService.getEstudianteById(id);
    }

    public List<EstudianteDTO> estudiantesList(){
        return userService.estudiantesList();
    }
}
