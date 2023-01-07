package com.estudiantes.estudiante.entidades;

import javax.persistence.*;

@Entity
@Table(name = "\"denominacion\"", schema = "public")
public class Denominacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "denominacion", length = 2, nullable = false)
    private String nombre;
    @Column(name = "estado", columnDefinition = "varchar(1) default 'A'")
    private String estado;

    public Denominacion(String nombre) {
        super();
        this.nombre = nombre;
    }

    public Denominacion() {

    }
    public Denominacion(long id) {
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDenominacion(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public String getDenominacion() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Denominacion{" +
                "id=" + id +
                ", denominacion='" + nombre + '\'' +
                '}';
    }
}
