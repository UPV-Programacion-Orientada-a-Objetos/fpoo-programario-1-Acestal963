package edu.upvictoria.fpoo.EstructurasSecuenciales;

public class Precio_Descuento {

    public double descuento(double precio,double porcen ){

        return (precio-((porcen/100)*precio));
    }
}
