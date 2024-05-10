package com.tmpro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String deporte;

    private String categoria;

    private String entrenador;

    @OneToMany(mappedBy = "equipo")
    private Set<Jugador> jugadores;

    // Getters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}

