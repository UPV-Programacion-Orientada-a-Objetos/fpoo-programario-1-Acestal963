package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class Pesos_DolarTest extends TestCase {
@Test
    public void testConversion() {
      double ps=230;
      Pesos_Dolar pr=new Pesos_Dolar();
      assertEquals(3946.8, pr.conversion(ps));
    }
}