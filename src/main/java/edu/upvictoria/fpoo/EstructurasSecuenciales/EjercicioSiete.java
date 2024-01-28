package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EjercicioSiete {
    public EjercicioSiete() throws IOException{
        System.out.println("Ejercicio 7: ");
        System.out.println("Un productor de leche lleva el registro de lo que produce en litros, pero cuando entrega le\n" +
                "pagan en galones. Realice un algoritmo, y represéntelo mediante un diagrama de flujo y el\n" +
                "pseudocódigo, que ayude al productor a saber cuánto recibirá por la entrega de su\n" +
                "producción de un día (1 galón = 3.785 litros).");
               BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
               double litros;
               String entrada;
               System.out.println("Ingrese la cantidad de litros");
               entrada=leer.readLine();
               litros=Double.parseDouble(entrada);
               Litro_A_Galon converr= new Litro_A_Galon();
               System.out.println("Total en galones: "+converr.conversion(litros));
    }
}
