package org.biblioteca;

import java.util.ArrayList;

public class miembroPremium {

    // Atributos
    private ArrayList<libro> librosReservados;


    // Constructores
    public miembroPremium() {
    }

    public miembroPremium(ArrayList<libro> librosReservados) {
        this.librosReservados = librosReservados;
    }


    // Getters & Setters
    public ArrayList<libro> getLibrosReservados() {
        return librosReservados;
    }

    public void setLibrosReservados(ArrayList<libro> librosReservados) {
        this.librosReservados = librosReservados;
    }


    // Metodos
    /*
    reservar_libro(libro): Si el libro no está disponible, lo añade a una lista de reservas.
    Si está disponible, lo añade a su lista de libros prestados y cambia su disponibilidad.
    */
}
