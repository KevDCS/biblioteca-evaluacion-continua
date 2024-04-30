package org.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class libro {

    // Atributos
    String titulo;
    String autor; //referencia a clase Autor
    boolean disponible;
    private ArrayList<libro> libros; //  libros = new ArrayList<>()


    // Constructores
    public libro() {
    }

    public libro(String titulo, String autor, boolean disponible, ArrayList<libro> libros) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
        this.libros = libros;
    }


    // Getters & Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Metodos
    /*
    marcar_prestado(): Cambia el estado de `disponible` a `False`.
    marcar_devuelto(): Cambia el estado de `disponible` a `True`.
    */
}
