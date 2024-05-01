package org.biblioteca;
import java.util.ArrayList;
import java.util.List;

/*
Atributos:
nombre (string)
libros (lista de Libro)

Métodos:
publicar_libro(libro): Añade un libro a la lista de libros del autor.

Los autores tienen un nombre y una lista de libros que han escrito,
y son los únicos que pueden publicar los libros (cuando el autor publica el libro lo está creando).
*/


public class Autor {

    // Atributos
    private String nombre;
    private ArrayList<Libro> libros;


    // Constructores
    public Autor() {
    }

    public Autor(String nombre) {
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
    // publicar_libro(libro): Añade un libro a la lista de libros del autor.
    public void publicar_libro(Libro libro) {
        libros.add(libro);
    }

    // Metodo para listar los libros del autor
    public void listarLibrosPublicados(Autor autor) {
        System.out.println("----------------------------");
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("Libros publicados: ");
        // Se itera por la lista de libros creada con el metodo publicar_libro
        // en la clase Autor
        for (Libro libro : autor.getLibros()) {
            System.out.println("- " + libro.getTitulo());
        }
    }
}
