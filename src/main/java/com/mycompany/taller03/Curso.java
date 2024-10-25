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
        if (estudiantesInscritos.contains(estudiante)) {
            return; // O lanzar una excepción
        }
        if (estudiantesEnEspera.contains(estudiante)) {
            estudiantesEnEspera.remove(estudiante);
            estudiantesInscritos.add(estudiante);
        }
    }


    public void agregarActividad(ActividadSumativa actividad) {
        actividadesSumativas.add(actividad);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }

    public List<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(List<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public List<Estudiante> getEstudiantesEnEspera() {
        return estudiantesEnEspera;
    }

    public void setEstudiantesEnEspera(List<Estudiante> estudiantesEnEspera) {
        this.estudiantesEnEspera = estudiantesEnEspera;
    }

    public List<ActividadSumativa> getActividadesSumativas() {
        return actividadesSumativas;
    }

    public void setActividadesSumativas(List<ActividadSumativa> actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }
    
    public void eliminarCurso() {
        // Eliminar todas las actividades, foros y estudiantes asociados
        actividadesSumativas.clear();
        foros.clear();
        estudiantesInscritos.clear();
        estudiantesEnEspera.clear();
    }


    public List<Foro> getForos() {
        return foros;
    }

    public void setForos(List<Foro> foros) {
        this.foros = foros;
    }


}
