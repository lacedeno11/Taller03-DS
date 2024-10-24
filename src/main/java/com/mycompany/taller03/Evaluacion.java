/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

/**
 *
 * @author abrahamcedeno
 */
public class Evaluacion extends ActividadSumativa {
    private int limiteDeTiempo; // en minutos

    public Evaluacion(String id, String titulo, LocalDateTime fechaDeEntrega, float puntajeMaximo, String contenido, int limiteDeTiempo) {
        super(id, titulo, fechaDeEntrega, puntajeMaximo, contenido);
        this.limiteDeTiempo = limiteDeTiempo;
    }

    // Getters y Setters
    // ...
}

