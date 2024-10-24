/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

/**
 *
 * @author abrahamcedeno
 */
public class Profesor extends PersonalAcademico {
    public Profesor(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividad) {
        curso.agregarActividad(actividad);
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividad, float calificacion) {
        actividad.calificar(estudiante, calificacion);
    }

    public void aceptarInscripcion(Curso curso, Estudiante estudiante) {
        curso.aceptarInscripcion(estudiante);
    }

    public void crearNuevoForo(Foro foro) {
        // Crear un nuevo foro en el curso
    }
}
