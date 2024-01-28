package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioQUince {
    public EjercicioQUince ()throws IOException{
        System.out.println("Ejercicio Quince");
        System.out.println("Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo\n" +
                "utilizan. Considere que el cobro es con base en las horas que lo disponen y que las\n" +
                "fracciones de hora se toman como completas y realice un diagrama de flujo y\n" +
                "pseudocódigo que representen el algoritmo que permita determinar el cobro.");
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        CostoFInal total=new CostoFInal();
        double hora;
        double precio;
        System.out.println("Ingrese el precio por hora");
        entrada=leer.readLine();
        precio=Double.parseDouble(entrada);
        System.out.println("Ingrese el total de horas");
        entrada=leer.readLine();
        hora=Double.parseDouble(entrada);
        System.out.println("Su total a pagar es de: " +total.costo(precio,hora));


    }
}
