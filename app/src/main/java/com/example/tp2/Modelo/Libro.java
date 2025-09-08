package com.example.tp2.Modelo;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo;
    private String autor;
    private String descripcion;
    private int anio;
    private int imagen;

    public Libro(String titulo,String autor,String descripcion,int anio, int imagen) {
        this.titulo = titulo;
        this.autor = autor;
        this.descripcion = descripcion;
        this.anio = anio;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
