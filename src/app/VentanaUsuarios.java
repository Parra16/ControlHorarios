/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Clases.ConectarBase;
import static Clases.ConectarBase.conectado;
import Clases.ConsultasObjetos;
import Objetos.Usuario;
import cjb.ci.CtrlInterfaz;
import static cjb.ci.CtrlInterfaz.habilita;
import cjb.ci.Mensaje;
import static cjb.ci.Validaciones.enter;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VentanaUsuarios extends javax.swing.JFrame
{

    private Boolean edicion = true;
    private DefaultTableModel modelo;

    /**
     * Creates new form VentanaPrinicipal
     */
    public VentanaUsuarios() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTIdUsuario = new javax.swing.JTextField();
        jBAceptar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        jBRegresar = new javax.swing.JButton();
        jBCerrarSesion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        JCRFC = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTusuario = new javax.swing.JTextField();
        jTPregunta = new javax.swing.JTextField();
        jTRespuesta = new javax.swing.JTextField();
        jPContrasenia = new javax.swing.JPasswordField();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horarios UAPT");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/UAPT.jpeg"))); // NOI18N

        jLTituloUniversidad.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLTituloUniversidad.setText("Universidad Autónoma del Estado de México");

        jLTituloUAPT.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLTituloUAPT.setText("Unidad Académica Profesional Tianguistenco");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Gestión de coordinadores");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("RFC");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("ID usuario");

        jTIdUsuario.setBackground(new java.awt.Color(255, 255, 153));
        jTIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdUsuarioActionPerformed(evt);
            }
        });
        jTIdUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTIdUsuarioKeyPressed(evt);
            }
        });

        jBAceptar.setBackground(new java.awt.Color(102, 102, 0));
        jBAceptar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jBAceptar.setText("Nuevo");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/UAEMex.jpg"))); // NOI18N

        jBCancelar.setBackground(new java.awt.Color(102, 102, 0));
        jBCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        TablaUsuarios.setBackground(new java.awt.Color(201, 254, 226));
        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Usuario", "RFC", "Usuario", "Contrasenia", "Pregunta", "Respuesta"
            }
        ));
        TablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaUsuarios);

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
        jLabel6.setText("Usuario");

        JCRFC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCRFCItemStateChanged(evt);
            }
        });
        JCRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JCRFCKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setText("Contrasenia");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setText("Pregunta de seguridad");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setText("Respuesta de seguridad");

        JTusuario.setBackground(new java.awt.Color(255, 255, 153));
        JTusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTusuarioKeyPressed(evt);
            }
        });

        jTPregunta.setBackground(new java.awt.Color(255, 255, 153));
        jTPregunta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTPreguntaKeyPressed(evt);
            }
        });

        jTRespuesta.setBackground(new java.awt.Color(255, 255, 153));
        jTRespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTRespuestaKeyPressed(evt);
            }
        });

        jPContrasenia.setBackground(new java.awt.Color(232, 233, 203));
        jPContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPContraseniaKeyPressed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(102, 102, 0));
        jBModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(102, 102, 0));
        jBEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(241, 241, 241))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTituloUniversidad)
                                    .addComponent(jLTituloUAPT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBRegresar)
                                .addGap(18, 18, 18)
                                .addComponent(jBCerrarSesion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBModificar)
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jBCancelar)
                                .addGap(693, 693, 693))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTPregunta, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPContrasenia, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JCRFC, javax.swing.GroupLayout.Alignment.LEADING, 0, 222, Short.MAX_VALUE)
                                .addComponent(JTusuario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTRespuesta))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jTIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLTituloUniversidad)
                        .addGap(18, 18, 18)
                        .addComponent(jLTituloUAPT)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jTIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(JTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 126, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBRegresar)
                            .addComponent(jBCerrarSesion))
                        .addGap(25, 25, 25))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdUsuarioActionPerformed

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        edicion();
        if (edicion)
        {
            jBAceptar.setText("Aceptar");
            CtrlInterfaz.limpia(jTIdUsuario, JTusuario, jPContrasenia, jTPregunta, jTRespuesta);
            CtrlInterfaz.habilita(true, jTIdUsuario, JCRFC, JTusuario, jPContrasenia, jTPregunta, jTRespuesta, jBCancelar);
            habilita(false, jBModificar, jBEliminar);
            actualizarTabla();
        } else
        {
            if (Mensaje.pregunta(this, "¿Segruo que quiere agregar al usuario " + JTusuario.getText() + " ?") == 0)
            {
                jBAceptar.setText("Nuevo");
                Usuario user = new Usuario(jTIdUsuario.getText(), JCRFC.getSelectedItem().toString(), JTusuario.getText(), jPContrasenia.getText(), jTPregunta.getText(), jTRespuesta.getText());
                ConsultasObjetos.inserta(user, conectado(), "usuarios");
                CtrlInterfaz.habilita(false, jTIdUsuario, JCRFC, JTusuario, jPContrasenia, jTPregunta, jTRespuesta, jBCancelar);
                CtrlInterfaz.limpia(jTIdUsuario, JTusuario, jPContrasenia, jTPregunta, jTRespuesta);
                JCRFC.setSelectedItem(0);
                actualizarTabla();
            }

        }
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        edicion();
        habilita(false, jTIdUsuario, JCRFC, JTusuario, jPContrasenia, jTPregunta, jTRespuesta, jBCancelar);
        habilita(true, jBModificar, jBEliminar, jBAceptar);
        jBAceptar.setText("Nuevo");
        jBModificar.setText("Modificar");
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        this.setVisible(false);
        new VentanaAdministrador().setVisible(true);
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void jBCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarSesionActionPerformed
        this.setVisible(false);
        new VentanaLogin().setVisible(true);
    }//GEN-LAST:event_jBCerrarSesionActionPerformed

    private void jTIdUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIdUsuarioKeyPressed
        enter(this, evt, JCRFC);
    }//GEN-LAST:event_jTIdUsuarioKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        actualizarTabla();
        llenaComboRFC();
        jBCancelarActionPerformed(null);
    }//GEN-LAST:event_formWindowOpened

    private void JCRFCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JCRFCKeyPressed
        enter(this, evt, JTusuario);
    }//GEN-LAST:event_JCRFCKeyPressed

    private void JTusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTusuarioKeyPressed
        enter(this, evt, jPContrasenia);
    }//GEN-LAST:event_JTusuarioKeyPressed

    private void jTPreguntaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPreguntaKeyPressed
        enter(this, evt, jTRespuesta);
    }//GEN-LAST:event_jTPreguntaKeyPressed

    private void jPContraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPContraseniaKeyPressed
        enter(this, evt, jTPregunta);
    }//GEN-LAST:event_jPContraseniaKeyPressed

    private void jTRespuestaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRespuestaKeyPressed
        enter(this, evt, jBAceptar);
    }//GEN-LAST:event_jTRespuestaKeyPressed

    private void TablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsuariosMouseClicked
        jTIdUsuario.setText((String)modelo.getValueAt(TablaUsuarios.getSelectedRow(), 0));
        JTusuario.setText((String) modelo.getValueAt(TablaUsuarios.getSelectedRow(), 2));
        jPContrasenia.setText((String) modelo.getValueAt(TablaUsuarios.getSelectedRow(), 3));
        jTPregunta.setText((String) modelo.getValueAt(TablaUsuarios.getSelectedRow(), 4));
        jTRespuesta.setText((String) modelo.getValueAt(TablaUsuarios.getSelectedRow(), 5));
    }//GEN-LAST:event_TablaUsuariosMouseClicked

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        edicion();
        if (edicion)
        {
            jBModificar.setText("Aceptar");
            habilita(true, JCRFC, JTusuario, jPContrasenia, jTPregunta, jTRespuesta, jBCancelar);
            habilita(false, jBAceptar, jBEliminar);
        } else
        {
            if (Mensaje.pregunta(this, "¿Desea modifcar al usuario " + JTusuario.getText() + " ?") == 0)
            {
                jBModificar.setText("Modifcar");
                Usuario user = new Usuario(jTIdUsuario.getText(), JCRFC.getSelectedItem().toString(), JTusuario.getText(), jPContrasenia.getText(), jTPregunta.getText(), jTRespuesta.getText());
                ConsultasObjetos.Modifica(user, conectado(), "usuarios",(String)TablaUsuarios.getValueAt(TablaUsuarios.getSelectedRow(),0));
                habilita(true, JCRFC, JTusuario, jPContrasenia, jTPregunta, jTRespuesta);
                habilita(true, jBEliminar, jBModificar);
                actualizarTabla();
            }
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if (Mensaje.pregunta(this, "¿Desea eliminar a usuario " + JTusuario.getText() + "?") == 0)
        {
            Usuario user = new Usuario(jTIdUsuario.getText(), JCRFC.getSelectedItem().toString(), JTusuario.getText(), jPContrasenia.getText(), jTPregunta.getText(), jTRespuesta.getText());
            ConsultasObjetos.elimina("usuarios", "id_usuario", jTIdUsuario.getText(), 0, conectado());
            actualizarTabla();
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void JCRFCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCRFCItemStateChanged
        jTIdUsuario.setText(" ");
        jTIdUsuario.setText(JCRFC.getSelectedItem().toString());
    }//GEN-LAST:event_JCRFCItemStateChanged

    private void edicion() {
        if (edicion)
        {
            edicion = false;
        } else
        {
            edicion = true;
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
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VentanaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCRFC;
    private javax.swing.JTextField JTusuario;
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBCerrarSesion;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JLabel jLTituloUAPT;
    private javax.swing.JLabel jLTituloUniversidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPContrasenia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTIdUsuario;
    private javax.swing.JTextField jTPregunta;
    private javax.swing.JTextField jTRespuesta;
    // End of variables declaration//GEN-END:variables

    private void actualizarTabla() {
        modelo = (DefaultTableModel) TablaUsuarios.getModel();
        ArrayList users = new ArrayList();
        users = ConsultasObjetos.consultaMuchos("usuarios", null, null, conectado());
        if (users.isEmpty())
        {
            Mensaje.error(this, "No se encontraron usuarios registrados");
        } else
        {
            modelo.setRowCount(0);
            for (Object u : users)
            {
                Usuario user = (Usuario) u;
                modelo.addRow(new Object[]
                {
                    user.getIdUsuario(), user.getRfc(), user.getUsuario(), user.getContra(), user.getPreguntaSeguridad(), user.getRespuestaSeguridad()
                });
                System.out.println(((Usuario) u).getUsuario());
            }
        }
    }

    private void llenaComboRFC() {
        JCRFC.removeAllItems();

        ArrayList<String> lista = new ArrayList<String>();
        lista = ConsultasObjetos.llenaCombo("profesores", "rfc", ConectarBase.conectado());

        for (int i = 0; i < lista.size(); i++)
        {
            JCRFC.addItem(lista.get(i));
        }

    }
}
