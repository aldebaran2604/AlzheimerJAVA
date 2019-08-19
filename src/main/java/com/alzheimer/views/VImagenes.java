/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.views;

import com.alzheimer.custom_controls.CustomTableModelImagenes;
import com.alzheimer.models.Imagenes;
import com.alzheimer.models.Modelo;
import com.alzheimer.models.Pacientes;
import com.alzheimer.utilities.Globals;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author root
 */
public class VImagenes extends javax.swing.JPanel {

    
    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    
    private static VImagenes instance = null;
    
    CustomTableModelImagenes ctmi = new CustomTableModelImagenes();
    
    private Imagenes imagen = new Imagenes();
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    
    /**
     * Creates new form VImagenes
     */
    public VImagenes() {
        initComponents();
        inicializar();
    }
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnArriba = new javax.swing.JButton();
        btnAbajo = new javax.swing.JButton();
        jTabbedPane = new javax.swing.JTabbedPane();
        jspLista = new javax.swing.JScrollPane();
        jtImagenes = new javax.swing.JTable();
        jspDetalle = new javax.swing.JScrollPane();
        jpDetalle = new javax.swing.JPanel();
        lbPaciente = new javax.swing.JLabel();
        lbDirectorio = new javax.swing.JLabel();
        lbParentesco = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        jcmbPacientes = new javax.swing.JComboBox<>();
        txtDirectorio = new javax.swing.JTextField();
        txtParentesco = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();

        jToolBar.setFloatable(false);
        jToolBar.setRollover(true);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/new.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setMaximumSize(new java.awt.Dimension(24, 24));
        btnNuevo.setMinimumSize(new java.awt.Dimension(24, 24));
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        jToolBar.add(btnNuevo);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/edit.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setMaximumSize(new java.awt.Dimension(24, 24));
        btnEditar.setMinimumSize(new java.awt.Dimension(24, 24));
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        jToolBar.add(btnEditar);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/save.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setMaximumSize(new java.awt.Dimension(24, 24));
        btnGuardar.setMinimumSize(new java.awt.Dimension(24, 24));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        jToolBar.add(btnGuardar);

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/delete.png"))); // NOI18N
        btnBorrar.setToolTipText("Eliminar");
        btnBorrar.setFocusable(false);
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrar.setMaximumSize(new java.awt.Dimension(24, 24));
        btnBorrar.setMinimumSize(new java.awt.Dimension(24, 24));
        btnBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });
        jToolBar.add(btnBorrar);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/update.png"))); // NOI18N
        btnActualizar.setToolTipText("Actualizar");
        btnActualizar.setFocusable(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnActualizar.setMaximumSize(new java.awt.Dimension(24, 24));
        btnActualizar.setMinimumSize(new java.awt.Dimension(24, 24));
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        jToolBar.add(btnActualizar);

        btnArriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/up.png"))); // NOI18N
        btnArriba.setToolTipText("Subir");
        btnArriba.setFocusable(false);
        btnArriba.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArriba.setMaximumSize(new java.awt.Dimension(24, 24));
        btnArriba.setMinimumSize(new java.awt.Dimension(24, 24));
        btnArriba.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnArriba);

        btnAbajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/down.png"))); // NOI18N
        btnAbajo.setToolTipText("Bajar");
        btnAbajo.setFocusable(false);
        btnAbajo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbajo.setMaximumSize(new java.awt.Dimension(24, 24));
        btnAbajo.setMinimumSize(new java.awt.Dimension(24, 24));
        btnAbajo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnAbajo);

        jtImagenes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jspLista.setViewportView(jtImagenes);

        jTabbedPane.addTab("Lista", jspLista);

        lbPaciente.setText("Paciente:");

        lbDirectorio.setText("Directorio:");

        lbParentesco.setText("Parentesco:");
        lbParentesco.setToolTipText("");

        lbDescripcion.setText("Descripción:");

        txtDirectorio.setEditable(false);
        txtDirectorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDirectorioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpDetalleLayout = new javax.swing.GroupLayout(jpDetalle);
        jpDetalle.setLayout(jpDetalleLayout);
        jpDetalleLayout.setHorizontalGroup(
            jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetalleLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpDetalleLayout.createSequentialGroup()
                        .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPaciente)
                            .addComponent(lbDirectorio)
                            .addComponent(lbParentesco))
                        .addGap(18, 18, 18)
                        .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcmbPacientes, 0, 206, Short.MAX_VALUE)
                            .addComponent(txtDirectorio)
                            .addComponent(txtParentesco)))
                    .addGroup(jpDetalleLayout.createSequentialGroup()
                        .addComponent(lbDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescripcion)))
                .addGap(39, 39, Short.MAX_VALUE))
        );
        jpDetalleLayout.setVerticalGroup(
            jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetalleLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPaciente)
                    .addComponent(jcmbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDirectorio)
                    .addComponent(txtDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbParentesco)
                    .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jspDetalle.setViewportView(jpDetalle);

        jTabbedPane.addTab("Detalle", jspDetalle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Eventos">
    
    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        jcmbPacientes.setSelectedIndex(0);
        txtDirectorio.setText("");
        txtParentesco.setText("");
        txtDescripcion.setText("");
        imagen.setPacientes(null);
        imagen.setId(0);
        imagen.setDirectorio("");
        imagen.setDescripcion("");
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if(jtImagenes.getSelectedRow() > -1){
            imagen = ctmi.getValue(jtImagenes.getSelectedRow());
            jcmbPacientes.setSelectedItem(imagen.getPacientes());
            txtDirectorio.setText(imagen.getDirectorio());
            txtParentesco.setText(imagen.getParentescos());
            txtDescripcion.setText(imagen.getDescripcion());
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        imagen.setPacientes((Pacientes)jcmbPacientes.getSelectedItem());
        imagen.setDirectorio(txtDirectorio.getText().trim());
        imagen.setDescripcion(txtDescripcion.getText().trim());
        imagen.setParentescos(txtParentesco.getText().trim());
        if(imagen.getId() != null){
            Modelo.save(getUpdateQuery(imagen));
        }
        else{
            Modelo.save(getInsertQuery(imagen));
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        if(jtImagenes.getSelectedRow() > -1){
            imagen = ctmi.getValue(jtImagenes.getSelectedRow());
            imagen.delete();
            inicializar();
        }
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        inicializar();
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void txtDirectorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDirectorioMouseClicked
        Pacientes paciente = (Pacientes)jcmbPacientes.getSelectedItem();
        if(paciente!= null){
            int pacienteID = paciente.getId();
            
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "png"));
            int seleccion = fc.showOpenDialog(this);
            if(seleccion == JFileChooser.APPROVE_OPTION){
                File origen = fc.getSelectedFile();
                
                File directorio = new File(Globals.getDirectorioImagenes() + "/" + pacienteID);
                if(!directorio.exists()){
                    directorio.mkdirs();
                }
                
                File destino = new File(Globals.getDirectorioImagenes() + "/" + pacienteID + "/" + origen.getName());
                
                try {
                    Files.copy(origen.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException ex) {
                    Logger.getLogger(VImagenes.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                txtDirectorio.setText("/" + pacienteID + "/" + origen.getName());
            }
            
        }
    }//GEN-LAST:event_txtDirectorioMouseClicked

    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Métodos">
    
    public static VImagenes getInstance(){
        if(instance == null){
            instance = new VImagenes();
        }
        return instance;
    }
    
    private void inicializar(){
        cargarPacientes();
        cargarImagenes();
    }
    
    private void cargarImagenes() {
        ctmi.addRows(imagen.getList());
        jtImagenes.setModel(ctmi);
        jtImagenes.repaint();
    }
    
    private void cargarPacientes(){
        List<Pacientes> pacientes = new Pacientes().getList();
        pacientes.forEach(p->{
            jcmbPacientes.addItem(p);
        });
    }
    
    private String getInsertQuery(Imagenes imagen){
        StringBuilder query = new StringBuilder();
            query.append("INSERT INTO imagenes")
            .append(" (paciente_id, directorio, descripcion, parentesco) ")
            .append(" VALUES ('").append(imagen.getPacientes().getId()).append("', '")
            .append(imagen.getDirectorio()).append("', '").append(imagen.getDescripcion()).append("', '")
            .append(imagen.getParentescos()).append("') ");

        return query.toString();
    }
    
    private String getUpdateQuery(Imagenes imagen){
        StringBuilder query = new StringBuilder();
        query.append(" UPDATE imagenes ")
        .append(" SET directorio='").append(imagen.getDirectorio()).append("', descripcion='").append(imagen.getDescripcion()).append("', parentesco='").append(imagen.getParentescos()).append("' ")
        .append(" WHERE id='2' ");

        return query.toString();
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbajo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnArriba;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JComboBox<Pacientes> jcmbPacientes;
    private javax.swing.JPanel jpDetalle;
    private javax.swing.JScrollPane jspDetalle;
    private javax.swing.JScrollPane jspLista;
    private javax.swing.JTable jtImagenes;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbDirectorio;
    private javax.swing.JLabel lbPaciente;
    private javax.swing.JLabel lbParentesco;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDirectorio;
    private javax.swing.JTextField txtParentesco;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
