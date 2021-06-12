/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Clases.Valida;
import Objetos.periodoEscolar;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import static cjb.ci.Validaciones.enter;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VentanaPeriodos extends javax.swing.JFrame {

    int id = 0;
    private Boolean edicion = true;
    private DefaultTableModel modelo;

    /**
     * Creates new form VentanaPrinicipal
     */
    public VentanaPeriodos() {
        initComponents();
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
        TablaPeriodos.getColumnModel().getColumn(0).setPreferredWidth(20);
        TablaPeriodos.getColumnModel().getColumn(1).setPreferredWidth(100);
        TablaPeriodos.getColumnModel().getColumn(0).setResizable(false);
        TablaPeriodos.getColumnModel().getColumn(1).setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBAceptar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPeriodos = new javax.swing.JTable();
        jBRegresar = new javax.swing.JButton();
        jBCerrarSesion = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTNombrePeriodo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTIdPeriodo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar2 = new javax.swing.JButton();
        btnAgregar3 = new javax.swing.JButton();
        jLTituloUAPT = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLTituloUniversidad = new javax.swing.JLabel();
        btnBusca = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtIDBusqeuda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horarios UAPT");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jBAceptar.setBackground(new java.awt.Color(102, 102, 0));
        jBAceptar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jBAceptar.setText("Aceptar");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        jBCancelar.setBackground(new java.awt.Color(102, 102, 0));
        jBCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        TablaPeriodos.setBackground(new java.awt.Color(25, 83, 0));
        TablaPeriodos.setForeground(new java.awt.Color(254, 254, 254));
        TablaPeriodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "PERIODO "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPeriodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPeriodosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPeriodos);

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
        jBCerrarSesion.setText("Salir");
        jBCerrarSesion.setToolTipText("");
        jBCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarSesionActionPerformed(evt);
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

        jPanel1.setBackground(new java.awt.Color(25, 83, 0));

        jTNombrePeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombrePeriodoActionPerformed(evt);
            }
        });
        jTNombrePeriodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTNombrePeriodoKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("PERIODO");

        jTIdPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdPeriodoActionPerformed(evt);
            }
        });
        jTIdPeriodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTIdPeriodoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTIdPeriodoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTIdPeriodoKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("ID PERIODO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTNombrePeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTIdPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTIdPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTNombrePeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jLTituloUAPT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLTituloUAPT.setText("UNIDAD ACADEMICA PROFESIONAL TIANGUISTENCO");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 1, 1));
        jLabel11.setText("GESTION PERIODOS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/UAEMex.jpg"))); // NOI18N

        jLTituloUniversidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLTituloUniversidad.setText("UNIVERSIDAD AUTONOMA DEL ESTADO DE MEXICO");

        btnBusca.setBackground(new java.awt.Color(102, 102, 0));
        btnBusca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBusca.setForeground(new java.awt.Color(255, 255, 255));
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(25, 83, 0));

        jtIDBusqeuda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIDBusqeudaFocusLost(evt);
            }
        });
        jtIDBusqeuda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtIDBusqeudaKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("INSERTE ID PARA BUSCAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtIDBusqeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtIDBusqeuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTituloUniversidad)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLTituloUAPT)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBRegresar)
                                .addGap(18, 18, 18)
                                .addComponent(jBCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregar2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(338, 338, 338))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTituloUniversidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLTituloUAPT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRegresar)
                    .addComponent(jBCerrarSesion))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTIdPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdPeriodoActionPerformed

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        if (!edicion)
        {
            edicion();
            jBAceptar.setText("Aceptar");
            CtrlInterfaz.limpia(jTIdPeriodo, jTNombrePeriodo);
            CtrlInterfaz.habilita(true, jTIdPeriodo, jTNombrePeriodo, jBCancelar);
            CtrlInterfaz.habilita(false, jBModificar, jBEliminar, btnAgregar2, btnAgregar3);
            CtrlInterfaz.selecciona(jTIdPeriodo);
        } else
        {
//            int valor = (Integer.parseInt(jTIdPeriodo.getText()));
            periodoEscolar per = new periodoEscolar(jTIdPeriodo.getText(), jTNombrePeriodo.getText());
            String mensaje = Controlador.ControladorPeriodos.insertaPeriodo(per);
            if (mensaje.equals("operacion exitosa"))
            {
                jBAceptar.setText("Nuevo");
                ConsultasObjetos.inserta(per, ConectarBase.conectado(), "periodo_escolar");
                CtrlInterfaz.habilita(false, jTIdPeriodo, jTNombrePeriodo, jBCancelar);
                CtrlInterfaz.habilita(true, jBModificar, jBEliminar, btnAgregar2, btnAgregar3);
                CtrlInterfaz.limpia(jTIdPeriodo, jTNombrePeriodo);
                actualizarTabla(1);
                edicion();
            } else
            {
                JOptionPane.showMessageDialog(rootPane, mensaje);
            }
        }
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        this.setVisible(false);
        new VentanaAdministrador().setVisible(true);
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void jBCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarSesionActionPerformed
        this.setVisible(false);
        new VentanaLogin().setVisible(true);
    }//GEN-LAST:event_jBCerrarSesionActionPerformed

    private void jTNombrePeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombrePeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombrePeriodoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cancelar();
        actualizarTabla(1);
    }//GEN-LAST:event_formWindowOpened

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        if (jTIdPeriodo.getText().compareTo("") == 0)
        {
            Mensaje.error(this, "NO HA SELECCIONADO NINGUN REGISTRO");
        } else
        {
            if (!edicion)
            {
                edicion();
                jBModificar.setText("Aceptar");
                CtrlInterfaz.habilita(true, jTNombrePeriodo, jBCancelar);
                CtrlInterfaz.habilita(false, jBEliminar, jBAceptar, jTIdPeriodo, btnAgregar2, btnAgregar3);
                CtrlInterfaz.selecciona(jTNombrePeriodo);
            } else
            {
                periodoEscolar perio = new periodoEscolar(jTIdPeriodo.getText(), jTNombrePeriodo.getText());
                String mensaje = Controlador.ControladorPeriodos.modificaPeriodo(perio, (String) TablaPeriodos.getValueAt(TablaPeriodos.getSelectedRow(), 0));
                if (mensaje.equals("operacion exitosa"))
                {
                    jBModificar.setText("Modificar");
                    CtrlInterfaz.habilita(false, jTIdPeriodo, jTNombrePeriodo, jBCancelar);
                    CtrlInterfaz.habilita(true, jBEliminar, jBAceptar, btnAgregar2, btnAgregar3);
                    CtrlInterfaz.limpia(jTIdPeriodo, jTNombrePeriodo);
                    actualizarTabla(1);
                    edicion();
                } else
                {
                    JOptionPane.showMessageDialog(rootPane, mensaje);
                }
            }
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if (Mensaje.pregunta(this, "¿En realidad quiere eliminar el periodo " + jTNombrePeriodo.getText() + "?") == 0)
        {
            String mensaje = Controlador.ControladorPeriodos.eliminarPeriodo(jTIdPeriodo.getText());
            if (mensaje.equals("operacion exitosa"))
            {
                actualizarTabla(1);
            } else
            {
                JOptionPane.showMessageDialog(rootPane, mensaje);
            }
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void TablaPeriodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPeriodosMouseClicked
        jTIdPeriodo.setText(modelo.getValueAt(TablaPeriodos.getSelectedRow(), 0).toString());
        jTNombrePeriodo.setText(modelo.getValueAt(TablaPeriodos.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_TablaPeriodosMouseClicked

    private void jTIdPeriodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIdPeriodoKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_jTIdPeriodoKeyTyped

    private void jTIdPeriodoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIdPeriodoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdPeriodoKeyReleased

    private void jTIdPeriodoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIdPeriodoKeyPressed
        Validaciones.enter(this, evt, jTNombrePeriodo);
    }//GEN-LAST:event_jTIdPeriodoKeyPressed

    private void jTNombrePeriodoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombrePeriodoKeyReleased
        Valida.convertirAMayusculas(jTNombrePeriodo);
    }//GEN-LAST:event_jTNombrePeriodoKeyReleased

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar3ActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        if (jtIDBusqeuda.getText().equals(""))
        {
            actualizarTabla(1);
        } else
        {
            actualizarTabla(2);
        }
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void jtIDBusqeudaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIDBusqeudaFocusLost
        Valida.convertirAMayusculas(jtIDBusqeuda);
    }//GEN-LAST:event_jtIDBusqeudaFocusLost

    private void jtIDBusqeudaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDBusqeudaKeyPressed
        enter(this, evt, btnBusca);
    }//GEN-LAST:event_jtIDBusqeudaKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaPeriodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaPeriodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaPeriodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaPeriodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPeriodos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPeriodos;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBCerrarSesion;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JLabel jLTituloUAPT;
    private javax.swing.JLabel jLTituloUniversidad;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTIdPeriodo;
    private javax.swing.JTextField jTNombrePeriodo;
    private javax.swing.JTextField jtIDBusqeuda;
    // End of variables declaration//GEN-END:variables

    public void actualizarTabla(int valor) {
        modelo = (DefaultTableModel) TablaPeriodos.getModel();
        ArrayList periodos = new ArrayList();
        if (valor == 1)
        {

            periodos = ConsultasObjetos.consultaMuchos("periodo_escolar", null, null, null, null, ConectarBase.conectado());
            if (periodos.isEmpty())
            {
                Mensaje.error(this, "No hay periodos registrados");
            } else
            {
                modelo.setRowCount(0);
                for (Object p : periodos)
                {
                    periodoEscolar periodo = (periodoEscolar) p;
                    modelo.addRow(new Object[]
                    {
                        periodo.getId_periodo(), periodo.getPeriodo()
                    });
                    System.out.println(((periodoEscolar) p).getPeriodo());
                }
            }
        } else if (valor == 2)
        {
            periodos = ConsultasObjetos.consultaMuchos("periodo_escolar", "id_periodo", jtIDBusqeuda.getText(), null, null, ConectarBase.conectado());
            if (periodos.isEmpty())
            {
                Mensaje.error(this, "No hay periodos registrados");
            } else
            {
                modelo.setRowCount(0);
                for (Object p : periodos)
                {
                    periodoEscolar periodo = (periodoEscolar) p;
                    modelo.addRow(new Object[]
                    {
                        periodo.getId_periodo(), periodo.getPeriodo()
                    });
                    System.out.println(((periodoEscolar) p).getPeriodo());
                }
            }
        }
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

    private void cancelar() {
        edicion();
        CtrlInterfaz.limpia(jTIdPeriodo, jTNombrePeriodo);
        CtrlInterfaz.habilita(false, jTIdPeriodo, jTNombrePeriodo, jBCancelar);
        CtrlInterfaz.habilita(true, jBAceptar, jBEliminar, jBModificar, btnAgregar2, btnAgregar3);
        jBAceptar.setText("Nuevo");
        jBModificar.setText("Modificar");
    }
}
