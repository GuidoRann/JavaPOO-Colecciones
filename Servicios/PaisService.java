package Servicios;

import Entidades.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PaisService {

    Scanner consola = new Scanner(System.in).useDelimiter("\n");

    public Set crearPais() {
        Set<Pais> listaPaices = new HashSet();

        String exit;

        do {
            System.out.println("Ingrese el Pais");
            String nombre = consola.next();
            Pais p = new Pais(nombre);

            if (listaPaices.contains(p)) {
                System.out.println("El país ya fue agregado");
            } else {
                listaPaices.add(p);
            }

            System.out.println("¿Desea crear otro alumno? - (S/N)");
            exit = consola.next();

        } while (!"n".equalsIgnoreCase(exit));
        return listaPaices;
    }

    public void mostraPaices(Set<Pais> p) {
        p.forEach((p1) -> System.out.println(p1.getNombre()));
    }

    public void eliminarPais(Set<Pais> p) {
        System.out.println("Ingrese el nombre del país que desea eliminar: ");
        String nombrePais = consola.next();

        Pais p1 = new Pais(nombrePais);
        boolean eliminado = false;

        Iterator<Pais> it = p.iterator();

        while (it.hasNext()) {
            Pais next = it.next();

            if (next.getNombre().equalsIgnoreCase(p1.getNombre())) {
                it.remove();
                eliminado = true;
                break;
            }
        }

        if (!eliminado) {
            System.out.println("El pais no fue encontrado en el conjunto");
        }

        mostraPaices(p);
    }
}
