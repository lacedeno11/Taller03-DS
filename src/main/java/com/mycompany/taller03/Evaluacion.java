/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

import java.time.LocalDateTime;

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

    public int getLimiteDeTiempo() {
        return limiteDeTiempo;
    }

    public void setLimiteDeTiempo(int limiteDeTiempo) {
        this.limiteDeTiempo = limiteDeTiempo;
    }


}

