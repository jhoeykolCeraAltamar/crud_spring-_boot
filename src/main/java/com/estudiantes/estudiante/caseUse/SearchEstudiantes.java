package com.estudiantes.estudiante.caseUse;

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

    public List<Estudiantes> getAllEstudiantes(){
        return userService.getAllEstudiante();
    }

    public JsonArray estudiantesList(){
        return userService.estudiantesList();
    }
}
