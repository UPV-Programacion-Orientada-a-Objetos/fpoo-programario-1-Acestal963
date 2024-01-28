package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class EdadTest extends TestCase {
@Test
    public void testCalcular() {
        int edad=2004;
        Edad pr=new Edad();
        assertEquals(20,pr.calcular(edad));
    }
}