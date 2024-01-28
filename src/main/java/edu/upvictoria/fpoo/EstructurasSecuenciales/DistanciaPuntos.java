package edu.upvictoria.fpoo.EstructurasSecuenciales;
import static java.lang.Math.sqrt;

public class DistanciaPuntos {
    public double Distancia(double x1,double x2, double y1, double y2){
       double d1=(x2-x1);
       double d2=(y2-y1);
        return sqrt((d1*d1)+(d2*d2));

    }
}
