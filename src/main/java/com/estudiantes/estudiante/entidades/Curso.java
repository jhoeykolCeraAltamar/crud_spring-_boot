package com.estudiantes.estudiante.entidades;

import javax.persistence.*;

@Entity
@Table(name = "cursos", schema = "public")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "curso", length = 5, nullable = false)
    private String curso;

    @Column(name = "denominacion", nullable = false, length = 2)
    private String denominacion;

    public Curso(String curso, String denominacion) {
        this.curso = curso;
        this.denominacion = denominacion;
    }

    public Curso(Long id){
        this.id = id;
    }
    public String getCurso() {
        return curso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", curso='" + curso + '\'' +
                ", denominacion='" + denominacion + '\'' +
                '}';
    }
}
