package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioDiez {
    public EjercicioDiez() throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio 10: ");
        System.out.println("Una modista, para realizar sus prendas de vestir, encarga las telas al extranjero. Para cada\n" +
                "pedido, tiene que proporcionar las medidas de la tela en pulgadas, pero ella generalmente\n" +
                "las tiene en metros. Realice un algoritmo para ayudar a resolver el problema,\n" +
                "determinando cuántas pulgadas debe pedir con base en los metros que requiere.\n" +
                "Represéntelo mediante el diagrama de flujo y el pseudocódigo (1 pulgada = 0.0254 m).");
        Mts_Pgdas total=new Mts_Pgdas();
        double mts;
        System.out.println("Ingrese la cantidad de metros: ");
        entrada=leer.readLine();
        mts=Double.parseDouble(entrada);
        System.out.println("Total de pulgadas: " + total.conver(mts));

    }
}
