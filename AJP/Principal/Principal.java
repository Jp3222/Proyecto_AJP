package Principal;

import java.sql.*;
import BD.Conexion;
import Ventanas.Login;

public class Principal {

    public static void main(String[] args) {
        Login L = new Login();
        Conexion C = new Conexion();
        if (C.getConnection() != null) {
            System.out.println("Conexion establecida");
        }
        L.setVisible(true);
    }
}
