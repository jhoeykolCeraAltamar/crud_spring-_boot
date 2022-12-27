package com.estudiantes.estudiante.repository;

import com.estudiantes.estudiante.entidades.Denominacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenominacionRepository extends JpaRepository<Denominacion, Long> {
}
