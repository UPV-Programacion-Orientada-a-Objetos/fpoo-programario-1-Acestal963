package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.BufferOverflowException;

public class EjercicioDiecinueve {
    public EjercicioDiecinueve()throws IOException{
        System.out.println("Ejercicio DIecinueve");
        System.out.println(" Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra en\n" +
                "bicicleta, considerando que lleva una velocidad constante. Realice un diagrama de flujo y\n" +
                "pseudocódigo que representen el algoritmo para tal fin.");
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        double v,d;
        String entrada;
        System.out.println("Ingrese la velocidad: ");
        entrada=leer.readLine();
        v=Double.parseDouble(entrada);
        System.out.println("Ingrese la distancia: ");
        entrada=leer.readLine();
        d=Double.parseDouble(entrada);
        Tiempo_Rel_Vel_Dis tiempo=new Tiempo_Rel_Vel_Dis();
        System.out.println("EL tiempo en llegar a la siguiente ciudad es de: "+tiempo.tiempo(v,d) +"hrs");
    }
}
