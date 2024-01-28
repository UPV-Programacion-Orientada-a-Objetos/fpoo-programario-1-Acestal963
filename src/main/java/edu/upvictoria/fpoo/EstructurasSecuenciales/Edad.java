package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.util.Calendar;
public class Edad  {
    public int calcular(int a){
        Calendar cal= Calendar.getInstance();
        int year=cal.get(Calendar.YEAR);
        return(year-a);
    }
}
