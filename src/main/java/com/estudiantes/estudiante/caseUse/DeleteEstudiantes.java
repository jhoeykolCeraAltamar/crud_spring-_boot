package com.estudiantes.estudiante.caseUse;

import com.estudiantes.estudiante.service.UserService;

public class DeleteEstudiantes {
    private UserService userService;

    public DeleteEstudiantes(UserService userService){
        this.userService = userService;
    }

    public void delete(Long id){
        userService.delete(id);
    }
}
