package Main;

import Entidades.*;
import Servicios.*;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in).useDelimiter("\n");
        /*
        //-----------------------------------Ejericicio 1 ------------------------------------------
        List<String> nombres = new ArrayList();
        String val;

        do {
            System.out.println("Ingrese el nombre de su perro a la lista");
            nombres.add(consola.next());

            System.out.println("""
                               Desea ingresar otro nombre?
                               S - Si
                               N - No""");
            val = consola.next();
        } while (val.equalsIgnoreCase("s"));

        for (String aux : nombres) {
            System.out.println(aux);
        }
         */
        //-----------------------------------Ejericicio 2 ------------------------------------------
        /*
        System.out.println("Ingrese el nombre del perro a eliminar");
        
        String elim = consola.next();
        boolean rem = false;
                
        Iterator<String> it = nombres.iterator();
        
        while (it.hasNext()) {
            String nom = it.next();
            if (nom.equalsIgnoreCase(elim)) {
                it.remove();
                rem = true;
            }
        }
        
        if (!rem) {
            System.out.println("Nombre a eliminar no encontrado");
        }
        
        Collections.sort(nombres);
        nombres.forEach((e) -> System.out.println(e));
         */
        //-----------------------------------Ejericicio 3 ------------------------------------------
        /*
        AlumnoService as = new AlumnoService();
        List listaAl = as.crearAlumnos();
        
        as.notaFinal(listaAl);
         */

        //-----------------------------------Ejericicio 4 ------------------------------------------
        /*
        PeliculaService ps = new PeliculaService();
        
        List<Pelicula> listaPelis = ps.crearPeliculas();
        
        System.out.println("---------------------------------Mostrando lista de peliculas");
        ps.mostrarPeliculas(listaPelis);
        
        System.out.println("---------------------------------Mostrando lista de peliculas que su duracion es mayor a 1 hora");
        ps.pelisPorDuracion(listaPelis);
        
        System.out.println("---------------------------------Mostrando lista de peliculas por duracion de mayor a menor");
        ps.ordenarMayAMen(listaPelis);
        
        System.out.println("---------------------------------Mostrando lista de peliculas por duracion de menor a mayor");
        ps.ordenarMenAMay(listaPelis);
        
        System.out.println("---------------------------------Mostrando lista de peliculas por titulo en orden alfabetico");
        ps.ordenarTitulo(listaPelis);
        
        System.out.println("---------------------------------Mostrando lista de peliculas por director en orden alfabetico");
        ps.ordenarDirector(listaPelis);
         */
        //-----------------------------------Ejericicio 5 ------------------------------------------
        /*
        PaisService ps = new PaisService();
        
        Set<Pais> listaPais = ps.crearPais();
        
        ps.eliminarPais(listaPais);
         */
        //-----------------------------------Ejericicio 6 ------------------------------------------
        /*
        TiendaServicio ts = new TiendaServicio();
        HashMap<String, Double> tienda = new HashMap<>();

        System.out.println("""
                           Elija la opcion que quiera ejecutar
                           1- Agregar un producto
                           2- Modificar el precio de un producto
                           3- Eliminar un producto
                           4- Mostrar un producto
                           5- Mostrar la lista de productos
                           6- Salir""");
        int op = consola.nextInt();
        do {
            switch (op) {
                case 1 -> ts.agregarProductos(tienda);
                case 2 -> ts.modificarPrecio(tienda);
                case 3 -> ts.eliminarProducto(tienda);
                case 4 -> ts.mostrarProducto(tienda);
                case 5 -> ts.mostrarLista(tienda);
                default -> System.out.println("No se encontró la opcion");
            }
        } while (op != 6);
        */
    }
}
