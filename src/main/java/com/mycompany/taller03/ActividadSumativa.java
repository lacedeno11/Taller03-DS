/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

/**
 *
 * @author abrahamcedeno
 */
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ActividadSumativa {
    private Curso curso;
    private String titulo;
    private LocalDateTime fechaDeEntrega;
    private float puntajeMaximo;
    private String contenido;
    private String id;
    private Map<Estudiante, Float> calificaciones;

    public ActividadSumativa(String id, String titulo, LocalDateTime fechaDeEntrega, float puntajeMaximo, String contenido) {
        this.id = id;
        this.titulo = titulo;
        this.fechaDeEntrega = fechaDeEntrega;
        this.puntajeMaximo = puntajeMaximo;
        this.contenido = contenido;
        this.calificaciones = new HashMap<>();
    }

    public void calificar(Estudiante estudiante, float calificacion) {
        if (calificacion >= 0 && calificacion <= puntajeMaximo) {
            calificaciones.put(estudiante, calificacion);
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(LocalDateTime fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public float getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void setPuntajeMaximo(float puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<Estudiante, Float> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Map<Estudiante, Float> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    

}
