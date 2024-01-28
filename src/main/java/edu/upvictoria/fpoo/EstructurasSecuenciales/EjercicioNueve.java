package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.IOException;
public class EjercicioNueve {
   public EjercicioNueve() throws IOException{
       BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
       String entrada;
       System.out.println("Ejercicio 8");
       System.out.println("Se requiere determinar el sueldo semanal de un trabajador con base en las horas que\n" +
               "trabaja y el pago por hora que recibe. Realice el diagrama de flujo y el pseudocódigo que\n" +
               "representen el algoritmo de solución correspondiente.");
       double horas;
       double pago;
       System.out.println("Ingrese el pago por hora");
       entrada=leer.readLine();
       pago=Double.parseDouble(entrada);
       System.out.println("Ingrese horas trabajadas");
       entrada=leer.readLine();
       horas=Double.parseDouble(entrada);
       System.out.println("Suedlo semanal: " +(horas*pago));
   }


}
