/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

/**
 *
 * @author abrahamcedeno
 */

// Profesor también es una subclase de PersonalAcademico, compartiendo métodos con Estudiante.
// Profesor asociado a un curso. La relación es una asociación, ya que un Profesor puede existir sin el curso.
public class Profesor extends PersonalAcademico {
    public Profesor(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }
    
    // Profesor está asociado a Cursos y Actividades Sumativas.
    // Asociación: Profesor puede cargar actividades sumativas en un curso.
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividad) {
        curso.agregarActividad(actividad);
    }
    
    // Asociación: Profesor puede calificar las actividades sumativas de los estudiantes en un curso.
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividad, float calificacion) {
        actividad.calificar(estudiante, calificacion); // Asociación con ActividadSumativa y Estudiante
    }

    public void aceptarInscripcion(Curso curso, Estudiante estudiante) {
        curso.aceptarInscripcion(estudiante);
    }

    public void crearNuevoForo(Foro foro) {
        // Crear un nuevo foro en el curso
    }
}
