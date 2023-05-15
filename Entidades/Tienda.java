package Entidades;

import java.util.HashMap;
import java.util.Map;

public class Tienda {

    private Map<String, Double> productos;

    public Tienda() {
        productos = new HashMap();
    }

    public Map<String, Double> getProductos() {
        return productos;
    }

    public void setProductos(Map<String, Double> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos = ").append(productos);
        sb.append('}');
        return sb.toString();
    }
    
    
}