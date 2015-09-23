
package Presentacion;

import javax.swing.JOptionPane;
import Logica.*;
import Datos.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */
public class FrmClientes extends javax.swing.JFrame {

    /**
     * Creates new form FrmClientes
     */
    public FrmClientes() {
        initComponents();
        LblIDCliente.setText(""); //limpiamos el IDCliente
        LblIDCliente.setVisible(false); //ocultamos lblidcliente
        BtnModificar.setEnabled(false);
        BtnEliminar.setEnabled(false);
        FClientes Objeto = new FClientes();
        Objeto.CargarEdades(CBEdad);
        Objeto.CargarLocalidades(CBLocalidad);
        CargarGrilla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TBNombre = new javax.swing.JTextField();
        TBApellido = new javax.swing.JTextField();
        CBEdad = new javax.swing.JComboBox();
        CBLocalidad = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        TBTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TBDomicilio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Grilla = new javax.swing.JTable();
        BtnRegistrar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        LblIDCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Edad");

        jLabel4.setText("Localidad");

        TBNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBNombreActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono");

        jLabel6.setText("Domicilio");

        Grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Grilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrillaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Grilla);

        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        LblIDCliente.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CBLocalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TBNombre)
                                .addComponent(TBApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addComponent(CBEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TBDomicilio)
                                .addComponent(TBTelefono))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(LblIDCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TBNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TBApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CBEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CBLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TBTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TBDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnRegistrar)
                            .addComponent(BtnModificar)
                            .addComponent(BtnEliminar)
                            .addComponent(LblIDCliente))
                        .addGap(0, 11, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBNombreActionPerformed

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        if(BtnRegistrar.getText().equals("Nuevo")){
            Limpiar();
            BtnRegistrar.setText("Registrar");
            BtnRegistrar.setEnabled(true);
        }else{
        //Validamos que se hayan completado los datos primero
        if (TBNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el nombre");
            return;
        }

        if (TBApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el apellido");
            return;
        }

        if (TBTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el telefono");
            return;
        }

        if (TBDomicilio.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el domicilio");
            return;
        }
        
        String Nombre = TBNombre.getText();
        String Apellido = TBApellido.getText();
        //tomamos la edad del combo box y realizamos conversiones
        int Edad = (int) CBEdad.getSelectedItem();
        //tomamos la localidad seleccionada
        ComboLocalides LocalidadSeleccionada = (ComboLocalides) CBLocalidad.getItemAt(CBLocalidad.getSelectedIndex());
        String Localidad = String.valueOf(LocalidadSeleccionada.getIDLocalidad());
        int IDLocalidad = Integer.parseInt(Localidad);

        String Telefono = TBTelefono.getText();
        String Domilicio = TBDomicilio.getText();

        //Preguntamos si quiere registrar el Cliente
        int Pregunta = JOptionPane.showOptionDialog(this,
                "¿Deseas registrar cliente?",
                "Seleccione una opcion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Si", "No"}, // null para YES, NO y CANCEL
                "Si");
        if (Pregunta == 0) {
            //Si confirma procede
            //pasamos los valores al objeto VClientes
            VClientes Dato = new VClientes();
            FClientes Funcion = new FClientes();

            Dato.setNombre(Nombre);
            Dato.setApellido(Apellido);
            Dato.setEdad(Edad);
            Dato.setLocalidad(IDLocalidad);
            Dato.setTelefono(Telefono);
            Dato.setDomicilio(Domilicio);
            //Realizamos Insert en la base de datos registrando a un cliente
            Funcion.RegistrarCliente(Dato);
            Limpiar();
            CargarGrilla(); //Refrescamos la grilla
        } else {
            JOptionPane.showMessageDialog(null, "Se cancelado el registro", "Aviso",JOptionPane.INFORMATION_MESSAGE);
        }

      }
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void GrillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrillaMouseClicked
       int Fila = Grilla.rowAtPoint(evt.getPoint());
       LblIDCliente.setText(Grilla.getValueAt(Fila,0).toString()); //levanta el ID
       TBNombre.setText(Grilla.getValueAt(Fila,1).toString());
       TBApellido.setText(Grilla.getValueAt(Fila, 2).toString());
       CBEdad.setSelectedItem(Grilla.getValueAt(Fila, 3));
       String Localidad = Grilla.getValueAt(Fila, 4).toString(); 
       FClientes Objeto = new FClientes();
       int  IDLocalidad = Objeto.ObtenerIDLocalidad(Localidad);
       CBLocalidad.setSelectedIndex(IDLocalidad);
       TBTelefono.setText(Grilla.getValueAt(Fila, 5).toString());
       TBDomicilio.setText(Grilla.getValueAt(Fila, 6).toString());
       
       BtnRegistrar.setText("Nuevo");
       BtnModificar.setEnabled(true);
       BtnEliminar.setEnabled(true);
    }//GEN-LAST:event_GrillaMouseClicked

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        //Validamos que se hayan completado los datos primero
        if (TBNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el nombre");
            return;
        }

        if (TBApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el apellido");
            return;
        }

        if (TBTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el telefono");
            return;
        }

        if (TBDomicilio.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el domicilio");
            return;
        }
        
        int Pregunta = JOptionPane.showOptionDialog(this,"Deseas modificar cliente",
                "Modificar cliente",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Si","No"},"Si");
        if (Pregunta == 0){
            //si confirma la modificacion
            String Nombre = TBNombre.getText();
            String Apellido = TBApellido.getText();
            int Edad = (int) CBEdad.getSelectedItem();
            
            ComboLocalides LocalidadSeleccionada  = (ComboLocalides) CBLocalidad.getItemAt(CBLocalidad.getSelectedIndex());
            String Localidad = String.valueOf(LocalidadSeleccionada.getIDLocalidad());
            int IDLocalidad = Integer.parseInt(Localidad);
            
            String Telefono = TBTelefono.getText();
            String Domicilio = TBDomicilio.getText();
            int IDCliente = Integer.parseInt(LblIDCliente.getText());
            
            VClientes Dato = new VClientes();
            FClientes Funcion = new FClientes();
            
            Dato.setNombre(Nombre);
            Dato.setApellido(Apellido);
            Dato.setEdad(Edad);
            Dato.setLocalidad(IDLocalidad);
            Dato.setTelefono(Telefono);
            Dato.setDomicilio(Domicilio);
            Dato.setIDCliente(IDCliente);
            
            Funcion.ModificarCliente(Dato);
            Limpiar();
            CargarGrilla();
        }else{
            JOptionPane.showMessageDialog(null, "Se ha cancelado la modificacion del cliente","Aviso",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int Pregunta = JOptionPane.showOptionDialog(null,
                "Deseas eliminar el cliente?",
                "Eliminar cliente",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Si","No"},
                "Si");
       if (Pregunta == 0){
           int IDCliente = Integer.parseInt(LblIDCliente.getText());
           FClientes Funcion = new FClientes();
           Funcion.EliminarCliente(IDCliente);
           Limpiar();
           CargarGrilla();
           BtnRegistrar.setEnabled(true);
       }else{
           JOptionPane.showMessageDialog(null, "Se ha cancelado la eliminacion del cliente","Aviso",JOptionPane.INFORMATION_MESSAGE);
       }
        
    }//GEN-LAST:event_BtnEliminarActionPerformed
    private void CargarGrilla(){
        Grilla.removeAll();
        FClientes  Objeto = new FClientes();
        DefaultTableModel Modelo;
        Modelo = Objeto.CargarGrilla();
        Grilla.setModel(Modelo);
    }
    private void Limpiar(){
        LblIDCliente.setText("");
        TBNombre.setText("");
        TBApellido.setText("");
        TBTelefono.setText("");
        TBDomicilio.setText("");
        CBEdad.setSelectedIndex(0);
        CBLocalidad.setSelectedIndex(0);
        BtnModificar.setEnabled(false);
        BtnEliminar.setEnabled(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JComboBox CBEdad;
    private javax.swing.JComboBox CBLocalidad;
    private javax.swing.JTable Grilla;
    private javax.swing.JLabel LblIDCliente;
    private javax.swing.JTextField TBApellido;
    private javax.swing.JTextField TBDomicilio;
    private javax.swing.JTextField TBNombre;
    private javax.swing.JTextField TBTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}