package Servicios;

import Entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PaisService {

    Scanner consola = new Scanner(System.in).useDelimiter("\n");
    TreeSet<Pais> listaPaises;
    
    public TreeSet<Pais> crearPais() {
        listaPaises = new TreeSet<>((x1,x2)-> x1.getNombre().compareTo(x2.getNombre())); //Lambda para comparar y no usar el implement en la clase

//        TreeSet<Persona> lista = new TreeSet<>(Comparator.comparing(Persona::getNombre).thenComparing(Persona::getEdad)); // En el caso de querer comparar mas de un atriburo se escribe de esta forma con el .thenComparing
        
        String exit;

        do {
            System.out.println("Ingrese el Pais");
            String nombre = consola.next();
            Pais p = new Pais(nombre);
            
            listaPaises.add(p);

            System.out.println("¿Desea crear otro alumno? - (S/N)");
            exit = consola.next();

        } while (!"n".equalsIgnoreCase(exit));
        return listaPaises;
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
