package com.tmpro.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Entity
public class Alineacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    @OneToMany(mappedBy = "alineacion")
    private Set<Jugador> jugadores;

    // Getters
    public Long getId() {
        return id;
    }

    public Evento getEvento() {
        return evento;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

}

