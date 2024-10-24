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
        if (calificacion <= puntajeMaximo) {
            calificaciones.put(estudiante, calificacion);
        }
    }

    // Getters y Setters
    // ...
}
