package com.tmpro.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sesion_entrenamiento_id")
    private SesionEntrenamiento sesionEntrenamiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jugador_id")
    private Jugador jugador;
    private String nombre;
    @Enumerated(EnumType.STRING) // Explicitly define enum type
    private AsistenciaTipo asistencia;

    // Getters and Setters
    public Long getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SesionEntrenamiento getSesionEntrenamiento() {
        return sesionEntrenamiento;
    }

    public void setSesionEntrenamiento(SesionEntrenamiento sesionEntrenamiento) {
        this.sesionEntrenamiento = sesionEntrenamiento;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public AsistenciaTipo getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(AsistenciaTipo asistencia) {
        this.asistencia = asistencia;
    }

    // Optional methods for convenience (not shown)
    public String getSesionNombre() {
        return sesionEntrenamiento != null ? sesionEntrenamiento.getNombre() : null;
    }

    public String getJugadorNombreCompleto() {
        return jugador != null ? jugador.getNombre() : null;
    }
}

