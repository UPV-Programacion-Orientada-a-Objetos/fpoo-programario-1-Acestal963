package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EjercicioDoce {
    public void EJercicioDoce() throws IOException{
        BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio 12: ");
        System.out.println(" Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para obtener el\n" +
                "área de un triángulo.");
        double altura;
        double base;
        System.out.println("Ingrese la altura del triangulo; ");
        entrada=leer.readLine();
        altura=Double.parseDouble(entrada);
        System.out.println("Ingrese la base del triangulo; ");
        entrada=leer.readLine();
        base=Double.parseDouble(entrada);
       AreaTriangulo area= new AreaTriangulo();
       System.out.println("El area del triangulo es: "+area.AreaTriangulo(altura, base));

    }
}
