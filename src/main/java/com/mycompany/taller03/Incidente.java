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
import java.util.ArrayList;
import java.util.List;

public class Incidente {
    private int id;
    private LocalDateTime fechaReportado;
    private String estado;
    private String titulo;
    private String descripcion;
    private List<String> logActualizaciones;
    private LocalDateTime fechaCerrado;
    private String tipo;

    public Incidente(int id, String titulo, String descripcion, String tipo) {
        this.id = id;
        this.fechaReportado = LocalDateTime.now();
        this.estado = "Abierto";
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.logActualizaciones = new ArrayList<>();
        this.tipo = tipo;
    }

    public void actualizarEstado(String estado) {
        this.estado = estado;
        logActualizaciones.add("Estado actualizado a: " + estado);
    }

    public void cerrarIncidente() {
        this.estado = "Cerrado";
        this.fechaCerrado = LocalDateTime.now();
        logActualizaciones.add("Incidente cerrado.");
    }

    // Getters y Setters
    // ...
}

