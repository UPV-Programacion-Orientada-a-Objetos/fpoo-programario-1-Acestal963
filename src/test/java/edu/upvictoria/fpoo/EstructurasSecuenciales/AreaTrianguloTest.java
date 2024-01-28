package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;

public class AreaTrianguloTest extends TestCase {

    public void testAreaTriangulo() {
        double a=8;
        double b=9;
        AreaTriangulo pr=new AreaTriangulo();
        assertEquals(36.0, pr.AreaTriangulo(a,b));
    }
}