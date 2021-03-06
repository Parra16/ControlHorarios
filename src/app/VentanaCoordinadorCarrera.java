/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Color;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VentanaCoordinadorCarrera extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrinicipal
     */
    public VentanaCoordinadorCarrera() {
        initComponents();
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
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
        jLTituloUniversidad = new javax.swing.JLabel();
        jLTituloUAPT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBMaterias = new javax.swing.JButton();
        jBHorarios = new javax.swing.JButton();
        jBDocentes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jBGrupos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horarios UAPT");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/UAPT.jpeg"))); // NOI18N

        jLTituloUniversidad.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLTituloUniversidad.setText("Universidad Autónoma del Estado de México");

        jLTituloUAPT.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLTituloUAPT.setText("Unidad Académica Profesional Tianguistenco");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Bienvenido al menú principal por favor presiona un boton, para gestionar culaquiera de los apartados");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/UAEMex.jpg"))); // NOI18N

        jBMaterias.setBackground(new java.awt.Color(102, 102, 0));
        jBMaterias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBMaterias.setForeground(new java.awt.Color(255, 255, 255));
        jBMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Materias.png"))); // NOI18N
        jBMaterias.setText("Materias");
        jBMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMateriasActionPerformed(evt);
            }
        });

        jBHorarios.setBackground(new java.awt.Color(102, 102, 0));
        jBHorarios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBHorarios.setForeground(new java.awt.Color(255, 255, 255));
        jBHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/horario.png"))); // NOI18N
        jBHorarios.setText("Horarios");
        jBHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHorariosActionPerformed(evt);
            }
        });

        jBDocentes.setBackground(new java.awt.Color(102, 102, 0));
        jBDocentes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBDocentes.setForeground(new java.awt.Color(255, 255, 255));
        jBDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/profesor.png"))); // NOI18N
        jBDocentes.setText("Docentes");
        jBDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDocentesActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha(3).png"))); // NOI18N
        jButton1.setText("Cerrar Sesión");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBGrupos.setBackground(new java.awt.Color(102, 102, 0));
        jBGrupos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBGrupos.setForeground(new java.awt.Color(255, 255, 255));
        jBGrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/grupo.png"))); // NOI18N
        jBGrupos.setText("Grupos");
        jBGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGruposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTituloUAPT)
                            .addComponent(jLTituloUniversidad))
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(500, 810, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBDocentes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(jBHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(135, 135, 135)))
                        .addGap(107, 107, 107))))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLTituloUniversidad)
                        .addGap(28, 28, 28)
                        .addComponent(jLTituloUAPT))
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBMaterias)
                            .addComponent(jBGrupos))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBHorarios)
                            .addComponent(jBDocentes))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 400, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMateriasActionPerformed
       this.setVisible(false);
       new VentanaMaterias().setVisible(true);
    }//GEN-LAST:event_jBMateriasActionPerformed

    private void jBHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHorariosActionPerformed
        this.setVisible(false);
        new VentanaHorarios().setVisible(true);
    }//GEN-LAST:event_jBHorariosActionPerformed

    private void jBDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDocentesActionPerformed
        this.setVisible(false);
        new VentanaDocentes().setVisible(true);
    }//GEN-LAST:event_jBDocentesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new VentanaLogin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGruposActionPerformed
        this.setVisible(false);
        new VentanaGrupos().setVisible(true);
    }//GEN-LAST:event_jBGruposActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCoordinadorCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCoordinadorCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCoordinadorCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCoordinadorCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCoordinadorCarrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDocentes;
    private javax.swing.JButton jBGrupos;
    private javax.swing.JButton jBHorarios;
    private javax.swing.JButton jBMaterias;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLTituloUAPT;
    private javax.swing.JLabel jLTituloUniversidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
