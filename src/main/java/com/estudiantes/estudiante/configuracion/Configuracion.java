package com.estudiantes.estudiante.configuracion;

import com.estudiantes.estudiante.caseUse.CreateEstudents;
import com.estudiantes.estudiante.controller.ControllerUser;
import com.estudiantes.estudiante.repository.EstudianteRepository;
import com.estudiantes.estudiante.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracion {

    @Bean
    CreateEstudents saveEstudiantes(UserService userService){
        return new CreateEstudents(userService);
    }

    @Bean
    UserService saveStudentsService(EstudianteRepository estudianteRepository){
        return new UserService(estudianteRepository);
    }


}
