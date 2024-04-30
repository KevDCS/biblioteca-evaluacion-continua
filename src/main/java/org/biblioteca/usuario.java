package org.biblioteca;

import java.util.ArrayList;

public class usuario {

    // Atributos
    String nombre;
    public ArrayList<libro> librosPrestados;


    // Constructor
    public usuario() {
    }

    public usuario(String nombre, ArrayList<libro> librosPrestados) {
        this.nombre = nombre;
        this.librosPrestados = librosPrestados;
    }


    // Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }


    // Metodos
    /*
    tomar_prestado(nombre_libro): Si el libro está disponible, lo añade a `libros_prestados` y cambia su disponibilidad.
    devolver_libro(nombre_libro): Remueve un libro de `libros_prestados` y cambia su disponibilidad.
     */
}
