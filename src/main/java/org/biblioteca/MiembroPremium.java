package org.biblioteca;
import java.util.ArrayList;

/*
Atributos:
libros_reservados (lista de Libro)

Métodos adicionales:
reservar_libro(libro): Si el libro no está disponible, lo añade a una lista de reservas.
Si está disponible, lo añade a su lista de libros prestados y cambia su disponibilidad.

Los miembros premium, que heredan de usuarios, tienen la capacidad adicional de reservar libros que están actualmente prestados.
*/


public class MiembroPremium extends Usuario {

    // Atributos
    public ArrayList<Libro> librosPremium;


    // Constructor
    public MiembroPremium() {
    }

    public MiembroPremium(ArrayList<Libro> librosPremium) {
        this.librosPremium = librosPremium;
    }

    public MiembroPremium(String nombre, ArrayList<Libro> librosUsuario, ArrayList<Libro> librosPremium) {
        super(nombre, librosUsuario);
        this.librosPremium = librosPremium;
    }


    // Getters & Setters
    public ArrayList<Libro> getLibrosPremium() {
        return librosPremium;
    }

    public void setLibrosPremium(ArrayList<Libro> librosPremium) {
        this.librosPremium = librosPremium;
    }
}
