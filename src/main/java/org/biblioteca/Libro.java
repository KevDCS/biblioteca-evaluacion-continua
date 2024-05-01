package org.biblioteca;
import java.util.ArrayList;
import java.util.List;

/*
Atributos:
título (string)
autor (referencia a Autor)
disponible (booleano)
lista_libros (lista de Libro)

Métodos:
marcar_prestado(): Cambia el estado de `disponible` a `False`. - False : Reservado
marcar_devuelto(): Cambia el estado de `disponible` a `True`. - True : Disponible

 Cada libro tiene un título, un autor y un indicador de disponibilidad,
 además hay una lista genérica de libros al que se añade cada libro en cuanto se crea.
 */


public class Libro {

    // Atributos
    private String titulo;
    private Autor autor;
    private boolean disponible;
    private static ArrayList<Libro> lista_libros = new ArrayList<>();


    // Constructores
    public Libro() {
    }

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
        lista_libros.add(this);

    }


    // Getters & Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public static List<Libro> getlista_libros() {
        return lista_libros;
    }

    public void setLibros(ArrayList<Libro> lista_libros) {
        this.lista_libros = lista_libros;
    }


    public static void setLista_libros(ArrayList<Libro> lista_libros) {
        Libro.lista_libros = lista_libros;
    }

    // Metodos

    // Metodo para marcar el libre como no disponible
    public void marcar_prestado(Libro libro) {
        libro.setDisponible(false);
        System.out.println("El libro " + libro.getTitulo() + " ha cambiado estado a **reservado**.");
    }

    // Metodo para marcar el libre como disponible
    public void marcar_devuelto(Libro libro) {
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha cambiado estado a **disponible**.");
        libro.setDisponible(true);

    }
}
