package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EjercicioVeintitres {
    public EjercicioVeintitres() throws IOException{
        System.out.println("EJercicio Veintitres: ");
        System.out.println("Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para\n" +
                "determinar cuánto pagará finalmente una persona por un artículo equis, considerando\n" +
                "que tiene un descuento de 20%, y debe pagar 15% de IVA (debe mostrar el precio con\n" +
                "descuento y el precio final).");
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double descuento,IVA, precio;
        System.out.println("Ingrese el precio: ");
        entrada=leer.readLine();
        precio=Double.parseDouble(entrada);
        System.out.println("Ingrese el descuento: ");
        entrada=leer.readLine();
        descuento=Double.parseDouble(entrada);

        IVA P_IVA=new IVA();
        double precion;
        precion=P_IVA.IVA(precio);
        Precio_Descuento des=new Precio_Descuento();
        System.out.println("El precio del articulo sin descuento $" +precion);
        System.out.println("EL precio del articulo con el descuento $" +des.descuento(precion,descuento));

    }
}
