package com.estudiantes.estudiante.repository;

import com.estudiantes.estudiante.dto.EstudianteDTO;
import com.estudiantes.estudiante.entidades.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiantes, Long> {

    @Query("select new com.estudiantes.estudiante.dto.EstudianteDTO(e.id, e.nombre, e.apellido, e.edad, e.curso, e.denominacion)" +
            " from Estudiantes e inner join com.estudiantes.estudiante.entidades.Grado as g ON e.curso = g.id inner join " +
            "com.estudiantes.estudiante.entidades.Denominacion as d ON e.denominacion = d.id")
    List<EstudianteDTO> estudiantes();

    @Query("select new com.estudiantes.estudiante.dto.EstudianteDTO(e.id, e.nombre, e.apellido, e.edad, e.curso, e.denominacion) " +
            "from Estudiantes e inner join com.estudiantes.estudiante.entidades.Grado as g ON e.curso = g.id inner join " +
            "com.estudiantes.estudiante.entidades.Denominacion as d ON e.denominacion = d.id where e.id=:EstudianteId")
    List<EstudianteDTO> EstudianteById(@Param("EstudianteId") long id);

}
