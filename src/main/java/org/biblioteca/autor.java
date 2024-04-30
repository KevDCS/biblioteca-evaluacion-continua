package org.biblioteca;

import java.util.ArrayList;

public class autor {

    // Atributos
    String nombre;
    public ArrayList<libro> librosAutor;


    // Constructores
    public autor() {
    }

    public autor(String nombre, ArrayList<libro> librosAutor) {
        this.nombre = nombre;
        this.librosAutor = librosAutor;
    }


    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<libro> getLibros() {
        return librosAutor;
    }

    public void setLibros(ArrayList<libro> librosAutor) {
        this.librosAutor = librosAutor;
    }


    // Metodos
    // publicar_libro(libro): Añade un libro a la lista de libros del autor.
}
