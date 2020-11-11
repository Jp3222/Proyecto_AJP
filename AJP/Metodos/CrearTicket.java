package Metodos;

import java.io.*;
import javax.swing.JOptionPane;

public class CrearTicket {

    public void Crear() throws IOException {
        Relog R = new Relog();

        File MiArchivo;//Para Manipular el archivo.
        PrintWriter Escribir;//Para escribir en el archivo
        R.Fecha();
        R.Hora();
        String Nom = R.Nombre();
        MiArchivo = new File("C:\\Users\\HP\\Desktop\\Tickets\\" + Nom + ".txt");
        if (!MiArchivo.exists()) {
            MiArchivo.createNewFile();
            Escribir = new PrintWriter(MiArchivo, "utf-8");
            Escribir.print("Hola mundo");
            Escribir.close();
            JOptionPane.showMessageDialog(null, "El archivo Fue Creado Exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "El archivo Ya Existe");

        }
    }
}
