package com.tmpro.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "informes")
public class Informe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String tipoInforme; // Enum (PARTIDO, JUGADOR, ESCOUTING)

    @Column(nullable = false)
    private Date fechaCreacion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "jugador_id")
    private Jugador jugador;

    @Lob
    @Column(nullable = false)
    private String contenido;

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipoInforme() {
        return tipoInforme;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Evento getEvento() {
        return evento;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public String getContenido() {
        return contenido;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTipoInforme(String tipoInforme) {
        this.tipoInforme = tipoInforme;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    // Constructors
    public Informe() {
    }

    public Informe(Long id, String titulo, String tipoInforme, Date fechaCreacion, Evento evento, Jugador jugador, String contenido) {
        this.id = id;
        this.titulo = titulo;
        this.tipoInforme = tipoInforme;
        this.fechaCreacion = fechaCreacion;
        this.evento = evento;
        this.jugador = jugador;
        this.contenido = contenido;
    }

    // equals(), hashCode(), toString()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return id.equals(informe.id) &&
                titulo.equals(informe.titulo) &&
                tipoInforme.equals(informe.tipoInforme) &&
                fechaCreacion.equals(informe.fechaCreacion) &&
                Objects.equals(evento, informe.evento) &&
                Objects.equals(jugador, informe.jugador) &&
                contenido.equals(informe.contenido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, tipoInforme, fechaCreacion, evento, jugador, contenido);
    }

    @Override
    public String toString() {
        return "Informe{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", tipoInforme='" + tipoInforme + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", evento=" + evento +
                ", jugador=" + jugador +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}
