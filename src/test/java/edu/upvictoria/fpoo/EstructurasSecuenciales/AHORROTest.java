package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.Test;

public class AHORROTest extends TestCase {
    @Test
    public void prueba1(){
        double ahorro=15;
        double sueldp=1000;
        AHORRO prueba=new AHORRO();
        assertEquals(7200.0,prueba.totalahorro(1000,15));
    }

}