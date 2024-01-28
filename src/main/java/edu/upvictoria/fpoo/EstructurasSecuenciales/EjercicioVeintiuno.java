package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioVeintiuno {
    public EjercicioVeintiuno() throws IOException{
        System.out.println("Ejercicio Veintiuno");
        System.out.println("La CONAGUA requiere determinar el pago que debe realizar una persona por el total de\n" +
                "metros cúbicos que consume de agua. Realice un diagrama de flujo y pseudocódigo que\n" +
                "representen el algoritmo que permita determinar ese pago.");
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double precio, m3;
        System.out.println("Ingrese el precio por m cúbico: ");
        entrada=leer.readLine();
        precio=Double.parseDouble(entrada);
        System.out.println("Ingrese el total de metros cúbicos: ");
        entrada=leer.readLine();
        m3=Double.parseDouble(entrada);
        CONAGUA tot=new CONAGUA();
        System.out.println("El total a pagar es de: $" + tot.total(precio,m3));


    }
}
