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
    public ArrayList<Libro> librosReservados;


    // Constructor

    public MiembroPremium(String nombre, String suscripcion) {
        super(nombre, suscripcion);
        this.librosReservados = new ArrayList<>();
    }


    // Getters & Setters
    public ArrayList<Libro> getLibrosPremium() {
        return librosReservados;
    }

    public void setLibrosPremium(ArrayList<Libro> librosReservados) {
        this.librosReservados = librosReservados;
    }

    // Metodos
    //reservar_libro(libro): Si el libro no está disponible, lo añade a una lista de reservas.
    //Si está disponible, lo añade a su lista de libros prestados y cambia su disponibilidad.

    public void reservarLibro(Libro libro, Usuario usuario) {
        // Se verifica que el libro no este disponible (false)
        if(libro.getDisponible() == false) {
            librosReservados.add(libro); // Se agrega a la lista de librosReservados
        } else {
            // Si esta disponible, llamo a la funcion tomar_prestado de la clase Usuario que se encarga
            // de reservar los libros disponibles
            usuario.tomar_prestado(libro);
        }
    }

    // Se imprimen en consola los libros reservados para el usuario Premium
    public void listaLibrosReservadosPremium(MiembroPremium miembroPremium) {
        System.out.println("----------------------------");
        System.out.println("***Miembro Premium***: " + miembroPremium.getNombre());
        System.out.println("Libros en reserva porque no estaban disponibles: ");
        // Se itera el arreglo de librosReservados
        for (Libro mp : miembroPremium.getLibrosPremium()) {
            System.out.println("- " + mp.getTitulo());
        }
    }
}
