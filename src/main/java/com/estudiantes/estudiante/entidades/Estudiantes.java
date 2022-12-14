package com.estudiantes.estudiante.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "\"estudiantes\"", schema = "public")
public class Estudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;
    @Column(name = "edad", length = 10, nullable = false)
    private int edad;
    @Column(name = "estado", columnDefinition = "varchar(1) default 'A'", nullable = false)
    private String estado;

    @ManyToOne
    @JsonBackReference(value = "grado")
    private Grado curso;
    @ManyToOne
    @JsonBackReference(value = "denominacion")
    private Denominacion denominacion;


    public Estudiantes(String nombre, String apellido, int edad, Grado curso, Denominacion denominacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
        this.denominacion = denominacion;
    }

    public Estudiantes() {

    }

    public Estudiantes(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Grado getCurso() {
        return curso;
    }

    public void setCurso(Grado curso) {
        this.curso = curso;
    }

    public Denominacion getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(Denominacion denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", curso=" + curso +
                ", denominacion=" + denominacion +
                '}';
    }
}
