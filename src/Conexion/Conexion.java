package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/provemax";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER= "org.mariadb.jdbc.Driver";
    private static Conexion conexion = null;
    
    public Conexion(){
        try {
            Class.forName(DRIVER);
           
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el driver");
        }
    }
    
    public static Connection getConexion(){
        Connection con = null;
        
        if (conexion == null){
            conexion = new Conexion();
            
        } try {
            con = DriverManager.getConnection(URL + "?userLegacyDatatimeCode=false&serverTimezone=UTC" + "&user="+ USUARIO + "&password="+ PASSWORD);
            //aqui tambien hay una locura
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        return con;
    }
                   
}
