package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EjercicioVeinticuatro {
    public EjercicioVeinticuatro ()throws IOException {
        System.out.println("Ejercicio Veinticinco");
        System.out.println("Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para\n" +
                "determinar cuánto dinero ahorra una persona en un año si considera que cada semana\n" +
                "ahorra 15% de su sueldo (considere cuatro semanas por mes y que no cambia el sueldo).*");
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double sueldo, ahorro;
        System.out.println("Ingrese su sueldo semanal: ");
        entrada=leer.readLine();
        sueldo=Double.parseDouble(entrada);
        System.out.println("Ingrese su ahorro semanal: ");
        entrada=leer.readLine();
        ahorro=Double.parseDouble(entrada);
        AHORRO Total=new AHORRO();
        System.out.println("Total anual: " +Total.totalahorro(sueldo,ahorro));
    }

}
