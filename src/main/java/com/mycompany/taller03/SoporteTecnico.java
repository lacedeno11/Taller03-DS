/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

/**
 *
 * @author abrahamcedeno
 */
public class SoporteTecnico extends Usuario {
    public SoporteTecnico(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public void brindarAsistencia(Usuario usuario) {
        // Brindar asistencia al usuario
    }

    public void resolverProblemaTecnico(Usuario usuario) {
        // Resolver problema técnico
    }

    public void derivarProblemaDeGestion(Administrador administrador, Incidente incidente) {
        administrador.recibirIncidente(incidente);
    }
}
