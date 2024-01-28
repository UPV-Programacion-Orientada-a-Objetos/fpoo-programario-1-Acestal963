package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HipotenusaTest extends TestCase {
@Test
    public void testH() {
      double ca=5;
      double co=9;
      Hipotenusa pr=new Hipotenusa();
      assertEquals(10.295630140987,pr.H(ca,co));
    }
}