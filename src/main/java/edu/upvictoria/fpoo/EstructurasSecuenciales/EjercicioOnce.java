package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioOnce {
    public EjercicioOnce() throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio 11");
        System.out.println("La conagua requiere determinar el pago que debe realizar una persona por el total de\n" +
                "metros cúbicos que consume de agua al llenar una alberca (ver figura ). Realice un\n" +
                "algoritmo y represéntelo mediante un diagrama de flujo y el pseudocódigo que permita determinar ese pago.");
         double ancho;
         double largo;
         double alto;
         double precio;
         System.out.println("Introduzca costo de agua por m3: ");
         entrada=leer.readLine();
         precio=Double.parseDouble(entrada);
         System.out.println("Introduza el ancho de la alberca: ");
         entrada=leer.readLine();
         ancho=Double.parseDouble(entrada);
         System.out.println("Introduzca el largo de la alberca: ");
         entrada=leer.readLine();
         largo=Double.parseDouble(entrada);
        System.out.println("Introduzca lo alto de la alberca: ");
        entrada=leer.readLine();
        alto=Double.parseDouble(entrada);
         System.out.println("Precio total del agua: " +( alto*largo*ancho*precio));
    }

}
