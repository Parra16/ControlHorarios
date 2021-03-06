/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Clases.ConectarBase;
import Clases.Conexion;
import Clases.ConsultasObjetos;
import Objetos.Profesor;
import cjb.ci.CtrlInterfaz;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import static cjb.ci.Validaciones.enter;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VentanaDocentes extends javax.swing.JFrame
{

    /**
     * Creates new form VentanaPrinicipal
     */
    public VentanaDocentes() {
        initComponents();
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
    }
    private Boolean edicion = true;
    private DefaultTableModel modelo;

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
        jLabel4 = new javax.swing.JLabel();
        txtrfc = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnelmina = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBRegresar = new javax.swing.JButton();
        jBCerrarSesion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtgradoAcademico = new javax.swing.JTextField();
        txtapellidoP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtapellidoM = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        btnmodifica = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();
        btnAgregar3 = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horarios UAPT");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Profesores");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Apellido Paterno");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Rfc");

        txtrfc.setBackground(new java.awt.Color(255, 255, 153));
        txtrfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrfcActionPerformed(evt);
            }
        });
        txtrfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrfcKeyPressed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(102, 102, 0));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Nuevo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnelmina.setBackground(new java.awt.Color(102, 102, 0));
        btnelmina.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnelmina.setForeground(new java.awt.Color(255, 255, 255));
        btnelmina.setText("Eliminar");
        btnelmina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelminaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "rfc", "Apellido Paterno", "Apellido Materno", "Nombres", "Grado Academico", "Correo", "Telefono"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jBRegresar.setBackground(new java.awt.Color(102, 102, 0));
        jBRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jBRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha(2).png"))); // NOI18N
        jBRegresar.setText("Regresar");
        jBRegresar.setToolTipText("");
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });

        jBCerrarSesion.setBackground(new java.awt.Color(102, 102, 0));
        jBCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jBCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha(3).png"))); // NOI18N
        jBCerrarSesion.setText("Cerrar Sesión");
        jBCerrarSesion.setToolTipText("");
        jBCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarSesionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("Nombres");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setText("Grado Academico");

        txtgradoAcademico.setBackground(new java.awt.Color(255, 255, 153));
        txtgradoAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgradoAcademicoActionPerformed(evt);
            }
        });
        txtgradoAcademico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtgradoAcademicoKeyPressed(evt);
            }
        });

        txtapellidoP.setBackground(new java.awt.Color(255, 255, 153));
        txtapellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoPActionPerformed(evt);
            }
        });
        txtapellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoPKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setText("Apellido Materno");

        txtapellidoM.setBackground(new java.awt.Color(255, 255, 153));
        txtapellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoMActionPerformed(evt);
            }
        });
        txtapellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoMKeyPressed(evt);
            }
        });

        txtnombres.setBackground(new java.awt.Color(255, 255, 153));
        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombresKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setText("Correo");

        txtcorreo.setBackground(new java.awt.Color(255, 255, 153));
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcorreoKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setText("Telefono");

        txttelefono.setBackground(new java.awt.Color(255, 255, 153));
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
        });

        btnmodifica.setBackground(new java.awt.Color(102, 102, 0));
        btnmodifica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnmodifica.setForeground(new java.awt.Color(255, 255, 255));
        btnmodifica.setText("Modificar");
        btnmodifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificaActionPerformed(evt);
            }
        });

        btnAgregar2.setBackground(new java.awt.Color(102, 102, 0));
        btnAgregar2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar2.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar2.setText("Importar");
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        btnAgregar3.setBackground(new java.awt.Color(102, 102, 0));
        btnAgregar3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar3.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar3.setText("Exportar");
        btnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar3ActionPerformed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(102, 102, 0));
        btncancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtgradoAcademico)
                            .addComponent(txtcorreo)
                            .addComponent(txtapellidoM)
                            .addComponent(txtnombres)
                            .addComponent(txttelefono)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtrfc, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 89, Short.MAX_VALUE))
                            .addComponent(txtapellidoP))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(426, 426, 426)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(447, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnmodifica, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnelmina)
                        .addGap(48, 48, 48)
                        .addComponent(btncancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBRegresar)
                        .addGap(62, 62, 62)
                        .addComponent(jBCerrarSesion)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtapellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtapellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtgradoAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnelmina, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodifica, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRegresar)
                    .addComponent(jBCerrarSesion)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtrfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrfcActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        edicion();
        if (edicion)
        {
            btnAgregar.setText("Aceptar");
            CtrlInterfaz.habilita(true, txtapellidoM, txtapellidoP, txtnombres, txtrfc, txtgradoAcademico, txtcorreo, txttelefono, btncancelar);
            CtrlInterfaz.habilita(false, btnelmina, btnmodifica);
            CtrlInterfaz.selecciona(txtrfc);

        } else
        {
            if (JOptionPane.showConfirmDialog(this, "Seguro que desea agregar a " + txtnombres.getText()) == 0)
            {
                btnAgregar.setText("Nuevo");
                Profesor p = new Profesor(txtrfc.getText(), txtapellidoP.getText(), txtapellidoM.getText(), txtnombres.getText(), txtgradoAcademico.getText(), txtcorreo.getText(), txttelefono.getText());
                ConsultasObjetos.inserta(p, ConectarBase.conectado(), "profesor");
                CtrlInterfaz.habilita(false, txtapellidoM, txtapellidoP, txtnombres, txtrfc, txtgradoAcademico, txtcorreo, txttelefono);
                CtrlInterfaz.habilita(true, btnelmina, btnmodifica);
                actualizaTabla();
            }
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnelminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelminaActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar a " + txtnombres.getText()) == 0)
        {
            Profesor p = new Profesor(txtrfc.getText(), txtapellidoP.getText(), txtapellidoM.getText(), txtnombres.getText(), txtgradoAcademico.getText(), txtcorreo.getText(), txttelefono.getText());
            ConsultasObjetos.elimina("profesores", "rfc", txtrfc.getText(), 0, ConectarBase.conectado());
            actualizaTabla();
        }
    }//GEN-LAST:event_btnelminaActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        this.setVisible(false);
        new VentanaAdministrador().setVisible(true);
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void jBCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarSesionActionPerformed
        this.setVisible(false);
        new VentanaLogin().setVisible(true);
    }//GEN-LAST:event_jBCerrarSesionActionPerformed

    private void txtgradoAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgradoAcademicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgradoAcademicoActionPerformed

    private void txtapellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoPActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cancelar();
        actualizaTabla();
    }//GEN-LAST:event_formWindowOpened

    private void txtapellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoMActionPerformed

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombresActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void btnmodificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificaActionPerformed
        edicion();
        if (edicion)
        {
            btnmodifica.setText("Aceptar");
            CtrlInterfaz.habilita(true, txtapellidoM, txtapellidoP, txtnombres, txtrfc, txtgradoAcademico, txtcorreo, txttelefono, btncancelar);
            CtrlInterfaz.habilita(false, btnelmina, btnAgregar);
        } else
        {
            if (JOptionPane.showConfirmDialog(this, "Seguro que desea Modificar a " + txtnombres.getText()) == 0)
            {
                btnAgregar.setText("Modificar");
                Profesor p = new Profesor(txtrfc.getText(), txtapellidoP.getText(), txtapellidoM.getText(), txtnombres.getText(), txtgradoAcademico.getText(), txtcorreo.getText(), txttelefono.getText());
                ConsultasObjetos.Modifica(p, ConectarBase.conectado(), "profesores");
                CtrlInterfaz.habilita(false, txtapellidoM, txtapellidoP, txtnombres, txtrfc, txtgradoAcademico, txtcorreo, txttelefono);
                CtrlInterfaz.habilita(true, btnelmina, btnmodifica);
                actualizaTabla();
            }
        }
    }//GEN-LAST:event_btnmodificaActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar3ActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        txtrfc.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 0));
        txtapellidoP.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 1));
        txtapellidoM.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 2));
        txtnombres.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 3));
        txtgradoAcademico.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 4));
        txtcorreo.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 5));
        txttelefono.setText((String) modelo.getValueAt(jTable1.getSelectedRow(), 6));
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtrfcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrfcKeyPressed
        enter(this, evt, txtapellidoP);
    }//GEN-LAST:event_txtrfcKeyPressed

    private void txtapellidoPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoPKeyPressed
        enter(this, evt, txtapellidoM);
    }//GEN-LAST:event_txtapellidoPKeyPressed

    private void txtapellidoMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoMKeyPressed
        enter(this, evt, txtnombres);
    }//GEN-LAST:event_txtapellidoMKeyPressed

    private void txtnombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyPressed
        enter(this, evt, txtgradoAcademico);
    }//GEN-LAST:event_txtnombresKeyPressed

    private void txtgradoAcademicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgradoAcademicoKeyPressed
        enter(this, evt, txtcorreo);
    }//GEN-LAST:event_txtgradoAcademicoKeyPressed

    private void txtcorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyPressed
        enter(this, evt, txttelefono);
    }//GEN-LAST:event_txtcorreoKeyPressed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        enter(this, evt, btnAgregar);
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void cancelar() {
        edicion();
        CtrlInterfaz.habilita(false, txtapellidoM, txtapellidoP, txtnombres, txtrfc, txtgradoAcademico, txtcorreo, txttelefono, btncancelar);
        CtrlInterfaz.habilita(true, btnAgregar, btnmodifica, btnelmina);
        btnAgregar.setText("Nuevo");
        btnmodifica.setText("Modificar");
    }

    private void edicion() {
        if (edicion)
        {
            edicion = false;
        } else
        {
            edicion = true;
        }
    }

    public void actualizaTabla() {
        modelo = (DefaultTableModel) jTable1.getModel();
        ArrayList profes = new ArrayList();
        profes = ConsultasObjetos.consultaMuchos("profesores", null, null, ConectarBase.conectado());
        if (profes.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No se encuentran registros");
        } else
        {

            modelo.setRowCount(0);
            for (Object p : profes)
            {
                Profesor profe = (Profesor) p;
                modelo.addRow(new Object[]
                {
                    profe.getRfc(), profe.getApellidoP(), profe.getApellidoM(), profe.getNombres(), profe.getGradoAcademico(), profe.getCorreo(), profe.getTelefono()
                });
                System.out.println(((Profesor) p).getNombres());
            }
        }
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
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VentanaDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new VentanaDocentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnelmina;
    private javax.swing.JButton btnmodifica;
    private javax.swing.JButton jBCerrarSesion;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtapellidoM;
    private javax.swing.JTextField txtapellidoP;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtgradoAcademico;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtrfc;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
