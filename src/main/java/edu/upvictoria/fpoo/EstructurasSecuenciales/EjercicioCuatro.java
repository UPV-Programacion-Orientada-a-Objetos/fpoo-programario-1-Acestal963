package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EjercicioCuatro {
    public EjercicioCuatro()throws IOException{
        System.out.println("Ejercicio 4");
        System.out.println("Se requiere obtener el área de una circunferencia. Realizar el algoritmo correspondiente y\n" +
                "representarlo mediante un diagrama de flujo y el pseudocódigo correspondiente.");
        String entrada;
        BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
        double radio;
        System.out.println("Ingrese el radio");
        entrada=leer.readLine();
        radio=Double.parseDouble(entrada);
        AreaCIrcunferencia area= new AreaCIrcunferencia();
        System.out.println("Area de la circunferencia: "   +area.area(radio));

    }
}
