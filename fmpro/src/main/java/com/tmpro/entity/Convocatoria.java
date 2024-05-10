package com.tmpro.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
public class Convocatoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDate fecha;

    private LocalTime hora;

    private String lugar;

    private String detallesEspecificos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipo_id")
    private Equipo equipoConvocado;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "convocatoria_jugadores",
            joinColumns = @JoinColumn(name = "convocatoria_id"),
            inverseJoinColumns = @JoinColumn(name = "jugador_id"))
    private Set<Jugador> jugadoresConvocados;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "convocatoria_jugadores_confirmados",
            joinColumns = @JoinColumn(name = "convocatoria_id"),
            inverseJoinColumns = @JoinColumn(name = "jugador_id"))
    private Set<Jugador> jugadoresConfirmados;

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

    public String getLugar() {
        return lugar;
    }

    public String getDetallesEspecificos() {
        return detallesEspecificos;
    }

    public Equipo getEquipoConvocado() {
        return equipoConvocado;
    }

    public Set<Jugador> getJugadoresConvocados() {
        return jugadoresConvocados;
    }}
