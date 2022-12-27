package com.estudiantes.estudiante.repository;

import com.estudiantes.estudiante.entidades.Grado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Grado, Long> {
}
