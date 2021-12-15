/*
 * Nombre de programadores:
 * Funcion principal del archivo:
 * Notas:
 */
package redisenio;

import Clases.Archivo;
import Clases.ConectarBase;
import Clases.ConsultasObjetos;
import Clases.Valida;
import Objetos.periodoEscolar;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MoisesVidalHernandez
 */
    

public class VtnPeriodos extends javax.swing.JFrame {

    int id = 0;
    private Boolean edicion = true;
    private DefaultTableModel modelo;
    /**
     * Creates new form VtnDocentes
     */
    public VtnPeriodos() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Iconos2/SCHR.png")).getImage());
        this.setExtendedState(MAXIMIZED_BOTH);
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
        java.awt.GridBagConstraints gridBagConstraints;

        panelCaptura = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelnombre = new javax.swing.JLabel();
        labelnombre1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panelConsulta1 = new javax.swing.JPanel();
        panelFiltros = new javax.swing.JPanel();
        panelBusqeuda = new javax.swing.JPanel();
        labelnombre8 = new javax.swing.JLabel();
        labelnombre7 = new javax.swing.JLabel();
        txtIdBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        panelTabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPeriodos = new javax.swing.JTable();
        panelEXportacion = new javax.swing.JPanel();
        labelnombre10 = new javax.swing.JLabel();
        txtNombreArchivo1 = new javax.swing.JTextField();
        btnExportar1 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        panelCaptura.setBackground(new java.awt.Color(255, 255, 255));
        panelCaptura.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        labelnombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelnombre.setForeground(new java.awt.Color(255, 255, 255));
        labelnombre.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(labelnombre, gridBagConstraints);

        labelnombre1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelnombre1.setForeground(new java.awt.Color(255, 255, 255));
        labelnombre1.setText("PERIODO");
        labelnombre1.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(labelnombre1, gridBagConstraints);

        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(txtId, gridBagConstraints);

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(txtNombre, gridBagConstraints);

        btnNuevo.setBackground(new java.awt.Color(102, 102, 0));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(btnNuevo, gridBagConstraints);

        btnEliminar.setBackground(new java.awt.Color(102, 102, 0));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(btnEliminar, gridBagConstraints);

        btnModificar.setBackground(new java.awt.Color(102, 102, 0));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(btnModificar, gridBagConstraints);

        btnCancelar.setBackground(new java.awt.Color(102, 102, 0));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelCaptura.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(panelCaptura, gridBagConstraints);

        panelConsulta1.setLayout(new java.awt.GridBagLayout());

        panelFiltros.setBackground(new java.awt.Color(255, 204, 204));
        panelFiltros.setLayout(new java.awt.GridBagLayout());

        panelBusqeuda.setBackground(new java.awt.Color(255, 255, 255));
        panelBusqeuda.setLayout(new java.awt.GridBagLayout());

        labelnombre8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelnombre8.setText("GESTION PERIODOS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelBusqeuda.add(labelnombre8, gridBagConstraints);

        labelnombre7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelnombre7.setText("PARA BUSCAR ESCRIBA EL PERIODO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelBusqeuda.add(labelnombre7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelBusqeuda.add(txtIdBusqueda, gridBagConstraints);

        btnBuscar.setBackground(new java.awt.Color(102, 102, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelBusqeuda.add(btnBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        panelFiltros.add(panelBusqeuda, gridBagConstraints);

        panelTabla.setLayout(new java.awt.GridBagLayout());

        TablaPeriodos.setBackground(new java.awt.Color(255, 255, 204));
        TablaPeriodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "PERIODO"
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
        jScrollPane2.setViewportView(TablaPeriodos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelTabla.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelFiltros.add(panelTabla, gridBagConstraints);

        panelEXportacion.setBackground(new java.awt.Color(0, 51, 0));
        panelEXportacion.setLayout(new java.awt.GridBagLayout());

        labelnombre10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelnombre10.setForeground(new java.awt.Color(255, 255, 255));
        labelnombre10.setText("SI DESEA EXPORTAR ARCHIVO EXCEL, ESCRIBA UN NOMBRE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelEXportacion.add(labelnombre10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelEXportacion.add(txtNombreArchivo1, gridBagConstraints);

        btnExportar1.setBackground(new java.awt.Color(102, 102, 0));
        btnExportar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExportar1.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar1.setText("EXPORTAR");
        btnExportar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportar1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelEXportacion.add(btnExportar1, gridBagConstraints);

        btnRegresar.setBackground(new java.awt.Color(102, 102, 0));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/flecha(2).png"))); // NOI18N
        btnRegresar.setText("REGRESAR AL MENÚ");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelEXportacion.add(btnRegresar, gridBagConstraints);

        btnCerrar.setBackground(new java.awt.Color(153, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos2/flecha(3).png"))); // NOI18N
        btnCerrar.setText("SALIR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelEXportacion.add(btnCerrar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        panelFiltros.add(panelEXportacion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelConsulta1.add(panelFiltros, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(panelConsulta1, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
        new VtnAdministrador().setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         if (!edicion)
        {
            edicion();
            btnNuevo.setText("ACEPTAR");
            CtrlInterfaz.limpia(txtId, txtNombre);
            CtrlInterfaz.habilita(true,txtId, txtNombre, btnCancelar);
            CtrlInterfaz.habilita(false, btnModificar, btnEliminar, btnExportar1);
            CtrlInterfaz.selecciona(txtId);
        } else
        {
//            int valor = (Integer.parseInt(jTIdPeriodo.getText()));
            periodoEscolar per = new periodoEscolar(txtId.getText(), txtNombre.getText());
            String mensaje = Controlador.ControladorPeriodos.insertaPeriodo(per);
            if (mensaje.equals("operacion exitosa"))
            {
                btnNuevo.setText("NUEVO");
                ConsultasObjetos.inserta(per, ConectarBase.conectado(), "periodo_escolar");
                CtrlInterfaz.habilita(false,txtId, txtNombre, btnCancelar);
                CtrlInterfaz.habilita(true,  btnModificar, btnEliminar, btnExportar1);
                CtrlInterfaz.limpia(txtId, txtNombre);
                actualizarTabla(1);
                edicion();
            } else
            {
                JOptionPane.showMessageDialog(rootPane, mensaje);
            }
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cancelar();
        actualizarTabla(1);
    }//GEN-LAST:event_formWindowOpened

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         if (txtId.getText().compareTo("") == 0)
        {
            Mensaje.error(this, "NO HA SELECCIONADO NINGUN REGISTRO");
        } else
        {
            if (!edicion)
            {
                edicion();
                btnModificar.setText("ACEPTAR");
                CtrlInterfaz.habilita(true, txtNombre, btnCancelar);
                CtrlInterfaz.habilita(false, btnEliminar, btnNuevo, txtId, btnExportar1);
                CtrlInterfaz.selecciona(txtNombre);
            } else
            {
                periodoEscolar perio = new periodoEscolar(txtId.getText(), txtNombre.getText());
                String mensaje = Controlador.ControladorPeriodos.modificaPeriodo(perio, txtId.getText());
                if (mensaje.equals("operacion exitosa"))
                {
                        btnModificar.setText("MODIFICAR");
                    CtrlInterfaz.habilita(false, txtId, txtNombre, btnCancelar);
                    CtrlInterfaz.habilita(true, btnEliminar, btnNuevo, btnExportar1);
                    CtrlInterfaz.limpia(txtId, txtNombre);
                    actualizarTabla(1);
                    edicion();
                } else
                {
                    JOptionPane.showMessageDialog(rootPane, mensaje);
                }
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (Mensaje.pregunta(this, "¿En realidad quiere eliminar el periodo " + txtNombre.getText() + "?") == 0)
        {
            String mensaje = Controlador.ControladorPeriodos.eliminarPeriodo(txtId.getText());
            if (mensaje.equals("operacion exitosa"))
            {
                actualizarTabla(1);
            } else
            {
                JOptionPane.showMessageDialog(rootPane, mensaje);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TablaPeriodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPeriodosMouseClicked
        txtId.setText(modelo.getValueAt(TablaPeriodos.getSelectedRow(), 0).toString());
        txtNombre.setText(modelo.getValueAt(TablaPeriodos.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_TablaPeriodosMouseClicked

    private void btnExportar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportar1ActionPerformed
        if (txtNombreArchivo1.getText() != null) {
            String mensaje = Archivo.Exportar(TablaPeriodos, txtNombreArchivo1.getText());
            if (mensaje.equals("Error en la Exportacion")) {
                Mensaje.error(this, mensaje);
            } else {
                Mensaje.exito(this, mensaje);
            }
        } else {
            Mensaje.error(this, "Escriba el nombre del archivo");
        }
    }//GEN-LAST:event_btnExportar1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtIdBusqueda.getText().equals(""))
        {
            actualizarTabla(1);
        } else
        {
            actualizarTabla(2);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        Valida.validaLongitud(txtId, 5, evt);
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        Validaciones.enter(this, evt, txtNombre);
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost
        Valida.convertirAMayusculas(txtId);
    }//GEN-LAST:event_txtIdFocusLost

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        Valida.convertirAMayusculas(txtNombre);
    }//GEN-LAST:event_txtNombreFocusLost

    public void actualizarTabla(int valor) {
        modelo = (DefaultTableModel) TablaPeriodos.getModel();
        ArrayList periodos = new ArrayList();
        if (valor == 1)
        {

            periodos = ConsultasObjetos.consultaMuchos("periodo_escolar", null, null, null, null, "periodo", ConectarBase.conectado());
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
                    btnBuscar.setText("Buscar");
                }
            }
        } else if (valor == 2)
        {
            periodos = ConsultasObjetos.consultaMuchos("periodo_escolar", "periodo", txtIdBusqueda.getText(), null, null, "periodo", ConectarBase.conectado());
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
                    btnBuscar.setText("Todos");
                    txtIdBusqueda.setText("");
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
        CtrlInterfaz.limpia(txtId, txtNombre);
        CtrlInterfaz.habilita(false, txtId, txtNombre, btnCancelar);
        CtrlInterfaz.habilita(true, btnNuevo, btnEliminar, btnModificar, btnExportar1);
        btnNuevo.setText("Nuevo");
        btnModificar.setText("Modificar");
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
            java.util.logging.Logger.getLogger(VtnPeriodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnPeriodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnPeriodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnPeriodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new VtnPeriodos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPeriodos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportar1;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labelnombre1;
    private javax.swing.JLabel labelnombre10;
    private javax.swing.JLabel labelnombre7;
    private javax.swing.JLabel labelnombre8;
    private javax.swing.JPanel panelBusqeuda;
    private javax.swing.JPanel panelCaptura;
    private javax.swing.JPanel panelConsulta1;
    private javax.swing.JPanel panelEXportacion;
    private javax.swing.JPanel panelFiltros;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdBusqueda;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArchivo1;
    // End of variables declaration//GEN-END:variables
}


