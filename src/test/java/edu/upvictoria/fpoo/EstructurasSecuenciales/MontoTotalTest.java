package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class MontoTotalTest extends TestCase {
@Test
    public void testTotal() {
      double comida=100;
      double hotel=400;
      double gastos=100;
      double dias=4;
      MontoTotal pr=new MontoTotal();
      assertEquals(2400.0,pr.total(comida,hotel,gastos,dias));
    }
}