package com.estudiantes.estudiante.entidades;

import javax.persistence.*;

@Entity
@Table(name = "grado", schema = "public")
public class Grado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "curso", length = 5, nullable = false)
    private String curso;

    public Grado(String curso) {
        super();
        this.curso = curso;
    }

    public Grado() {

    }

    public Grado(Long id) {
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

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", curso='" + curso + '\'' +
                '}';
    }
}
