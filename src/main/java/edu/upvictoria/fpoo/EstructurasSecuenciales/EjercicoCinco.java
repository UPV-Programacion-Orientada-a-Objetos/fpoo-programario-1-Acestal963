package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EjercicoCinco{
    public EjercicoCinco() throws IOException{
         System.out.println("Ejercicio 5");
         System.out.println("Una empresa constructora vende terrenos con la forma A de la figura siguiente. Realice un\n" +
                 "algoritmo y represéntelo mediante un diagrama de flujo y el pseudocódigo para obtener el\n" +
                 "área respectiva de un terreno de medidas de cualquier valor, teniendo como entradas conocidas el valor de A y B. ");
         BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
         double A,B,C;
         String entrada;
         System.out.println("Ingrese el valor de A");
         entrada=leer.readLine();
         A=Double.parseDouble(entrada);
         System.out.println("Ingrese el valor de B");
         entrada=leer.readLine();
         B=Double.parseDouble(entrada);
         System.out.println("Ingrese el valor de C");
         entrada=leer.readLine();
         C=Double.parseDouble(entrada);
         double AreaT;
         double D=A-C;
         AreaTriangulo at= new AreaTriangulo();
         AreaT=(B*C) + (at.AreaTriangulo(D,B));
         System.out.println("Area total del area: " +AreaT);
    }
}
