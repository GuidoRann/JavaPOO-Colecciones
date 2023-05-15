package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PeliculaService {

    Scanner consola = new Scanner(System.in).useDelimiter("\n");

    public List crearPeliculas() {
        List<Pelicula> listaPeliculas = new ArrayList();
        String exit;

        do {
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = consola.next();

            System.out.println("Ingrese el director de la pelicula");
            String director = consola.next();

            System.out.println("Ingrese la duracion de la pelicula");
            double duracion = consola.nextDouble();

            listaPeliculas.add(new Pelicula(titulo, director, duracion));

            System.out.println("¿Desea crear otra pelicula? - (S/N)");
            exit = consola.next();

        } while (!"n".equalsIgnoreCase(exit));

        return listaPeliculas;
    }

    public void mostrarPeliculas(List<Pelicula> lp) {
        for (Pelicula pelicula : lp) {
            System.out.println("------------------------------------");
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
        }
    }

    public void pelisPorDuracion(List<Pelicula> lp) {
        for (Pelicula pelicula : lp) {
            if (pelicula.getDuracion() > 1.0) {
                System.out.println("------------------------------------");
                System.out.println("Título: " + pelicula.getTitulo());
                System.out.println("Director: " + pelicula.getDirector());
                System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            }
        }
    }

    public void ordenarMayAMen(List<Pelicula> lp) {
        Collections.sort(lp, (p1, p2) -> Double.compare(p2.getDuracion(), p1.getDuracion()));
        mostrarPeliculas(lp);
    }

    public void ordenarMenAMay(List<Pelicula> lp) {
        Collections.sort(lp, (p1, p2) -> Double.compare(p1.getDuracion(), p2.getDuracion()));
        mostrarPeliculas(lp);
    }

    public void ordenarTitulo(List<Pelicula> lp) {
        Collections.sort(lp, (p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo()));
        mostrarPeliculas(lp);
    }

    public void ordenarDirector(List<Pelicula> lp) {
        Collections.sort(lp, (p1, p2) -> p1.getDirector().compareTo(p2.getDirector()));
        mostrarPeliculas(lp);
    }

}
