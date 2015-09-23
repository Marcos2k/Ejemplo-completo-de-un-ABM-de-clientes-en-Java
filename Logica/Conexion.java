
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    /*En esta clase unicamente se manejan los metodos para conectar y desconectar la base de datos*/
    private String Cadena = "jdbc:mysql://localhost/clientes";
    private String User = "root";
    private String Password = "";
    
    Connection Conector;
    
    public void Conectar(){
        try {
            //registramos driver
            Class.forName("com.mysql.jdbc.Driver");
            Conector = DriverManager.getConnection(Cadena,User,Password);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
        
    }
    
    public void Desconectar(){
        try {
            if(!Conector.isClosed()){
                Conector.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
