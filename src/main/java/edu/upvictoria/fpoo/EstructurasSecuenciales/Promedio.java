package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Promedio {

    public double prom(int n)throws IOException{
        BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double sumatoria=0;
        Suma s=new Suma();

        for(int i=0;i<n;i++){
            double cal;
            entrada=leer.readLine();
            cal= Double.parseDouble(entrada);
            sumatoria=s.sum(cal,sumatoria);
        }
        System.out.println("Promedio: " +(sumatoria/n));
        return 0;
    }
}
