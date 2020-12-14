/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_carreras_deportivasfinal.GUI.Carreras;

import gestion_carreras_deportivasfinal.DTO.Carrera;
import gestion_carreras_deportivasfinal.DTO.Corredor;
import gestion_carreras_deportivasfinal.DTO.LogicaNegocioCarrera;
import gestion_carreras_deportivasfinal.DTO.LogicaNegocioCorredor;
import gestion_carreras_deportivasfinal.GUI.Corredores.CorredorCrear;
import gestion_carreras_deportivasfinal.GUI.Corredores.CorredorTabla;
import gestion_carreras_deportivasfinal.GUI.PantallaPrincipal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author David
 */
public class CarreraModificar extends javax.swing.JDialog {

    //AÑADIR LOGICAS DE NEGOCIO
    private LogicaNegocioCorredor logicaNegocioCorredor;
    private LogicaNegocioCarrera logicaNegocioCarrera;
    
    //ID DE LA CARRERA A MODIFICAR
    private String idAnterior="";
    
    /**
     * Creates new form CarreraModificar
     */
    public CarreraModificar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
        //AÑADIMOS LOS CORREDORES A LA LISTA
        List<Corredor> listaCorredor = LogicaNegocioCorredor.getListaCorredor();
        
        DefaultListModel model = new DefaultListModel<>();
        for(int i=0 ; i<listaCorredor.size(); i++){
           model.addElement(listaCorredor.get(i).toArrayString()[0]);
        }
       
        JList lista = jListListaCorredores; 
        lista.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombreCarrera = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLugarCarrera = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSpinnerNumeroMaximoParticipantes = new javax.swing.JSpinner();
        jSpinnerFecha_nacCorredor = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListListaCorredores = new javax.swing.JList<>();
        jButtonModificarCarrera = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuTABLA_CARRERAS = new javax.swing.JMenu();
        jMenuIrTablaCarreras = new javax.swing.JMenuItem();
        jMenuIrCrearCarrera = new javax.swing.JMenuItem();
        jMenuItemModificar = new javax.swing.JMenuItem();
        jMenuTABLA_CORREDORES = new javax.swing.JMenu();
        jMenuIrTablaCorredores = new javax.swing.JMenuItem();
        jMenuIrCrearCorredor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fecha de la carrera");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Lugar de la carrera");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Numero maximo de participantes");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Lista Corredores");

        jSpinnerFecha_nacCorredor.setModel(new javax.swing.SpinnerDateModel());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre de la carrera");

        jListListaCorredores.setEnabled(false);
        jScrollPane1.setViewportView(jListListaCorredores);

        jButtonModificarCarrera.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonModificarCarrera.setText("Modificar Carrera");
        jButtonModificarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarCarreraActionPerformed(evt);
            }
        });

        jButtonVolver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jMenuTABLA_CARRERAS.setText("Tabla De Carreras");

        jMenuIrTablaCarreras.setText("Ir a Tabla de Carreras");
        jMenuIrTablaCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIrTablaCarrerasActionPerformed(evt);
            }
        });
        jMenuTABLA_CARRERAS.add(jMenuIrTablaCarreras);

        jMenuIrCrearCarrera.setText("Crear una Carrera");
        jMenuIrCrearCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIrCrearCarreraActionPerformed(evt);
            }
        });
        jMenuTABLA_CARRERAS.add(jMenuIrCrearCarrera);

        jMenuItemModificar.setText("Modificar Carrera");
        jMenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarActionPerformed(evt);
            }
        });
        jMenuTABLA_CARRERAS.add(jMenuItemModificar);

        jMenuBar1.add(jMenuTABLA_CARRERAS);

        jMenuTABLA_CORREDORES.setText("Tabla De Corredores");

        jMenuIrTablaCorredores.setText("Ir a la Tabla de Corredores");
        jMenuIrTablaCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIrTablaCorredoresActionPerformed(evt);
            }
        });
        jMenuTABLA_CORREDORES.add(jMenuIrTablaCorredores);

        jMenuIrCrearCorredor.setText("Ir a Crear Corredor");
        jMenuIrCrearCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIrCrearCorredorActionPerformed(evt);
            }
        });
        jMenuTABLA_CORREDORES.add(jMenuIrCrearCorredor);

        jMenuBar1.add(jMenuTABLA_CORREDORES);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addComponent(jTextFieldLugarCarrera)
                    .addComponent(jSpinnerFecha_nacCorredor)
                    .addComponent(jTextFieldNombreCarrera)
                    .addComponent(jSpinnerNumeroMaximoParticipantes))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jButtonVolver)
                .addGap(57, 57, 57)
                .addComponent(jButtonModificarCarrera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerFecha_nacCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldLugarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerNumeroMaximoParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonModificarCarrera))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ACCIONES
    public Map<Corredor, Integer> corredoresDeCarrera;
    public void asignarParametros(Carrera carrera){
       jTextFieldNombreCarrera.setText(carrera.getNombre());
       jSpinnerFecha_nacCorredor.setValue(carrera.getFecha());
       jTextFieldLugarCarrera.setText(carrera.getLugar());
       jSpinnerNumeroMaximoParticipantes.setValue(carrera.getNumero_max());

       corredoresDeCarrera= carrera.getMapaCorredor();
       idAnterior=carrera.getNombre();     
    }
    
    public void modificar(){
        String nombre = jTextFieldNombreCarrera.getText();
        String lugar = jTextFieldLugarCarrera.getText();
        int numeroMax = (int)jSpinnerNumeroMaximoParticipantes.getValue();
        Date fecha = (Date)jSpinnerFecha_nacCorredor.getValue();
 
        
        Carrera carrera = new Carrera(nombre, fecha, lugar, numeroMax);
        carrera.setMapaCorredor(corredoresDeCarrera);
        
         List<Carrera> listaCarrera = logicaNegocioCarrera.getListaCarrera();
         
         for(int i=0 ; i<listaCarrera.size(); i++){
            if(listaCarrera.get(i).toArrayString()[0] == idAnterior){
                  logicaNegocioCarrera.actualizarCarrera(carrera, i);
            }
        }
  
        
        setVisible(false);
    }
    
    private void jMenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarActionPerformed
        modificar();
    }//GEN-LAST:event_jMenuItemModificarActionPerformed

    private void jButtonModificarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarCarreraActionPerformed
        modificar();
    }//GEN-LAST:event_jButtonModificarCarreraActionPerformed

    private void jMenuIrTablaCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIrTablaCarrerasActionPerformed
       CarreraTabla carreraTabla = new CarreraTabla(new javax.swing.JFrame(), true);
       carreraTabla.setVisible(true);
    }//GEN-LAST:event_jMenuIrTablaCarrerasActionPerformed

    private void jMenuIrCrearCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIrCrearCarreraActionPerformed
       CarreraCrear carreraCrear = new CarreraCrear(new javax.swing.JFrame(), true);
       carreraCrear.setVisible(true);
    }//GEN-LAST:event_jMenuIrCrearCarreraActionPerformed

    private void jMenuIrTablaCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIrTablaCorredoresActionPerformed
       CorredorTabla corredorTabla = new CorredorTabla(new javax.swing.JFrame(), true);
       corredorTabla.setVisible(true);
    }//GEN-LAST:event_jMenuIrTablaCorredoresActionPerformed

    private void jMenuIrCrearCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIrCrearCorredorActionPerformed
       CorredorCrear corredorCrear = new CorredorCrear(new javax.swing.JFrame(), true);
       corredorCrear.setVisible(true);
    }//GEN-LAST:event_jMenuIrCrearCorredorActionPerformed

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
            java.util.logging.Logger.getLogger(CarreraModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarreraModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarreraModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarreraModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CarreraModificar dialog = new CarreraModificar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonModificarCarrera;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListListaCorredores;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuIrCrearCarrera;
    private javax.swing.JMenuItem jMenuIrCrearCorredor;
    private javax.swing.JMenuItem jMenuIrTablaCarreras;
    private javax.swing.JMenuItem jMenuIrTablaCorredores;
    private javax.swing.JMenuItem jMenuItemModificar;
    private javax.swing.JMenu jMenuTABLA_CARRERAS;
    private javax.swing.JMenu jMenuTABLA_CORREDORES;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerFecha_nacCorredor;
    private javax.swing.JSpinner jSpinnerNumeroMaximoParticipantes;
    private javax.swing.JTextField jTextFieldLugarCarrera;
    private javax.swing.JTextField jTextFieldNombreCarrera;
    // End of variables declaration//GEN-END:variables
}
