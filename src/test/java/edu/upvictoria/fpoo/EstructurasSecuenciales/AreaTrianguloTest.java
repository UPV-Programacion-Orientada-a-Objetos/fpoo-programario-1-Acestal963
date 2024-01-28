package edu.upvictoria.fpoo.EstructurasSecuenciales;

import org.junit.Test;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import static org.junit.Assert.*;

public class AreaTrianguloTest {
    @Test
    public void areaTriangulo() throws IOException {
        double a=2;
        double b=4;
        AreaTriangulo area=new AreaTriangulo();
        assertEquals(16,  area.AreaTriangulo(a,b));
    }
}