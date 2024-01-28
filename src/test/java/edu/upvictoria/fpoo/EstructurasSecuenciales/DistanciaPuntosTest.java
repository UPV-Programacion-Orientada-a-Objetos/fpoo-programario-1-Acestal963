package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class DistanciaPuntosTest extends TestCase {
@Test
    public void testDistancia() {
        int x1=4;
        int x2=2;
        int y1=-3;
        int y2=5;
        DistanciaPuntos pr=new DistanciaPuntos();
        assertEquals(8.246211251235321, pr.Distancia(x1,x2,y1,y2));
    }
}