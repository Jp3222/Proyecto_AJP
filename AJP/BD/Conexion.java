package BD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private static Connection cn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/ajp_2";

    public Conexion() {
        cn = null;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de conexion");
        }
    }

    public Connection getConnection() {
        return cn;
    }

    public void desconectar() {
        cn = null;
        if (cn == null) {
            JOptionPane.showMessageDialog(null, "Conexion Terminada");
        }
    }
}
