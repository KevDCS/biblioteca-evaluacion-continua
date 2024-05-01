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
    String suscripcion;
    private ArrayList<Libro> librosPrestados;


    // Construtores
    public Usuario() {
    }

    public Usuario(String nombre, String suscripcion) {
        this.nombre = nombre;
        this.suscripcion = suscripcion;
        this.librosPrestados = new ArrayList<>();
    }


    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    public ArrayList<Libro> getLibros() {
        return librosPrestados;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.librosPrestados = libros;
    }


    // Metodos

    //tomar_prestado(nombre_libro): Si el libro está disponible, lo añade a `libros_prestados` y cambia su disponibilidad.
    public void tomar_prestado(Libro libro) {
        // Esta condicion indica que solo me permite reservar si esta disponible(true).
        if (libro.getDisponible()){
        libro.setDisponible(false);
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido reservado con exito.");
            librosPrestados.add(libro); // Se agrega libro al array de libros_prestados
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
            librosPrestados.remove(libro); // Se elimina libro del array libros_prestados
        } else {
            System.out.println("******No puedes devolver el libro \"" + libro.getTitulo() + "\" porque no lo has reservado******");
        }
    }

}
