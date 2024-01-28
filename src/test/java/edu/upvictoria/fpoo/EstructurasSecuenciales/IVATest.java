package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class IVATest extends TestCase {
@Test
    public void testIVA() {
     double precio=200;
     IVA pr=new IVA();
     assertEquals(230.0,pr.IVA(precio));
    }
}