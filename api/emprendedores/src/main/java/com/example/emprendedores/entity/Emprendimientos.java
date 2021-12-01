package com.example.emprendedores.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Emprendimientos")
public class Emprendimientos {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="emprendedor")
    private int emprendedor;

    @Column(name="nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="fecha_creacion")
    private Date fecha_creacion;

    @Column(name="fecha_actualizacion")
    private Date fecha_actualizacion;

    public Emprendimientos(){}

    public Emprendimientos(int id, int emprendedor, String nombre, String descripcion, Date fecha_creacion, Date fecha_actualizacion) {
        this.id = id;
        this.emprendedor = emprendedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmprendedor() {
        return emprendedor;
    }

    public void setEmprendedor(int emprendedor) {
        this.emprendedor = emprendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Date fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    @Override
    public String toString() {
        return "Emprendimientos{" +
                "id=" + id +
                ", emprendedor=" + emprendedor +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha_creacion=" + fecha_creacion +
                ", fecha_actualizacion=" + fecha_actualizacion +
                '}';
    }
}
