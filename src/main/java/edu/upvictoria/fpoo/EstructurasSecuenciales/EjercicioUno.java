package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EjercicioUno {
    public EjercicioUno() throws IOException{
        System.out.println("Ejercicio 1: ");
        System.out.println(" Se desea implementar un algoritmo para obtener la suma de dos números cualesquiera.\n" +
                "Se debe partir de que para poder obtener la suma es necesario contar con dos números,\n" +
                "pues el proceso que debemos realizar es precisamente la suma de éstos, la cual se asigna\n" +
                "a una variable que se reporta como resultado del proceso.");

        BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double a;
        double b;
        System.out.println("Ingresa el primer numero: ");
        entrada=leer.readLine();
        a=Double.parseDouble(entrada);
        System.out.println("Ingresa el segundo numero: ");
        entrada=leer.readLine();
        b=Double.parseDouble(entrada);

        Suma sum=new Suma();
        System.out.println(sum.sum(a,b));

    }
}
