package ApartadoGrafico;

import java.awt.*;
import javax.swing.JPanel;
import Conexion.*;
import Objetos.*;
import java.util.*;



public class Inicio extends javax.swing.JFrame {
           
    public Inicio() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonSalir = new javax.swing.JButton();
        jButtonResultados = new javax.swing.JButton();
        jButtonInsumos = new javax.swing.JButton();
        jButtonIndicaciones = new javax.swing.JButton();
        jButtonOrden = new javax.swing.JButton();
        jButtonAnalisis = new javax.swing.JButton();
        jButtonPaciente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laboratorio de Analisis Clinicos");

        jPanel1.setBackground(new java.awt.Color(133, 230, 192));

        jPanel2.setBackground(new java.awt.Color(107, 179, 155));

        jButtonSalir.setBackground(new java.awt.Color(247, 244, 232));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonResultados.setBackground(new java.awt.Color(247, 244, 232));
        jButtonResultados.setText("Resultados");
        jButtonResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultadosActionPerformed(evt);
            }
        });

        jButtonInsumos.setBackground(new java.awt.Color(247, 244, 232));
        jButtonInsumos.setText("Insumos");
        jButtonInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsumosActionPerformed(evt);
            }
        });

        jButtonIndicaciones.setBackground(new java.awt.Color(247, 244, 232));
        jButtonIndicaciones.setText("Indicaciones");
        jButtonIndicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIndicacionesActionPerformed(evt);
            }
        });

        jButtonOrden.setBackground(new java.awt.Color(247, 244, 232));
        jButtonOrden.setText("Orden");
        jButtonOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenActionPerformed(evt);
            }
        });

        jButtonAnalisis.setBackground(new java.awt.Color(247, 244, 232));
        jButtonAnalisis.setText("Analisis");
        jButtonAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalisisActionPerformed(evt);
            }
        });

        jButtonPaciente.setBackground(new java.awt.Color(247, 244, 232));
        jButtonPaciente.setText("Paciente");
        jButtonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInsumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonIndicaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jButtonOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnalisis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jButtonAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jPanel3.setBackground(new java.awt.Color(218, 243, 234));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultadosActionPerformed
        JPanelResultados panel = new JPanelResultados();
        panel.aux = this.jPanel1;
        showPanel(panel);
    }//GEN-LAST:event_jButtonResultadosActionPerformed

    private void jButtonInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsumosActionPerformed
        JPanelInsumo panel = new JPanelInsumo();
        showPanel(panel);
    }//GEN-LAST:event_jButtonInsumosActionPerformed

    private void jButtonIndicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIndicacionesActionPerformed
        JPanelIndicaciones panel = new JPanelIndicaciones();
        panel.aux = this.jPanel1;
        showPanel(panel);
    }//GEN-LAST:event_jButtonIndicacionesActionPerformed

    private void jButtonOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenActionPerformed
        JPanelOrden panel = new JPanelOrden();
        showPanel(panel);
    }//GEN-LAST:event_jButtonOrdenActionPerformed

    private void jButtonAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalisisActionPerformed
        JPanelAnalisis panel = new JPanelAnalisis();
        showPanel(panel);
    }//GEN-LAST:event_jButtonAnalisisActionPerformed

    private void jButtonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPacienteActionPerformed
        JPanelPaciente panel = new JPanelPaciente();
        panel.aux = this.jPanel1;
        showPanel(panel);
    }//GEN-LAST:event_jButtonPacienteActionPerformed

    private void showPanel(JPanel p){
        p.setSize(450,450);
        p.setLocation(0,0);
        jPanel3.removeAll();
        jPanel3.add(p, BorderLayout.CENTER);
        jPanel3.revalidate();
        jPanel3.repaint();
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Inicio().setVisible(true);
            }
        });
        
        //Prueba select
        
        AnalisisDAO a = new AnalisisDAO();
        
        Analisis a1 = new Analisis("a1",213,"descripcion");
        Analisis a2 = new Analisis("a2",214,"descripcion");
        Analisis a3 = new Analisis("a3",215,"descripcion");
        
        a.insertar(a1);     // Inserts
        a.insertar(a2);
        a.insertar(a3);
        
        java.util.List<Analisis> listaAnalisis = a.seleccionar();
        for (Analisis analisis: listaAnalisis){
            System.out.println("Usuario: "+analisis);
        }
        
        a.eliminar(213);    //
        a.eliminar(214);    //
        a.eliminar(215);    // Deja la BD como estaba
        
        /////////
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnalisis;
    private javax.swing.JButton jButtonIndicaciones;
    private javax.swing.JButton jButtonInsumos;
    private javax.swing.JButton jButtonOrden;
    private javax.swing.JButton jButtonPaciente;
    private javax.swing.JButton jButtonResultados;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}