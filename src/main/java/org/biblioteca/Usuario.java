package org.biblioteca;
import java.util.ArrayList;

/*
Atributos:
nombre (string)
libros_prestados (lista de Libro)

Métodos:
tomar_prestado(nombre_libro): Si el libro está disponible, lo añade a `libros_prestados` y cambia su disponibilidad.
devolver_libro(nombre_libro): Remueve un libro de `libros_prestados` y cambia su disponibilidad.

Los usuarios tienen un nombre y una lista de libros en préstamo.
 */


public class Usuario {

    // Atributos
    String nombre;
    private ArrayList<Libro> libros;


    // Construtores
    public Usuario() {
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }


    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }


    // Metodos

    //tomar_prestado(nombre_libro): Si el libro está disponible, lo añade a `libros_prestados` y cambia su disponibilidad.
    public void tomar_prestado(Libro libro) {
        // Esta condicion indica que solo me permite reservar si esta disponible(true).
        if (libro.getDisponible()){
        libro.setDisponible(false);
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido reservado con exito.");
        libros.add(libro);
        } else {
            System.out.println("El libro \"" + libro.getTitulo() + "\" no esta disponible para reserva porque ya se encuentra reservado.");
        }
    }

    //devolver_libro(nombre_libro): Remueve un libro de `libros_prestados` y cambia su disponibilidad.
    public void devolver_libro(Libro libro) {
        // Esta condicion indica que solo me permite devolver si esta reservado(false).
        if (libro.getDisponible() == false) {
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido devuelto con exito.");
        libro.setDisponible(true);
        libros.remove(libro);
        } else {
            System.out.println("******No puedes devolver el libro \"" + libro.getTitulo() + "\" porque no lo has reservado******");
        }
    }

}
