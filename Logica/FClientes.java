
package Logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Datos.*;
/**
 *
 * @author Marcos
 */
public class FClientes extends Conexion{
    
    public void CargarEdades(JComboBox CBEdades){
        //Carga las edades en el Combobox
        CBEdades.removeAllItems(); //limpia todos los registros
        int desde = 1;
        int hasta = 50;
        
        for(desde = 1; desde <= hasta; desde++){
            CBEdades.addItem(desde);
        }
    }
    
    public void CargarLocalidades(JComboBox CBLocalidad){
        
        ResultSet RS;
        String Consulta = "Select *from localidades";
        try {
            Conectar();
            Statement Comando;
            Comando = Conector.createStatement();
            RS = Comando.executeQuery(Consulta);
            
            CBLocalidad.removeAllItems(); //limpiamos todo lo que hay en el combo
            //recorremos el ResultSet y comenzamos a llenar el combo
            while (RS.next()){
                CBLocalidad.addItem(new Datos.ComboLocalides(RS.getInt("IDLocalidad"), RS.getString("Localidad")));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public DefaultTableModel CargarGrilla(){
        DefaultTableModel Modelo = new DefaultTableModel();
        ResultSet RS;
        ResultSetMetaData RSMD;
        Statement Comando;
        String Consulta = "Select c.IDCliente as 'Cliente', c.Nombre, c.Apellido,c.Edad, l.Localidad,c.Telefono,c.Domicilio from clientes as c Inner Join localidades as l on c.Localidad = l.IDLocalidad";
        
        try {
            Conectar();
            Comando = Conector.createStatement();
            RS = Comando.executeQuery(Consulta);
            RSMD = RS.getMetaData();
            //averiguamos el nombre de las columnas
            int Columnas = RSMD.getColumnCount();
            for(int i = 1; i <= Columnas; i++){
                Modelo.addColumn(RSMD.getColumnLabel(i));
            }
            
            while(RS.next()){
                Object Fila[] = new Object[Columnas]; //creamos un array con las columnas
                for(int a = 0; a < Columnas; a++){
                   Fila[a] = RS.getObject(a + 1);
                }
                Modelo.addRow(Fila);
            }
            return Modelo;
        } catch (Exception e) {
            return null;
        }
        
    }
    //Realizamos Insert en la base de datos
    public void RegistrarCliente(VClientes Dato){
        String Consulta = "Insert Into clientes(Nombre,Apellido,Edad,Localidad,Telefono,Domicilio) values(?,?,?,?,?,?)";
        PreparedStatement Comando;
        
        try {
            Conectar();
            Comando = Conector.prepareStatement(Consulta);
            //pasamos parametros al Comando
            Comando.setString(1, Dato.getNombre());
            Comando.setString(2, Dato.getApellido());
            Comando.setInt(3,Dato.getEdad());
            Comando.setInt(4, Dato.getLocalidad());
            Comando.setString(5, Dato.getTelefono());
            Comando.setString(6, Dato.getDomicilio());
            
            int Resultado = Comando.executeUpdate();
            //Verifica si el insert se realizó con exito
            if(Resultado != 0){
                JOptionPane.showMessageDialog(null, "Cliente registrado con exito","Aviso", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Error al registrar el cliente, intente nuevamente","Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public void ModificarCliente(VClientes Dato){
        String Consulta = "Update clientes set Nombre=?, Apellido=?, Edad=?, Localidad=?, Telefono=?, Domicilio=? Where IDCliente=?";
        PreparedStatement Comando;
        try {
            Conectar();
            Comando = Conector.prepareStatement(Consulta);
            //pasamos los parametros
            Comando.setString(1, Dato.getNombre());
            Comando.setString(2, Dato.getApellido());
            Comando.setInt(3, Dato.getEdad());
            Comando.setInt(4, Dato.getLocalidad());
            Comando.setString(5, Dato.getTelefono());
            Comando.setString(6, Dato.getDomicilio());
            //pasamos el IDCliente como ultimo parametro para la clausula Where
            Comando.setInt(7, Dato.getIDCliente());
            
            int Resultado = Comando.executeUpdate();
            //verificamos si se modificó con exito
            if(Resultado != 0){
                JOptionPane.showMessageDialog(null, "Cliente modificado con exito","Aviso", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar cliente, intente nuevamente","Aviso", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public void EliminarCliente(int IDCliente){
        String Consulta = "Delete from clientes Where IDCliente="+IDCliente;
        Statement Comando;
        try {
            Conectar();
            Comando = Conector.createStatement();
            int Resultado = Comando.executeUpdate(Consulta);
            
            if(Resultado != 0){
                JOptionPane.showMessageDialog(null, "El cliente fue el eliminado con exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "El cliente fue el eliminado con exito","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public int ObtenerIDLocalidad(String Localidad){
        String Consulta = "Select IDLocalidad from localidades Where Localidad ='"+ Localidad+"'";
        Statement Comando;
        ResultSet RS;
        try {
            Conectar();
            Comando = Conector.createStatement();
            int IDLocalidad = 0;
            RS = Comando.executeQuery(Consulta);
            if(RS != null){
                while (RS.next()){
               IDLocalidad = (int) RS.getInt("IDLocalidad");
                    }
            }
           IDLocalidad = IDLocalidad - 1;
           return IDLocalidad;
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return 0;
        }
    }
    
}
