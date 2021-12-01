package com.example.emprendedores.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Emprendedores")
public class Emprendedores {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="nombres")
    private String nombres;

    @Column(name="apellidos")
    private String apellidos;

    @Column(name="correo")
    private String correo;

    @Column(name="fecha_nacimiento")
    private Date fecha_nacimiento;

    @Column(name="fecha_creacion")
    private Date fecha_creacion;

    @Column(name="fecha_actualizacion")
    private Date fecha_actualizacion;

    public Emprendedores(){}

    public Emprendedores(int id, String nombres, String apellidos, String correo, Date fecha_nacimiento, Date fecha_creacion, Date fecha_actualizacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_creacion = fecha_creacion;
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
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
        return "Emprendedores{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", fecha_creacion=" + fecha_creacion +
                ", fecha_actualizacion=" + fecha_actualizacion +
                '}';
    }
}
