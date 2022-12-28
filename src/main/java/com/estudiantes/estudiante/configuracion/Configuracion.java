package com.estudiantes.estudiante.configuracion;

import com.estudiantes.estudiante.caseUse.CreateEstudents;
import com.estudiantes.estudiante.caseUse.Cursos.CreateCurso;
import com.estudiantes.estudiante.caseUse.DeleteEstudiantes;
import com.estudiantes.estudiante.caseUse.UpdateEstudiante;
import com.estudiantes.estudiante.caseUse.denominacion.CreateDenominacion;
import com.estudiantes.estudiante.caseUse.denominacion.DeleteDenominacion;
import com.estudiantes.estudiante.caseUse.denominacion.UpdateDenominacion;
import com.estudiantes.estudiante.repository.CursoRepository;
import com.estudiantes.estudiante.repository.DenominacionRepository;
import com.estudiantes.estudiante.repository.EstudianteRepository;
import com.estudiantes.estudiante.service.CursoService;
import com.estudiantes.estudiante.service.DenominacionService;
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
    UpdateEstudiante updateEstudiantes(UserService userService){
        return new UpdateEstudiante(userService);
    }
    @Bean
    DeleteEstudiantes delteDeleteEstudiantes(UserService userService){
        return new DeleteEstudiantes(userService);
    }
    @Bean
    UserService saveStudentsService(EstudianteRepository estudianteRepository){
        return new UserService(estudianteRepository);
    }
    @Bean
    CreateCurso saveCurso(CursoService cursoService){
        return new CreateCurso(cursoService);
    }
    @Bean
    CursoService cursoServices(CursoRepository cursoRepository){
        return new CursoService(cursoRepository);
    }

    @Bean
    CreateDenominacion saveDenominacion(DenominacionService denominacionService){
        return new CreateDenominacion(denominacionService);
    }
    @Bean
    UpdateDenominacion updateDenominaciones(DenominacionService denominacionService){
        return new UpdateDenominacion(denominacionService);
    }

    @Bean
    DeleteDenominacion deleteDenominaciones(DenominacionService denominacionService) {
        return new DeleteDenominacion(denominacionService);
    }
    @Bean
    DenominacionService denominacionService(DenominacionRepository denominacionRepository){
        return new DenominacionService(denominacionRepository);
    }

}
