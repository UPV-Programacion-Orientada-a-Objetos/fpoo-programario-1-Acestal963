package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EjercicioDiecisiete {
    public EjercicioDiecisiete()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("EJercicio Diecisiete: ");
        System.out.println("Se requiere determinar la hipotenusa de un triángulo rectángulo. ¿Cómo sería el diagrama\n" +
                "de flujo y el pseudocódigo que representen el algoritmo para obtenerla? Recuerde que\n" +
                "por Pitágoras se tiene que: C2 = A2 + B2.");
        double ca,co;
        System.out.println("Ingrese elcateto adyacente: ");
        entrada=leer.readLine();
        ca= Double.parseDouble(entrada);
        System.out.println("Ingrese elcateto opuesto: ");
        entrada=leer.readLine();
        co= Double.parseDouble(entrada);
        Hipotenusa H=new Hipotenusa();
        System.out.println("Hipotenusa: "+H.H(ca,co));



    }
}
