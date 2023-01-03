package com.estudiantes.estudiante.repository;

import com.estudiantes.estudiante.entidades.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiantes, Long> {

    @Query("select e, g, d from Estudiantes e inner join com.estudiantes.estudiante.entidades.Grado as g ON e.curso = g.id inner join " +
            "com.estudiantes.estudiante.entidades.Denominacion as d ON e.denominacion = d.id")
    List<Estudiantes> estudiantes();

}
