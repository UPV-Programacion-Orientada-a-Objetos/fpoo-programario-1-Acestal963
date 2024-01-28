package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class EjercicioTrece {
    public EjercicioTrece()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ejercicio Trece");
        System.out.println("Una empresa importadora desea determinar cuántos dólares puede adquirir con equis\n" +
                "cantidad de dinero mexicano. Realice un diagrama de flujo y pseudocódigo que\n" +
                "representen el algoritmo para tal fin.");
        double cantPesos;
        String entrada;
        System.out.println("Ingrese la cantidad de pesos: ");
        entrada=leer.readLine();
        cantPesos=Double.parseDouble(entrada);
Pesos_Dolar total= new Pesos_Dolar();
System.out.println("Total de pesos en dolar: " +total.conversion(cantPesos));
    }
}
