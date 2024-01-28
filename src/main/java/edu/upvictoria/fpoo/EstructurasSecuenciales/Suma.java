package edu.upvictoria.fpoo.EstructurasSecuenciales;

public class Suma {
    private int int_a, int_b;
    private float f_a, f_b;
    private double d_a, d_b;
    public int sum(int a, int b){
        this.int_a=a;
        this.int_b=b;
        return int_a+int_b;
    }
    public float sum(float a, float b){
        this.f_a=a;
        this.f_b=b;
        return f_a+f_b;
    }

    public double sum(double a,double b){
        this.d_a=a;
        this.d_b=b;
        return d_a+d_b;
    }
}
