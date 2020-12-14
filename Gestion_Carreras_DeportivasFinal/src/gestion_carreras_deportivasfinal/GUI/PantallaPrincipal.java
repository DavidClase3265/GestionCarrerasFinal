/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_carreras_deportivasfinal.GUI;

import gestion_carreras_deportivasfinal.DTO.Corredor;
import gestion_carreras_deportivasfinal.DTO.LogicaNegocioCorredor;
import gestion_carreras_deportivasfinal.GUI.Carreras.CarreraTabla;
import gestion_carreras_deportivasfinal.GUI.Corredores.CorredorTabla;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    //CREAMOS LAS LOGICAS DE NEGOCIO
    private LogicaNegocioCorredor logicaNegocioCorredor;
    
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPANTALLA_PRINCIPAL = new javax.swing.JLabel();
        jLabelTABLA_CARRERAS = new javax.swing.JLabel();
        jLabelTABLA_CORREDORES = new javax.swing.JLabel();
        jButtonIrTablaCarreras = new javax.swing.JButton();
        jButtonIrTablaCorredores = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuTABLA_CARRERAS = new javax.swing.JMenu();
        jMenuIrTablaCarreras = new javax.swing.JMenuItem();
        jMenuTABLA_CORREDORES = new javax.swing.JMenu();
        jMenuIrTablaCorredores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelPANTALLA_PRINCIPAL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelPANTALLA_PRINCIPAL.setText("PANTALLA PRINCIPAL");

        jLabelTABLA_CARRERAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTABLA_CARRERAS.setText("TABLA CARRERAS");

        jLabelTABLA_CORREDORES.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTABLA_CORREDORES.setText("TABLA CORREDORES");

        jButtonIrTablaCarreras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonIrTablaCarreras.setText("Ir a Tabla de Carreras");
        jButtonIrTablaCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIrTablaCarrerasActionPerformed(evt);
            }
        });

        jButtonIrTablaCorredores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonIrTablaCorredores.setText("Ir a Tabla de Corredores");
        jButtonIrTablaCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIrTablaCorredoresActionPerformed(evt);
            }
        });

        jMenuTABLA_CARRERAS.setText("Tabla De Carreras");

        jMenuIrTablaCarreras.setText("Ir a la Tabla de Carreras");
        jMenuIrTablaCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIrTablaCarrerasActionPerformed(evt);
            }
        });
        jMenuTABLA_CARRERAS.add(jMenuIrTablaCarreras);

        jMenuBar1.add(jMenuTABLA_CARRERAS);

        jMenuTABLA_CORREDORES.setText("Tabla De Corredores");

        jMenuIrTablaCorredores.setText("Ir a la Tabla de Corredores");
        jMenuIrTablaCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIrTablaCorredoresActionPerformed(evt);
            }
        });
        jMenuTABLA_CORREDORES.add(jMenuIrTablaCorredores);

        jMenuBar1.add(jMenuTABLA_CORREDORES);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabelPANTALLA_PRINCIPAL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(69, Short.MAX_VALUE)
                        .addComponent(jLabelTABLA_CARRERAS, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButtonIrTablaCarreras)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButtonIrTablaCorredores)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTABLA_CORREDORES, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabelPANTALLA_PRINCIPAL)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTABLA_CARRERAS)
                    .addComponent(jLabelTABLA_CORREDORES))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIrTablaCorredores)
                    .addComponent(jButtonIrTablaCarreras))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //IR A OTRA VENTANA
    private void jMenuIrTablaCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIrTablaCarrerasActionPerformed
        IrTablaCarreras();
    }//GEN-LAST:event_jMenuIrTablaCarrerasActionPerformed

    private void jButtonIrTablaCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIrTablaCarrerasActionPerformed
        IrTablaCarreras();
    }//GEN-LAST:event_jButtonIrTablaCarrerasActionPerformed

    private void jMenuIrTablaCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIrTablaCorredoresActionPerformed
        IrTablaCorredores();
    }//GEN-LAST:event_jMenuIrTablaCorredoresActionPerformed

    private void jButtonIrTablaCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIrTablaCorredoresActionPerformed
        IrTablaCorredores();
    }//GEN-LAST:event_jButtonIrTablaCorredoresActionPerformed

    //IR A LA TABLA DE CARRERAS
    public void IrTablaCarreras(){
        List<Corredor> listaCorredor = logicaNegocioCorredor.getListaCorredor();
        
        if(listaCorredor.size()==0 || listaCorredor.get(0).getNombre()==""){
            JOptionPane.showMessageDialog(this, "No puedes crear una carrera sin corredores", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            CarreraTabla carreraTabla = new CarreraTabla(this, true);
            carreraTabla.setVisible(true);
        }


    }
    //IR A LA TABLA DE CORREDORES
    public void IrTablaCorredores(){
       CorredorTabla corredorTabla = new CorredorTabla(this, true);
       corredorTabla.setVisible(true);
      
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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIrTablaCarreras;
    private javax.swing.JButton jButtonIrTablaCorredores;
    private javax.swing.JLabel jLabelPANTALLA_PRINCIPAL;
    private javax.swing.JLabel jLabelTABLA_CARRERAS;
    private javax.swing.JLabel jLabelTABLA_CORREDORES;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuIrTablaCarreras;
    private javax.swing.JMenuItem jMenuIrTablaCorredores;
    private javax.swing.JMenu jMenuTABLA_CARRERAS;
    private javax.swing.JMenu jMenuTABLA_CORREDORES;
    // End of variables declaration//GEN-END:variables
}
