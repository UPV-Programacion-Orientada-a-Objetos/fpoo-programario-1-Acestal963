package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CostoFInalTest extends TestCase {
@Test
    public void testCosto() {
      double precio=900;
      double hora=29;
      CostoFInal prueba=new CostoFInal();
      assertEquals(26100.0, prueba.costo(precio,hora));
    }
}