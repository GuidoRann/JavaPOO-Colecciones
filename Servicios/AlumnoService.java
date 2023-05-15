                      package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {

    Scanner consola = new Scanner(System.in).useDelimiter("\n");
        List<Integer> notas;

    public List crearAlumnos() {
        List<Alumno> listaAlumnos = new ArrayList();
        String exit;
        notas = new ArrayList();
        
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nom = consola.next();
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
                int nota = consola.nextInt();
                notas.add(nota);
            }
            
            listaAlumnos.add(new Alumno(nom, notas));
            
            System.out.println("¿Desea crear otro alumno? - (S/N)");
            exit = consola.next();

        } while (!"n".equalsIgnoreCase(exit));
        return listaAlumnos;
    }
    
    public void notaFinal(List<Alumno> a){
        System.out.println("Ingrese el nombre del alumno para calcular la nota");
        String nom = consola.next();
        double prom = 0;
        
        for (Alumno alumno : a) {
            if (alumno.getNombre().equalsIgnoreCase(nom)) {
                for (Integer nota : alumno.getNotas()) {
                    prom += nota;
                }
            }
        } 
        System.out.println("El promedio del alumno es: " + prom/3);
    }
}