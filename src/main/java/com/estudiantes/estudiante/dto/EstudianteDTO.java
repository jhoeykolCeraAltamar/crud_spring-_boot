package com.estudiantes.estudiante.dto;

import com.estudiantes.estudiante.entidades.Denominacion;
import com.estudiantes.estudiante.entidades.Grado;

public class EstudianteDTO {
    private long id;
    private String nombre;
    private String apellido;
    private String curso;
    private String denominacion;
    private int edad;

    public EstudianteDTO (long id, String nombre, String apellido, int edad, Grado curso, Denominacion denominacion){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso.getCurso();
        this.denominacion = denominacion.getDenominacion();
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

    public String getCurso() {
        return curso;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "EstudianteDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", curso='" + curso + '\'' +
                ", denominacion='" + denominacion + '\'' +
                ", edad=" + edad +
                '}';
    }
}
