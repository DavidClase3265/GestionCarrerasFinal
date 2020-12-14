/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_carreras_deportivasfinal.GUI.Corredores;

import gestion_carreras_deportivasfinal.DTO.Carrera;
import gestion_carreras_deportivasfinal.DTO.Corredor;
import gestion_carreras_deportivasfinal.DTO.LogicaNegocioCarrera;
import gestion_carreras_deportivasfinal.DTO.LogicaNegocioCorredor;
import gestion_carreras_deportivasfinal.GUI.Carreras.CarreraCrear;
import gestion_carreras_deportivasfinal.GUI.Carreras.CarreraTabla;
import gestion_carreras_deportivasfinal.GUI.PantallaPrincipal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author David
 */
public class CorredorTabla extends javax.swing.JDialog {
    
    //CREAMOS LAS LOGICAS DE NEGOCIO
    private LogicaNegocioCorredor logicaNegocioCorredor;
     
    /**
     * Creates new form CorredorTabla
     */
    public CorredorTabla(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        refrescarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonModificar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredor = new javax.swing.JTable();
        jButtonBorrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPANTALLA_PRINCIPAL = new javax.swing.JMenu();
        jMenuIrPantallaPrincipal = new javax.swing.JMenuItem();
        jMenuTABLA_CARRERAS = new javax.swing.JMenu();
        jMenuItemCrearCarrera = new javax.swing.JMenuItem();
        jMenuTABLA_CORREDORES = new javax.swing.JMenu();
        jMenuItemCrearCorredor = new javax.swing.JMenuItem();
        jMenuItemModificarCorredor = new javax.swing.JMenuItem();
        jMenuItemBorrarCarrera = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonModificar.setText("Modificar Corredor");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonVolver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonCrear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCrear.setText("Crear Corredor");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });

        jTableCorredor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCorredor);

        jButtonBorrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBorrar.setText("Borrar Corredor");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jMenuPANTALLA_PRINCIPAL.setText("Pantalla Principal");

        jMenuIrPantallaPrincipal.setText("Ir a Pantalla Principal");
        jMenuIrPantallaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIrPantallaPrincipalActionPerformed(evt);
            }
        });
        jMenuPANTALLA_PRINCIPAL.add(jMenuIrPantallaPrincipal);

        jMenuBar1.add(jMenuPANTALLA_PRINCIPAL);

        jMenuTABLA_CARRERAS.setText("Tabla De Carreras");

        jMenuItemCrearCarrera.setText("Ir a Crear Carrera");
        jMenuItemCrearCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrearCarreraActionPerformed(evt);
            }
        });
        jMenuTABLA_CARRERAS.add(jMenuItemCrearCarrera);

        jMenuBar1.add(jMenuTABLA_CARRERAS);

        jMenuTABLA_CORREDORES.setText("Tabla De Corredores");

        jMenuItemCrearCorredor.setText("Ir a Crear Corredor");
        jMenuItemCrearCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrearCorredorActionPerformed(evt);
            }
        });
        jMenuTABLA_CORREDORES.add(jMenuItemCrearCorredor);

        jMenuItemModificarCorredor.setText("Ir a Modificar Carrera");
        jMenuItemModificarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarCorredorActionPerformed(evt);
            }
        });
        jMenuTABLA_CORREDORES.add(jMenuItemModificarCorredor);

        jMenuItemBorrarCarrera.setText("Ir a Borrar Carrera");
        jMenuItemBorrarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBorrarCarreraActionPerformed(evt);
            }
        });
        jMenuTABLA_CORREDORES.add(jMenuItemBorrarCarrera);

        jMenuBar1.add(jMenuTABLA_CORREDORES);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVolver)
                                .addGap(161, 161, 161))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCrear)
                                .addGap(123, 123, 123)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCrear)
                    .addComponent(jButtonModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonBorrar))
                .addGap(97, 97, 97))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ACCIONES
    private void refrescarTabla(){
        //REFRESCAR
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre", "DNI", "Fecha", "Direccion", "Telefono"});
        
        List<Corredor> listaCorredor = logicaNegocioCorredor.getListaCorredor();
        for(Corredor corredor : listaCorredor){
            dtm.addRow(corredor.toArrayString());
        }
        jTableCorredor.setModel(dtm);
        
        //SORTER
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm);
        jTableCorredor.setRowSorter(sorter);
        
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(2,SortOrder.ASCENDING));
       
        sorter.setSortKeys(sortKeys);
    }

    
    public void borrar(){
        List<Corredor> listaCorredor = logicaNegocioCorredor.getListaCorredor();
        
        //CORREDOR DE ESA LINEA  
       int row = jTableCorredor.getSelectedRow();
       String nombre = jTableCorredor.getModel().getValueAt(row, 0).toString();
       
       int resultado = JOptionPane.showConfirmDialog(this, "¿Quieres borrar este corredor?", "Corredor",JOptionPane.YES_NO_OPTION);
       if(resultado == JOptionPane.YES_OPTION){
          JOptionPane.showMessageDialog(this, "Borramos", "Corredor", JOptionPane.INFORMATION_MESSAGE);
 
          for(int i=0 ; i<listaCorredor.size(); i++){
              if(listaCorredor.get(i).toArrayString()[0].equals(nombre)){
                  logicaNegocioCorredor.borrarCorredor(i);
              }
          }
          DefaultTableModel dtm = (DefaultTableModel)jTableCorredor.getModel();
          dtm.removeRow(row);
          jTableCorredor.setModel(dtm);
       }
       else if (resultado == JOptionPane.NO_OPTION){
           JOptionPane.showMessageDialog(this, "No Borramos", "Corredor", JOptionPane.INFORMATION_MESSAGE);   
       }
    }
    
    public void IrModificar(){
       int row = jTableCorredor.getSelectedRow();
       String nombre = jTableCorredor.getModel().getValueAt(row, 0).toString();
       List<Corredor> listaCorredores = logicaNegocioCorredor.getListaCorredor();
       Corredor corredor=null;
    
        for(Corredor corredor2 : listaCorredores){
        if(corredor2.getNombre().equals(nombre)){
            corredor=corredor2;
        }     
        }
         
        CorredorModificar corredorModificar = new CorredorModificar(new javax.swing.JFrame(), true);

        corredorModificar.asignarParametros(corredor); 
        corredorModificar.setVisible(true);
        refrescarTabla();
    }
    
    private void jMenuItemBorrarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBorrarCarreraActionPerformed
        borrar();
    }//GEN-LAST:event_jMenuItemBorrarCarreraActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        borrar();
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    //IR A OTRA VENTANA
    private void jMenuIrPantallaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIrPantallaPrincipalActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jMenuIrPantallaPrincipalActionPerformed

    private void jMenuItemCrearCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrearCarreraActionPerformed
          List<Corredor> listaCorredor = logicaNegocioCorredor.getListaCorredor();
        
        if(listaCorredor.size()==0 || listaCorredor.get(0).getNombre()==""){
            JOptionPane.showMessageDialog(this, "No puedes crear una carrera sin corredores", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            CarreraTabla carreraTabla = new CarreraTabla(new javax.swing.JFrame(), true);
            carreraTabla.setVisible(true);
          
        }

      
    }//GEN-LAST:event_jMenuItemCrearCarreraActionPerformed

    private void jMenuItemCrearCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrearCorredorActionPerformed
       CorredorCrear corredorCrear = new CorredorCrear(new javax.swing.JFrame(), true);
       corredorCrear.setVisible(true);
       refrescarTabla();
    }//GEN-LAST:event_jMenuItemCrearCorredorActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
       CorredorCrear corredorCrear = new CorredorCrear(new javax.swing.JFrame(), true);
       corredorCrear.setVisible(true);
       refrescarTabla();
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jMenuItemModificarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarCorredorActionPerformed
       IrModificar();
       refrescarTabla();
    }//GEN-LAST:event_jMenuItemModificarCorredorActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
       IrModificar();
       refrescarTabla();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(CorredorTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CorredorTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CorredorTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CorredorTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CorredorTabla dialog = new CorredorTabla(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuIrPantallaPrincipal;
    private javax.swing.JMenuItem jMenuItemBorrarCarrera;
    private javax.swing.JMenuItem jMenuItemCrearCarrera;
    private javax.swing.JMenuItem jMenuItemCrearCorredor;
    private javax.swing.JMenuItem jMenuItemModificarCorredor;
    private javax.swing.JMenu jMenuPANTALLA_PRINCIPAL;
    private javax.swing.JMenu jMenuTABLA_CARRERAS;
    private javax.swing.JMenu jMenuTABLA_CORREDORES;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCorredor;
    // End of variables declaration//GEN-END:variables
}
