package Servicios;

import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {
    Scanner consola = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarProductos(Map<String, Double> p){
        System.out.println("Ingrese el nombre del producto a agregar");
        String producto = consola.next();
        
        System.out.println("Ingrese el precio del producto");
        Double precio = consola.nextDouble();
        
        p.put(producto, precio);
    }
    
    public void modificarPrecio(Map<String, Double> p){
        System.out.println("Ingrese el nombre del producto que quiere modificar");
        String nom = consola.next();
        
        if (p.containsKey(nom)) {
            System.out.println("Ingrese el nuevo precio");
            Double nuevoPrecio = consola.nextDouble();
            p.put(nom, nuevoPrecio);
        } else System.out.println("El producto no se encuentra en la lista");
    }
    
    public void eliminarProducto(Map<String, Double> p){
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        String nom = consola.next();
        
        if (p.containsKey(nom)) {
            p.remove(nom);
        } else System.out.println("El producto no se encuentra en la lista");
    }
    
    public void mostrarProducto(Map<String, Double> p) {
        System.out.println("Ingrese el nombre del producto que desea ver");
        String nom = consola.next();
        
        p.forEach((k,e) ->{
            if (k.equalsIgnoreCase(nom)) {
                System.out.println("Producto: " + k + ", Precio: " + e);
            }
        });
    }
    
    public void mostrarLista(Map<String, Double> p) {
        p.forEach((s,e)-> System.out.println("producto: " + s + " precio: " + e));
    }  
    
}
