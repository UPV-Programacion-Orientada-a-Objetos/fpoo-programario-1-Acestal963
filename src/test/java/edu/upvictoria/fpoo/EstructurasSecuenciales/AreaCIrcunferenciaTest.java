package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.Test;

public class AreaCIrcunferenciaTest extends TestCase {
@Test
    public void testArea() {
       double radio=5.4;
       AreaCIrcunferencia test=new AreaCIrcunferencia();
       assertEquals(91.609056, test.area(radio));
    }
}