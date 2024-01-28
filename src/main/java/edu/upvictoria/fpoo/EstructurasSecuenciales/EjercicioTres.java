package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EjercicioTres {
    public EjercicioTres() throws IOException {
        System.out.println("Ejercicio 3: ");
        System.out.println("  Se requiere conocer el área de un rectángulo. Realice un algoritmo para tal fin y\n" +
                "represéntelo mediante un diagrama de flujo y el pseudocódigo para realizar este proceso.");
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double a;
        double l;
        System.out.println("Ingrese el ancho: ");
        entrada=leer.readLine();
        a=Double.parseDouble(entrada);
        System.out.println("Ingrese el largo: ");
        entrada=leer.readLine();
        l=Double.parseDouble(entrada);
        System.out.println("Área del rectangulo: " +(l*a));

    }
}
