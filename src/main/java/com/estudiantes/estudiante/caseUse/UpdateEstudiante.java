package com.estudiantes.estudiante.caseUse;

import com.estudiantes.estudiante.entidades.Estudiantes;
import com.estudiantes.estudiante.service.UserService;

public class UpdateEstudiante {

    private UserService userService;

    public UpdateEstudiante(UserService userService){
        this.userService = userService;
    }

    public Estudiantes update(Estudiantes estudiantes, Long id){
        return userService.update(estudiantes, id);
    }
}
