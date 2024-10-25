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

    public class UsuarioFactory {
        public static Usuario crearUsuarioConRol(String usuario, String contraseña, String nombre, String apellido, String rol) {
            switch (rol) {
                case "Profesor":
                    return new Profesor(usuario, contraseña, nombre, apellido);
                case "Estudiante":
                    return new Estudiante(usuario, contraseña, nombre, apellido);
                case "SoporteTecnico":
                    return new SoporteTecnico(usuario, contraseña, nombre, apellido);
                default:
                    return null; // O lanzar una excepción si el rol es inválido
            }
        }
    }


    public void asignarPermiso(String usuario) {
         //codigo a implementar
    }

    public void actualizarSoftware() {
         //codigo a implementar
    }

    public void asignarResponsable(Curso curso, Profesor responsable) {
        curso.setResponsable(responsable);
    }
    
    public void recibirIncidente(Incidente c){
       //codigo a implementar
    }
    
}

