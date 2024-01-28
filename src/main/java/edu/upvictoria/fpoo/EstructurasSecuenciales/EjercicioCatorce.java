package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class EjercicioCatorce {
    public EjercicioCatorce()throws IOException {

        System.out.println("EJercicio 14: ");
        System.out.println("Una empresa que contrata personal requiere determinar la edad de las personas que\n" +
                "solicitan trabajo, pero cuando se les realiza la entrevista sólo se les pregunta el año en que\n" +
                "nacieron. Realice el diagrama de flujo y pseudocódigo que representen el algoritmo para\n" +
                "solucionar este problema.");
        String entrada;
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        int edad;
        System.out.println("Ingrese su año de nacimiento: ");
        entrada=leer.readLine();
        edad=Integer.parseInt(entrada);
        Edad edad1=new Edad();
        System.out.println("Su edad es: " +edad1.calcular(edad));
    }
}
