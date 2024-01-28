package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;

public class Litro_A_GalonTest extends TestCase {

    public void testConversion() {
        double lit=23.70;
        Litro_A_Galon pr=new Litro_A_Galon();
        assertEquals(6.2615587941, pr.conversion(lit));
    }
}