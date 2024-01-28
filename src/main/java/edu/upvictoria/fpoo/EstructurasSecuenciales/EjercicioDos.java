package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EjercicioDos {
    public EjercicioDos() throws IOException {
        System.out.println("Ejercicio dos");
        System.out.println("Un estudiante realiza cuatro exámenes durante el semestre, los cuales tienen la misma\n" +
                "ponderación. Realice el pseudocódigo y el diagrama de flujo que representen el algoritmo\n" +
                "correspondiente para obtener el promedio de las calificaciones obtenidas.");
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int n;
        System.out.println("Ingrese la cantidad total de examenes: ");
        entrada=leer.readLine();
        n=Integer.parseInt(entrada);
        System.out.println("Ingrese las calificaciones: ");
        Promedio prom= new Promedio();
        prom.prom(n);
    }
}
