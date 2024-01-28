package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CONAGUATest extends TestCase {
    @Test
    public void testTotal() {
        double a=8;
        double b=9.7;
        CONAGUA prueba=new CONAGUA();
        assertEquals(77.6, prueba.total(a,b));

    }
}