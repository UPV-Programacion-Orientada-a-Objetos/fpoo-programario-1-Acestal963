package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class EjercicioVeinticinco {
    public EjercicioVeinticinco()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Veinticinco");
        System.out.println("Una empresa desea determinar el monto de un cheque que debe proporcionar a uno de\n" +
                "sus empleados que tendrá que ir por equis número de días a la ciudad de Monterrey; los\n" +
                "gastos que cubre la empresa son: hotel, comida y 100.00 pesos diarios para otros gasto.\n" +
                "El monto debe estar desglosado para cada concepto. Realice un diagrama de flujo y\n" +
                "pseudocódigo que representen el algoritmo que determine el monto del cheque.");
        double hotel,comida,gasto, dias;
        System.out.println("Ingrese el costo del hotel por dia: ");
        entrada=leer.readLine();
        hotel=Double.parseDouble(entrada);
        System.out.println("Ingrese el monto de la comida diaria: ");
        entrada=leer.readLine();
        comida=Double.parseDouble(entrada);
        System.out.println("Ingrese el monto de gastos otros diarios: ");
        entrada=leer.readLine();
        gasto=Double.parseDouble(entrada);
        System.out.println("Ingrese los dias de viaje: ");
        entrada=leer.readLine();
        dias=Double.parseDouble(entrada);
        MontoTotal total=new MontoTotal();
        System.out.println("EL monto total es de: $" +total.total(comida,hotel,gasto,dias));
    }
}
