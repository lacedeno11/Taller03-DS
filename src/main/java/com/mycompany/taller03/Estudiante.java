/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

/**
 *
 * @author abrahamcedeno
 */

// Estudiante es una subclase de PersonalAcademico.
// Esto significa que un Estudiante hereda todos los métodos y atributos de PersonalAcademico.
public class Estudiante extends PersonalAcademico {
    public Estudiante(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

   // Estudiante puede solicitar inscribirse en un curso (asociación con Curso).
    public void solicitarInscripcionCurso(Curso curso) {
        curso.agregarSolicitudInscripcion(this);
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividad) {
        // Realizar actividad sumativa
    }
}
