package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author santiagoz
 */
public class ConexionBD {

    
    public static String base = "motivandoJovenes";
    public static String url = "jdbc:mysql://localhost/";
    public static String user = "root";
    public static String contraseña = "Zz123sS";
    public static String clase = "com.mysql.cj.jdbc.Driver";

    public static Connection conectar() {
        Connection conexion = null;

        try {
            Class.forName(clase);
            conexion = DriverManager.getConnection(url+base, user, contraseña);
            System.out.println("Conexion Establecida");
        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(e);

        }
        return conexion;
    }

}
