package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class PrecioLLmadaTest extends TestCase {
@Test
    public void testTotal() {
    double a=7;
    double b=6;
    PrecioLLmada pr=new PrecioLLmada();
    assertEquals(42.0,pr.total(a,b));
    }
}