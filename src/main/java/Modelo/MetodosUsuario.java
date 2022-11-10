package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author santiagoz
 */
public class MetodosUsuario {
    
    public static ConexionBD conexion = new ConexionBD();

    public static PreparedStatement sentenciaPreparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultadoNumero = 0;
    
    
    public int guardar(String nombre, String sexo,String documento, String telefono, String correo, String contraseña){
        int resultado = 0;
        Connection conexion = null;
        String sentenciaGuardar = ("INSERT INTO users (name, document, sex, phone, email, password) VALUES (?,?,?,?,?,?)");
        
        try{
            conexion = ConexionBD.conectar();
            sentenciaPreparada = conexion.prepareStatement(sentenciaGuardar);
            
            sentenciaPreparada.setString(1, nombre);
            sentenciaPreparada.setString(2, documento);
            sentenciaPreparada.setString(3, sexo);
            sentenciaPreparada.setString(4, telefono);
            sentenciaPreparada.setString(5, correo);
            sentenciaPreparada.setString(6, contraseña);
            
            resultado = sentenciaPreparada.executeUpdate();
            sentenciaPreparada.close();
            conexion.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return resultado;
    }
    
        
    public static String buscarDatos(String correo){
        String busqueda = null;
        Connection conexion = null;
        
        try{
            conexion = ConexionBD.conectar();
            String sentenciaBuscar = ("SELECT name, document, sex, phone, email, password FROM users WHERE email= '" + correo + "'");
            sentenciaPreparada = conexion.prepareStatement(sentenciaBuscar);
            resultado = sentenciaPreparada.executeQuery();
            if(resultado.next()){
                String nombre = resultado.getString("name");
                String sexo = resultado.getString("sex");
                String documento = resultado.getString("document");
                String telefono = resultado.getString("phone");
                String email = resultado.getString("email");
                String contraseña = resultado.getString("password");
                busqueda = nombre + "-" + sexo + "-" + documento + "-" + telefono + "-" + email + "-" + contraseña;
            }
            conexion.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
        return busqueda;
    }
    
    
    public static String buscarUsuarioRegistrado(String correo, String contraseña){
        String busquedaUsuario = null;
        Connection conexion = null;
        try{
            conexion = ConexionBD.conectar();
            String sentenciaBuscarUsuario = ("SELECT email, password FROM users WHERE email = '" + correo + "'and password = '" + contraseña + "'");
            sentenciaPreparada = conexion.prepareStatement(sentenciaBuscarUsuario);
            resultado = sentenciaPreparada.executeQuery();
            if(resultado.next()){
                busquedaUsuario = "Usuario encontrado";
            }else{
                busquedaUsuario = "Usuario no encontrado";
            }
            conexion.close(); 
        }catch(Exception e){
            System.out.println(e);
        }
        
        return busquedaUsuario;
    }
    
}
