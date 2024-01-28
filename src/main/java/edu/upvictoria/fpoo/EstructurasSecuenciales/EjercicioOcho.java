package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.Buffer;

public class EjercicioOcho {
    public EjercicioOcho()throws IOException{
        BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("EJercicio Ocho");
        System.out.println("Se requiere obtener la distancia entre dos puntos en el plano cartesiano, tal y como se\n" +
                "muestra en la figura siguiente. Realice un diagrama de flujo y pseudocódigo que\n" +
                "representen el algoritmo para obtener la distancia entre esos puntos.");
        double x1,x2,y1,y2;
        System.out.println("Ingrese x1 de P1: ");
        entrada= leer.readLine();
        x1=Double.parseDouble(entrada);
        System.out.println("Ingrese y1 de P1: ");
        entrada= leer.readLine();
        y1=Double.parseDouble(entrada);
        System.out.println("Ingrese x2 de P2: ");
        entrada= leer.readLine();
        x2=Double.parseDouble(entrada);
        System.out.println("Ingrese y2 de P2: ");
        entrada= leer.readLine();
        y2=Double.parseDouble(entrada);
        DistanciaPuntos distancia=new DistanciaPuntos();
        System.out.println("Distancia entre P1 y P2: " + distancia.Distancia(x1,x2,y1,y2));
    }

}
