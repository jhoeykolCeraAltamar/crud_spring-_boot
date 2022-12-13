package com.estudiantes.estudiante.caseUse;

import com.estudiantes.estudiante.entidades.Estudiantes;
import com.estudiantes.estudiante.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class CreateEstudents {
    private UserService userService;

    public CreateEstudents(UserService userService) {
        this.userService = userService;
    }

    public Estudiantes save(Estudiantes estudiantes) {
        return userService.save(estudiantes);
    }
}