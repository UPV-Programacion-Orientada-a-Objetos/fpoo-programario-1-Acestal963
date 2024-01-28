package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumaTest extends TestCase {
    @Test
    public void sum() {
        double a=10;
        double b=9;
        Suma s=new Suma();
        assertEquals(19.0, s.sum(a,b));
    }

}