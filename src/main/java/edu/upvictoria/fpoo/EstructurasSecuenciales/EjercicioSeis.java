package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EjercicioSeis {
    public EjercicioSeis() throws IOException{
        System.out.println("EJercicio 6");
            System.out.println("Se requiere obtener el área de la figura siguiente de la forma A. Para resolver este\n" +
                    "problema se puede partir de que está formada por tres figuras: dos triángulos rectángulos,\n" +
                    "con H como hipotenusa y R como uno de los catetos, que también es el radio de la otra\n" +
                    "figura, una semicircunferencia que forma la parte circular (ver forma B). Realice un\n" +
                    "algoritmo para resolver el problema y represéntelo mediante el diagrama de flujo y el\n" +
                    "pseudocódigo.");
            BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
            double h;
            double r;
            String entrada;
            System.out.println("Ingrese la Hipotenusa: ");
            entrada=leer.readLine();
            h=Double.parseDouble(entrada);
            System.out.println("Ingrese el radio: ");
            entrada=leer.readLine();
            r=Double.parseDouble(entrada);
        AreaTriangulo A_T= new AreaTriangulo();
        AreaCIrcunferencia A_C=new AreaCIrcunferencia();
        Double area;
        area=(A_T.AreaTriangulo(h,r)*2)+(A_C.area(r)/2);
        System.out.println("EL area total: " +area);




    }
}
