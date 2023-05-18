package Entidades;

public class Pais { //Si no uso el implement en la clase del objeto, tengo que usar un comparator en la declaracion del Tree

    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*-----------------------Si solo tiene un atributo se usa un comparador simple---------------------------------
    @Override
    public int compareTo(Pais otroPais) {
        return this.nombre.compareTo(otroPais.getNombre());
    }
    
    -------------------------Si tiene mas de un atributo se usa un comparador multiple---------------------------------
    @Override
    public int compare(Person person1, Person person2) {
        
        ------ Comparar por nombre
        int nameComparison = person1.getName().compareTo(person2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }

        ------ Comparar por edad
        return Integer.compare(person1.getAge(), person2.getAge());
    }
    */
}
