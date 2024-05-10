package com.tmpro.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    private CategoriaEjercicio categoria;

    @Lob
    private byte[] archivoAdjunto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sesion_entrenamiento_id")
    private SesionEntrenamiento sesionEntrenamiento;

    // Getters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public CategoriaEjercicio getCategoria() {
        return categoria;
    }

    public byte[] getArchivoAdjunto() {
        return archivoAdjunto;
    }

    public SesionEntrenamiento getSesionEntrenamiento() {
        return sesionEntrenamiento;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCategoria(CategoriaEjercicio categoria) {
        this.categoria = categoria;
    }

    public void setArchivoAdjunto(byte[] archivoAdjunto) {
        this.archivoAdjunto = archivoAdjunto;
    }

    public void setSesionEntrenamiento(SesionEntrenamiento sesionEntrenamiento) {
        this.sesionEntrenamiento = sesionEntrenamiento;
    }
}

