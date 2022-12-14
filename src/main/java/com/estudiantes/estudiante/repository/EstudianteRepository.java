package com.estudiantes.estudiante.repository;

import com.estudiantes.estudiante.entidades.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiantes, Long> {
    List<Estudiantes> findAll();


}
