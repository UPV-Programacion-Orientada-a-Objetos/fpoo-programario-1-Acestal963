package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EJercicioVeintidos {
    public EJercicioVeintidos ()throws IOException{
        System.out.println("Ejercicio Veintidos ");
        System.out.println("La compañía de luz y sombras (CLS) requiere determinar el pago que debe realizar una\n" +
                "persona por el consumo de energía eléctrica, la cual se mide en kilowatts (KW). Realice un\n" +
                "diagrama de flujo y pseudocódigo que representen el algoritmo que permita determinar\n" +
                "ese pago.");
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double costoKW, cantKw;
        System.out.println("Ingrese el precio por KW: ");
        entrada=leer.readLine();
        costoKW=Double.parseDouble(entrada);
        System.out.println("Ingrese la cantidad de KW: ");
        entrada=leer.readLine();
        cantKw=Double.parseDouble(entrada);
        Precio_Rel_Can total=new Precio_Rel_Can();
        System.out.println("El pago total es de: $" +total.mul(costoKW,cantKw));
    }
}
