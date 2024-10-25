/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller03;
import java.time.LocalDateTime;


/**
 *
 * @author abrahamcedeno
 */
public class Taller03 {
    public static void main(String[] args) {
        // Crear usuarios
        Profesor profesor = new Profesor("profesor1", "pass123", "Juan", "Pérez");
        Estudiante estudiante = new Estudiante("estudiante1", "pass456", "María", "García");

        // Crear curso y asignar responsable
        Curso curso = new Curso("CURSO01", "Programación");
        Administrador admin = new Administrador("admin1", "adminpass", "Carlos", "López");
        admin.asignarResponsable(curso, profesor);

        // Estudiante solicita inscripción
        estudiante.solicitarInscripcionCurso(curso);

        // Profesor acepta inscripción
        profesor.aceptarInscripcion(curso, estudiante);

        // Profesor crea una actividad sumativa
        ActividadSumativa actividad = new Tarea("ACT01", "Tarea 1", LocalDateTime.now().plusDays(7), 100, "Resolver ejercicios", LocalDateTime.now());
        profesor.cargarActividadSumativa(curso, actividad);

        // Estudiante realiza la actividad
        estudiante.realizarActividadSumativa(curso, actividad);

        // Profesor califica la actividad
        profesor.calificarActividadSumativa(curso, estudiante, actividad, 95);

        // Estudiante comenta en el foro
        Foro foro = new Foro("FORO01", "Dudas de la tarea");
        curso.getForos().add(foro);
        estudiante.comentarEnForo(foro, "¿Podría explicar el ejercicio 2?");

        // Estudiante reporta un problema
        estudiante.reportarError("soporte@plataforma.com", "No puedo acceder al material de la semana 3.");

        // Soporte técnico atiende el incidente
        SoporteTecnico soporte = new SoporteTecnico("soporte1", "soportepass", "Ana", "Martínez");
        Incidente incidente = new Incidente(1, "Acceso denegado", "El estudiante no puede acceder al material de la semana 3.", "Técnico");
        soporte.resolverProblemaTecnico(estudiante);

        // Administrador actualiza el software
        admin.actualizarSoftware();
    }
}
