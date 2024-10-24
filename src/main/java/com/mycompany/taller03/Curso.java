/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

/**
 *
 * @author abrahamcedeno
 */
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private Profesor responsable;
    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesEnEspera;
    private List<ActividadSumativa> actividadesSumativas;
    private List<Foro> foros;

    public Curso(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = true;
        this.estudiantesInscritos = new ArrayList<>();
        this.estudiantesEnEspera = new ArrayList<>();
        this.actividadesSumativas = new ArrayList<>();
        this.foros = new ArrayList<>();
    }

    public void setResponsable(Profesor responsable) {
        this.responsable = responsable;
    }

    public void agregarSolicitudInscripcion(Estudiante estudiante) {
        estudiantesEnEspera.add(estudiante);
    }

    public void aceptarInscripcion(Estudiante estudiante) {
        if (estudiantesEnEspera.contains(estudiante)) {
            estudiantesEnEspera.remove(estudiante);
            estudiantesInscritos.add(estudiante);
        }
    }

    public void agregarActividad(ActividadSumativa actividad) {
        actividadesSumativas.add(actividad);
    }

    // Getters y Setters
    // ...
}
