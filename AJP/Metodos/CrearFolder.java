package Metodos;

import java.io.*;
import javax.swing.JOptionPane;

public class CrearFolder {

    public void Crear() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        File MiArchivo;//Para Manipular el archivo.
        MiArchivo = new File("C:\\Users\\HP\\Desktop\\Tickets");

        if (!MiArchivo.exists()) {
            MiArchivo.mkdir();
        }
    }
}
