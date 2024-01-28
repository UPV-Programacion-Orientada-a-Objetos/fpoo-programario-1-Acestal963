package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;

public class Precio_Rel_CanTest extends TestCase {

    public void testMul() {
        double a=9;
        double b=2;
        Precio_Rel_Can pre=new Precio_Rel_Can();
        assertEquals(18.0,pre.mul(a,b));
    }
}