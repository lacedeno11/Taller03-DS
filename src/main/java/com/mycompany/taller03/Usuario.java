/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

/**
 *
 * @author abrahamcedeno
 */
public class Usuario {
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellido;

    public Usuario(String usuario, String contraseña, String nombre, String apellido) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public boolean logIn(String usuario, String contraseña) {
        // Implementación de inicio de sesión
        return this.usuario.equals(usuario) && this.contraseña.equals(contraseña);
    }

    public boolean logOut() {
        // Implementación de cierre de sesión
        return true;
    }

    // Getters y Setters
    // ...
}
