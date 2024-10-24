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

public class Tarea extends ActividadSumativa {
    private LocalDateTime fechaDePublicacion;

    public Tarea(String id, String titulo, LocalDateTime fechaDeEntrega, float puntajeMaximo, String contenido, LocalDateTime fechaDePublicacion) {
        super(id, titulo, fechaDeEntrega, puntajeMaximo, contenido);
        this.fechaDePublicacion = fechaDePublicacion;
    }

    // Getters y Setters
    // ...
}
