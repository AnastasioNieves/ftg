package com.tmpro.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.sql.Time;
import java.util.Date;
import java.util.Set;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fecha;
    private Time hora;
    private String lugar;
    private TipoEvento tipoEvento;
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "equipo_local_id")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "equipo_visitante_id")
    private Equipo equipoVisitante;

    @OneToMany(mappedBy = "evento")
    private Set<Convocatoria> convocatorias;

    @OneToOne(mappedBy = "alineacion")
    private Alineacion alineacionEquipoLocal;


    // Getters
    public Long getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public Set<Convocatoria> getConvocatorias() {
        return convocatorias;
    }

    public Alineacion getAlineacionEquipoLocal() {
        return alineacionEquipoLocal;
    }
    public String getTitulo() {
        return titulo;
    }



    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public void setConvocatorias(Set<Convocatoria> convocatorias) {
        this.convocatorias = convocatorias;
    }

    public void setAlineacionEquipoLocal(Alineacion alineacionEquipoLocal) {
        this.alineacionEquipoLocal = alineacionEquipoLocal;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public enum TipoEvento {
        PARTIDO, ENTRENAMIENTO
    }
}
