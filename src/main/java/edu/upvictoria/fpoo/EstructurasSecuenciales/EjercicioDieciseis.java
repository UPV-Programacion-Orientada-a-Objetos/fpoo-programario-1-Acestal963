package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDieciseis {
    public  EjercicioDieciseis()throws IOException{
        System.out.println("Ejercicio Dieciseis");
        System.out.println(" Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura.\n" +
                "Considere que se cobra por m2 y realice un diagrama de flujo y pseudocódigo que\n" +
                "representen el algoritmo que le permita ir generando presupuestos para cada cliente.");
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double m2, precio;
        int opc=0;
        do {
            System.out.println("Ingrese el total de m2: ");
            entrada = leer.readLine();
            m2 = Double.parseDouble(entrada);
            System.out.println("Ingrese el precio por m2: ");
            entrada = leer.readLine();
            precio = Double.parseDouble(entrada);
            Precio_m2 total = new Precio_m2();
            System.out.println("Total a pagar: " +total.total(precio,m2));
            System.out.println("Gnererar nuevo presupuesto?(1=SI, 2=NO )");
            entrada=leer.readLine();
            opc=Integer.parseInt(entrada);
        }while(opc==1);

    }
}
