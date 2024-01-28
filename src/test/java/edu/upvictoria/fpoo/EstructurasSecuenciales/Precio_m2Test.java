package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class Precio_m2Test extends TestCase {
@Test
    public void testTotal() {
        double precio=89;
        double m=90;
        Precio_m2 pr=new Precio_m2();
        assertEquals(8010.0, pr.total(precio,m));
    }
}