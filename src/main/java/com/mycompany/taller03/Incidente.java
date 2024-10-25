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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFechaReportado() {
        return fechaReportado;
    }

    public void setFechaReportado(LocalDateTime fechaReportado) {
        this.fechaReportado = fechaReportado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public List<String> getLogActualizaciones() {
        return logActualizaciones;
    }

    public void setLogActualizaciones(List<String> logActualizaciones) {
        this.logActualizaciones = logActualizaciones;
    }

    public LocalDateTime getFechaCerrado() {
        return fechaCerrado;
    }

    public void setFechaCerrado(LocalDateTime fechaCerrado) {
        this.fechaCerrado = fechaCerrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

