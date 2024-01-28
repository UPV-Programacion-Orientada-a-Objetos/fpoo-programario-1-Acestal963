package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EjercicioVeinte {
    public EjercicioVeinte()throws IOException{
        System.out.println("Ejercicio Veinte");
        System.out.println("Se requiere determinar el costo que tendrá realizar una llamada telefónica con base en el\n" +
                "tiempo que dura la llamada y en el costo por minuto. Realice un diagrama de flujo y\n" +
                "pseudocódigo que representen el algoritmo para tal fin.");
        BufferedReader leer=new BufferedReader((new InputStreamReader(System.in)));
        String entrada;
        double costo,tiempo;
        System.out.println("Ingrese el costo por minuto");
        entrada=leer.readLine();
        costo=Double.parseDouble(entrada);
        System.out.println("Ingrese la duración en minutos");
        entrada=leer.readLine();
        tiempo=Double.parseDouble(entrada);
        PrecioLLmada total=new PrecioLLmada();
        System.out.println("EL costo de la llamada es de: $" +total.total(costo, tiempo));

    }
}
