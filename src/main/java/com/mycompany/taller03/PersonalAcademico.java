/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

/**
 *
 * @author abrahamcedeno
 */
public class PersonalAcademico extends Usuario {
    public PersonalAcademico(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public void reportarError(String email, String contenido) {
        // Enviar reporte de error
    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido) {
        // Solicitar asesoramiento
    }

    public void comentarEnForo(Foro foro, String comentario) {
        foro.agregarComentario(this, comentario);
    }
}
