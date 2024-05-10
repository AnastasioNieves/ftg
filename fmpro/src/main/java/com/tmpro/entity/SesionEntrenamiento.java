package com.tmpro.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class SesionEntrenamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    private LocalTime hora;

    private String nombre;

    private Duration duracion;

    private String lugar;

    private String objetivosEspecificos;

    @OneToMany(mappedBy = "sesionEntrenamiento", cascade = CascadeType.ALL)
    private List<Ejercicio> ejercicios;

    // Getters
    public Long getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public String getLugar() {
        return lugar;
    }

    public String getObjetivosEspecificos() {
        return objetivosEspecificos;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setObjetivosEspecificos(String objetivosEspecificos) {
        this.objetivosEspecificos = objetivosEspecificos;
    }

    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }


    // Getters and setters (not shown for brevity)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}

