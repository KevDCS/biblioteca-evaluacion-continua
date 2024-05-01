package org.biblioteca;

public class Main {
    public static void main(String[] args) {
        /*
        Instancias a Crear:
            Al menos 2 Autores.
            Al menos 3 Libros publicados por los autores.
            Al menos 1 Usuario y 1 MiembroPremium.
        */

        // Se crea un Autor con sus libros
        Autor autor1 = new Autor("Ernest Cline");
        Libro libro1 = new Libro("Ready Player One", autor1);
        Libro libro2 = new Libro("Ready Player Two", autor1);
        Libro libro3 = new Libro("Armada", autor1);

        // Se publican los libros creados arriba
        autor1.publicar_libro(libro1);
        autor1.publicar_libro(libro2);
        autor1.publicar_libro(libro3);

        // Se crea un Autor con sus libros
        Autor autor2 = new Autor("Matt Haig");
        Libro libro4 = new Libro("La Biblioteca de la Medianoche", autor2);
        Libro libro5 = new Libro("Como detener el tiempo", autor2);
        Libro libro6 = new Libro("Reasons to stay alive", autor2);

        // Se publican los libros creados arriba
        autor2.publicar_libro(libro4);
        autor2.publicar_libro(libro5);
        autor2.publicar_libro(libro6);

        autor1.listarLibrosPublicados(autor1);
        autor2.listarLibrosPublicados(autor2);

        // Imprime en consola todos los libros creados de todos los autores con sus estados
        System.out.println("----------------------------");
        System.out.println("Estado inicial de libros: ");
        System.out.println("----------------------------");
        for (Libro libro : Libro.getlista_libros()) {
            System.out.println(libro.getTitulo() + " - Estado: "
                    + ((libro.getDisponible()) ? "Disponible" : "Reservado"));
        }

        System.out.println("----------------------------");
        System.out.println("Transacciones hechas desde clase Libro: ");
        libro4.marcar_prestado(libro4);
        libro5.marcar_prestado(libro5);
        libro4.marcar_devuelto(libro4);


        System.out.println("----------------------------");

        // Se crea un usuario con un libro
        Usuario user1 = new Usuario("Kevin");
        System.out.println("Libros a reservar por el usuario - " + user1.getNombre());
        //libro4.setDisponible(true);
        user1.tomar_prestado(libro4); // Biblioteca de la medianoche
        user1.tomar_prestado(libro5);
        user1.tomar_prestado(libro6);
//        user1.tomar_prestado(libro2);
//        user1.tomar_prestado(libro2);
//        user1.tomar_prestado(libro1);


        // Se imprimen los libros reservados por el usuario
        System.out.println("----------------------------");
        System.out.println("El usuario " + user1.getNombre() + " tiene reservados los libros: ");
        for (Libro libro : user1.getLibros()) {
            System.out.println("- " + libro.getTitulo());
        }

        // Se indica el libro al que se le asigna el metodo marcar_devuelto desde la clase Libro
        // y devuelve un mensaje en consola indicando que el libro ha sido devuelto
        System.out.println("----------------------------");
        System.out.println("Libros devueltos por \"" + user1.getNombre() + "\":");
        user1.devolver_libro(libro4);
        user1.devolver_libro(libro1);
        // Se indica el libro al que se le asigna el metodo marcar_devuelto desde la clase libro
        // y devuelve un mensaje en consola indicando que el
        System.out.println("----------------------------");
        System.out.println("Libros prestados a \"" + user1.getNombre() + "\":");
        user1.tomar_prestado(libro1);
        user1.tomar_prestado(libro6);

    }
}