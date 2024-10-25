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

public class Foro {
    private String id;
    private String tematica;
    private int numeroDeComentarios;
    private List<String> comentarios;

    public Foro(String id, String tematica) {
        this.id = id;
        this.tematica = tematica;
        this.numeroDeComentarios = 0;
        this.comentarios = new ArrayList<>();
    }
    
    // Asociación: Un foro está asociado a usuarios que pueden ser estudiantes o profesores (PersonalAcademico).
    public void agregarComentario(PersonalAcademico usuario, String comentario) {
        comentarios.add(usuario.getNombre() + ": " + comentario);
        numeroDeComentarios++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getNumeroDeComentarios() {
        return numeroDeComentarios;
    }

    public void setNumeroDeComentarios(int numeroDeComentarios) {
        this.numeroDeComentarios = numeroDeComentarios;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }


}
