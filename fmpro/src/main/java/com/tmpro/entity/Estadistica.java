package com.tmpro.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
@Table(name = "estadisticas")
public class Estadistica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "jugador_id")
    private Jugador jugador;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @Column(nullable = false)
    private int goles;

    @Column(nullable = false)
    private int asistencias;

    @Column(nullable = false)
    private int minutosJugados;

    @Column(nullable = false)
    private int tarjetasAmarillas;

    @Column(nullable = false)
    private int tarjetasRojas;

    // Getters
    public Long getId() {
        return id;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Evento getEvento() {
        return evento;
    }

    public int getGoles() {
        return goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public int getMinutosJugados() {
        return minutosJugados;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    // Constructors
    public Estadistica() {
    }

    public Estadistica(Long id, Jugador jugador, Evento evento, int goles, int asistencias, int minutosJugados, int tarjetasAmarillas, int tarjetasRojas) {
        this.id = id;
        this.jugador = jugador;
        this.evento = evento;
        this.goles = goles;
        this.asistencias = asistencias;
        this.minutosJugados = minutosJugados;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
    }

    // equals(), hashCode(), toString()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estadistica estadística = (Estadistica) o;
        return id.equals(estadística.id) &&
                goles == estadística.goles &&
                asistencias == estadística.asistencias &&
                minutosJugados == estadística.minutosJugados &&
                tarjetasAmarillas == estadística.tarjetasAmarillas &&
                tarjetasRojas == estadística.tarjetasRojas &&
                Objects.equals(jugador, estadística.jugador) &&
                Objects.equals(evento, estadística.evento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jugador, evento, goles, asistencias, minutosJugados, tarjetasAmarillas, tarjetasRojas);
    }

    @Override
    public String toString() {
        return "Estadística{" +
                "id=" + id +
                ", jugador=" + (jugador != null ? jugador.getNombre() : "Sin jugador") + // Added jugador.getNombre()
                ", evento=" + (evento != null ? evento.getTitulo() : "Sin evento") + // Added evento.getTitulo()
                ", goles=" + goles +
                ", asistencias=" + asistencias +
                ", minutosJugados=" + minutosJugados +
                ", tarjetasAmarillas=" + tarjetasAmarillas +
                ", tarjetasRojas=" + tarjetasRojas +
                '}';
    }}
