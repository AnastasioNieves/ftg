package com.tmpro.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellidos;

    private LocalDate fechaNacimiento;

    private Genero genero;

    private String nacionalidad;

    private Posicion posicion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    private Integer dorsal;

    private String foto;

    @Lob
    private String historialDeportivo;

    // Getters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getFoto() {
        return foto;
    }

    public String getHistorialDeportivo() {
        return historialDeportivo;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setHistorialDeportivo(String historialDeportivo) {
        this.historialDeportivo = historialDeportivo;
    }
}
