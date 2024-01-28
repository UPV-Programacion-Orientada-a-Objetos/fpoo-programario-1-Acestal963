package edu.upvictoria.fpoo.EstructurasSecuenciales;

import junit.framework.TestCase;

public class Mts_PgdasTest extends TestCase {

    public void testConver() {
        double m=30;
        Mts_Pgdas pr=new Mts_Pgdas();
        assertEquals(1181.1023622047244, pr.conver(m));
    }
}