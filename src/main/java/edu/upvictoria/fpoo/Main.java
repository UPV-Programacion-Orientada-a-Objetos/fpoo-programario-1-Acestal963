package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.EstructurasSecuenciales.*;
import edu.upvictoria.fpoo.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import edu.upvictoria.fpoo.EstructurasSecuenciales.EjercicioUno;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int opc=0;
        do{
            System.out.println("---- PROBLEMARIO UNO ----");
            System.out.println("-------------------------");
            System.out.println("1. Suma de dos números");
            System.out.println("2. Promedio de exámen");
            System.out.println("3. Área de un rectángulo");
            System.out.println("4. Área de una circunferencia");
            System.out.println("5. Área de terrenos irregulares" );
            System.out.println("6. Área figura formada por dos triángulos y una semicircunferencia");
            System.out.println("7. Producción de leche");
            System.out.println("8. Distancia entre dos puntos");
            System.out.println("9. Sueldo semanal");
            System.out.println("10. Modista");
            System.out.println("11. CONAGUA");
            System.out.println("12. Área de un triángulo");
            System.out.println("13. peso a dolar");
            System.out.println("14. Edad");
            System.out.println("15. Estacionamiento");
            System.out.println("16. Pinturas");
            System.out.println("17. Hipotenusa");
            System.out.println("18. La curva loca");
            System.out.println("19. Recorido en bicicleta");
            System.out.println("20. Costo de llamada telefónica");
            System.out.println("21. CONAGUA 2.0 ");
            System.out.println("22. Compañía de luz y sombras (CLS)");
            System.out.println("23. Producto con descuento e IVA");
            System.out.println("24. Ahorro anual");
            System.out.println("25. CHEQUE");
            System.out.println("26. Exit");
            System.out.println("Seleccione ejercicio: ");
            entrada=leer.readLine();
            opc=Integer.parseInt(entrada);
            switch(opc){
                case 1:
                    EjercicioUno uno=new EjercicioUno();
                    break;
                case 2:
                    EjercicioDos dos=new EjercicioDos();
                    break;
                case 3:
                    EjercicioTres tres= new EjercicioTres();
                    break;
                case 4:
                    EjercicioCuatro cuatro=new EjercicioCuatro();
                    break;
                case 5:
                    EjercicoCinco cinco=new EjercicoCinco();
                    break;
                case 6:
                    EjercicioSeis seis=new EjercicioSeis();
                    break;
                case 7:
                    EjercicioSiete siete= new EjercicioSiete();
                    break;
                case 8:
                    EjercicioOcho ocho= new EjercicioOcho();
                    break;
                case 9:
                    EjercicioNueve nueve=new EjercicioNueve();
                    break;
                case 10:
                    EjercicioDiez diez= new EjercicioDiez();
                    break;
                case 11:
                    EjercicioOnce once=new EjercicioOnce();
                    break;
                case 12:
                    EjercicioDoce doce=new EjercicioDoce();
                    break;
                case 13:
                    EjercicioTrece trece=new EjercicioTrece();
                    break;
                case 14:
                    EjercicioCatorce catorce=new EjercicioCatorce();
                    break;
                case 15:
                    EjercicioQUince quince=new EjercicioQUince();
                    break;
                case 16:
                    EjercicioDieciseis dieciseis=new EjercicioDieciseis();
                    break;
                case 17:
                    EjercicioDiecisiete diecisiete=new EjercicioDiecisiete();
                    break;
                case 18:
                    EjercicioDieciocho dieciocho=new EjercicioDieciocho();
                    break;
                case 19:
                    EjercicioDiecinueve diecinueve=new EjercicioDiecinueve();
                    break;
                case 20:
                    EjercicioVeinte veinte=new EjercicioVeinte();
                    break;
                case 21:
                    EjercicioVeintiuno veintiuno=new EjercicioVeintiuno();
                    break;
                case 22:
                    EJercicioVeintidos veintidos=new EJercicioVeintidos();
                    break;
                case 23:
                    EjercicioVeintitres veintitres=new EjercicioVeintitres();
                    break;
                case 24:
                    EjercicioVeinticuatro veinticuatro=new EjercicioVeinticuatro();
                    break;
                case 25:
                    EjercicioVeinticinco veinticinco=new EjercicioVeinticinco();
                    break;
                default:
                    break;
            }
        }while(opc!=26);
    }
}