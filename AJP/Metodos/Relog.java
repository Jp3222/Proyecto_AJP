package Metodos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

public class Relog implements Runnable {

    private String Hora, Min, seg, Año, Mes, Dia;
    private String Horas, Fecha;
    Thread hilo;
    public String Nombre;

    public Relog() {
        hilo = new Thread(this);
        hilo.start();
    }

    public void Fecha() {
        Date D = new Date();
        Calendar C = new GregorianCalendar();
        Año = C.get(Calendar.YEAR) > 9 ? "" + C.get(Calendar.YEAR) : "0" + C.get(Calendar.YEAR);
        Mes = C.get(Calendar.MONTH) > 9 ? "" + C.get(Calendar.MONTH) : "0" + C.get(Calendar.MONTH);
        Dia = C.get(Calendar.DAY_OF_MONTH) > 9 ? "" + C.get(Calendar.DAY_OF_MONTH) : "0" + C.get(Calendar.DAY_OF_MONTH);
        Fecha = Año + "-" + Mes + "-" + Dia;
    }

    public void Hora() {

        Date D = new Date();
        Calendar C = new GregorianCalendar();
        Hora = C.get(Calendar.HOUR_OF_DAY) > 9 ? "" + C.get(Calendar.HOUR_OF_DAY) : "0" + C.get(Calendar.HOUR_OF_DAY);
        Min = C.get(Calendar.MINUTE) > 9 ? "" + C.get(Calendar.MINUTE) : "0" + C.get(Calendar.MINUTE);
        seg = C.get(Calendar.SECOND) > 9 ? "" + C.get(Calendar.SECOND) : "0" + C.get(Calendar.SECOND);
        Horas = Hora + "-" + Min + "-" + seg;
    }

    public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
            Fecha();
            Hora();
        }
    }

    public String Nombre() {
        return "" + Horas + "_" + Fecha + "";
    }
}
