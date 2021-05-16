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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class VistaExcel extends javax.swing.JFrame {

    /**
     * Creates new form VistaExcel
     */
    public VistaExcel() {
        initComponents();
    }

    File archivo;
    int numcorreo = 0;
    String tipoExcel = "";
    String cabeceras[];
    String cabecerasProfesor[] = {"rfc", "apellido paterno", "apellido materno", "nombre", "grado academico", "correo", "telefono"};
    String cabecerasMateria[] = {"clave de la materia", "unidad de aprendizaje", "horas", "creditos", "numero de periodo", "nucleo", "tipo", "licenciatura", "plan de estudios"};
    String cabecerasHorario[] = {"clave_materia", "unidad_aprendizaje", "rfc", "profesor", "grupo", "dia", "entrada", "salida"};

    private File abrirArchivo() {
        String aux = "";
        String texto = "";
        String nombre = "";
        File abre = null;

        try {
            /**
             * llamamos el metodo que permite cargar la ventana
             */
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(this);
            nombre = file.getSelectedFile().getName();
            /**
             * abrimos el archivo seleccionado
             */

            abre = file.getSelectedFile();
            //Archivo.AbreArchivoV1(abre);
            return abre;
//
//            /**
//             * recorremos el archivo, lo leemos para plasmarlo en el area de texto
//             */
//            if (abre != null) {
//                FileReader archivos = new FileReader(abre);
//                BufferedReader lee = new BufferedReader(archivos);
//                while ((aux = lee.readLine()) != null) {
//                    texto += aux + "\n";
//                }
//                lee.close();
//            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex + ""
                    + "\nNo se ha encontrado el archivo",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
        }
        return abre;
        //El texto se almacena en el JTextArea
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImportar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDatosExcel = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtconsulta = new javax.swing.JTextArea();
        btnPrueba = new javax.swing.JButton();
        btnidentifica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnImportar.setText("Importar");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        jTDatosExcel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTDatosExcel);

        jButton2.setText("Cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtconsulta.setColumns(20);
        txtconsulta.setRows(5);
        jScrollPane2.setViewportView(txtconsulta);

        btnPrueba.setText("Prueba");
        btnPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaActionPerformed(evt);
            }
        });

        btnidentifica.setText("Identifica");
        btnidentifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnidentificaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnPrueba)
                .addGap(34, 34, 34)
                .addComponent(btnidentifica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnImportar)
                            .addComponent(btnExportar)
                            .addComponent(btnPrueba)
                            .addComponent(btnidentifica)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 182, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        archivo = abrirArchivo();
        Archivo.Importar(archivo, jTDatosExcel);
        cabeceras = new String[jTDatosExcel.getColumnCount()];
        for (int i = 0; i < jTDatosExcel.getColumnCount(); i++) {
            cabeceras[i] = jTDatosExcel.getColumnName(i);
        }
    }//GEN-LAST:event_btnImportarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    public ArrayList<Object> extraeDatos() {
        ArrayList profesores = new ArrayList();

        for (int i = 0; i < jTDatosExcel.getRowCount(); i++) {
            Profesor profe = new Profesor();
            profe.setRfc(String.valueOf(jTDatosExcel.getValueAt(i, 0)));
            System.out.println(String.valueOf(jTDatosExcel.getValueAt(i, 0)));
            profe.setNombres((String) jTDatosExcel.getValueAt(i, 3));
            profe.setApellidoP((String) jTDatosExcel.getValueAt(i, 1));
            profe.setApellidoM((String) jTDatosExcel.getValueAt(i, 2));
            profe.setCorreo("no ingresado" + String.valueOf(numcorreo++));
            profe.setTelefono((String) jTDatosExcel.getValueAt(i, 2));
            profe.setGradoAcademico((String) jTDatosExcel.getValueAt(i, 2));
            profesores.add(profe);
        }
        return profesores;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (tipoExcel.equals("profesor")) {
            ArrayList<Object> profes = extraeDatos();
            //Controlador.ControladorProfesores.insertaMuchos(profes);
            
            
        }

//        for(Object obj : profes){
//            Profesor p = (Profesor)obj;
//            System.out.println(p.getNombres());
//            
//        }
        //txtconsulta.setText(ConsultasObjetos.retornaConsulta(profes, ConectarBase.conectado(), "profesores"));
        //ConsultasObjetos.insertaMuchos(profes, ConectarBase.conectado(), "profesores");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaActionPerformed
        txtconsulta.setText("Cambio");
        for (int i = 0; i < cabeceras.length; i++) {
            System.out.println("Cabecera numero " + i + ": " + cabeceras[i]);
        }
    }//GEN-LAST:event_btnPruebaActionPerformed

    private void btnidentificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnidentificaActionPerformed
        tipoExcel = identifica();
    }//GEN-LAST:event_btnidentificaActionPerformed

    
    
    public String identifica(){
        boolean identificado = false;
        if (cabeceras.length == cabecerasProfesor.length) {
            for (int i = 0; i < cabeceras.length; i++) {
                if (!cabeceras[i].equalsIgnoreCase(cabecerasProfesor[i])) {
                    break;
                }
            }
            txtconsulta.setText("Es un profesor");
            identificado = true;
            return "profesor";
            
        }
        if (cabeceras.length == cabecerasMateria.length && identificado) {
            for (int i = 0; i < cabeceras.length; i++) {
                if (!cabeceras[i].equalsIgnoreCase(cabecerasMateria[i])) {
                    break;
                }
            }
            txtconsulta.setText("Es una materia");
            identificado = true;
            return "materia";
        }

        if (cabeceras.length == cabecerasHorario.length) {
            for (int i = 0; i < cabeceras.length; i++) {
                if (!cabeceras[i].equalsIgnoreCase(cabecerasHorario[i])) {
                    break;
                }
            }
            txtconsulta.setText("Es un Horario");
            identificado = true;
            return "profesor";
        }
        if (!identificado) {
            txtconsulta.setText("No es encontro el tipo de excel");
        }
        return null;
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
            java.util.logging.Logger.getLogger(VistaExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaExcel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExportar;
    public javax.swing.JButton btnImportar;
    private javax.swing.JButton btnPrueba;
    private javax.swing.JButton btnidentifica;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTDatosExcel;
    private javax.swing.JTextArea txtconsulta;
    // End of variables declaration//GEN-END:variables
}
