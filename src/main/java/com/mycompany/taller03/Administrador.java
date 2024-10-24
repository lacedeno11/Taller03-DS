/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

/**
 *
 * @author abrahamcedeno
 */
public class Administrador extends Usuario {
    public Administrador(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public void crearUsuarioConRol(String usuario, String contraseña, String nombre, String apellido, String rol) {
        // Crear un nuevo usuario con el rol especificado
    }

    public void asignarPermiso(String usuario) {
        // Asignar permisos al usuario
    }

    public void actualizarSoftware() {
        // Actualizar el software del sistema
    }

    public void asignarResponsable(Curso curso, Profesor responsable) {
        curso.setResponsable(responsable);
    }
}

