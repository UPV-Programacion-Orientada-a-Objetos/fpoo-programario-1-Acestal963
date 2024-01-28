package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EjercicioDieciocho {
    public EjercicioDieciocho()throws IOException{
        System.out.println("Ejercicio DIeciocho ");
        System.out.println("La compañía de autobuses “La curva loca” requiere determinar el costo que tendrá el\n" +
                "boleto de un viaje sencillo, esto basado en los kilómetros por recorrer y en el costo por\n" +
                "kilómetro. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para\n" +
                "tal fin.");
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
         double km,precio;
         System.out.println("Ingrese el total de kilometros: ");
         entrada=leer.readLine();
         km=Double.parseDouble(entrada);
         System.out.println("Ingrese el precio por km: ");
         entrada=leer.readLine();
         precio=Double.parseDouble(entrada);
         Precio_Rel_Can total=new Precio_Rel_Can();
         System.out.println("EL costo del viaje es de: $"+total.mul(precio, km));

    }

}
