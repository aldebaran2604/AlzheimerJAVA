/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.views;

import com.alzheimer.custom_controls.CustomTableModelConsultas;
import com.alzheimer.custom_controls.CustomTableModelExamenes;
import com.alzheimer.models.Consultas;
import com.alzheimer.models.Examenes;
import com.alzheimer.models.Pacientes;
import com.alzheimer.utilities.Globals;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aldebaran
 */
public class VConsultas extends javax.swing.JPanel {

    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    
    private static VConsultas instance = null;
    
    private final CustomTableModelConsultas ctmc = new CustomTableModelConsultas();
    private final CustomTableModelExamenes ctme = new CustomTableModelExamenes();
    private Consultas consulta = new Consultas();
    private final Examenes examen = new Examenes();
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Creates new form VConsultas
     */
    public VConsultas() {
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
        btnConsultas = new javax.swing.JButton();
        jTabbedPane = new javax.swing.JTabbedPane();
        jspLista = new javax.swing.JScrollPane();
        jtConsultas = new javax.swing.JTable();
        jspDetalle = new javax.swing.JScrollPane();
        jpDetalle = new javax.swing.JPanel();
        lbPaciente = new javax.swing.JLabel();
        jcmbPacientes = new javax.swing.JComboBox<>();
        lbFecha = new javax.swing.JLabel();
        jftFecha = new javax.swing.JFormattedTextField();
        jspDetalleConsultas = new javax.swing.JScrollPane();
        jtDetale = new javax.swing.JTable();

        jToolBar.setFloatable(false);
        jToolBar.setRollover(true);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/new.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setMargin(new java.awt.Insets(0, 0, 0, 0));
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
        btnEditar.setMargin(new java.awt.Insets(0, 0, 0, 0));
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
        btnGuardar.setMargin(new java.awt.Insets(0, 0, 0, 0));
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
        btnBorrar.setMargin(new java.awt.Insets(0, 0, 0, 0));
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
        btnArriba.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnArriba.setMaximumSize(new java.awt.Dimension(24, 24));
        btnArriba.setMinimumSize(new java.awt.Dimension(24, 24));
        btnArriba.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnArriba);

        btnAbajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/down.png"))); // NOI18N
        btnAbajo.setToolTipText("Bajar");
        btnAbajo.setFocusable(false);
        btnAbajo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbajo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAbajo.setMaximumSize(new java.awt.Dimension(24, 24));
        btnAbajo.setMinimumSize(new java.awt.Dimension(24, 24));
        btnAbajo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnAbajo);

        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/treatment.png"))); // NOI18N
        btnConsultas.setToolTipText("Consultas");
        btnConsultas.setFocusable(false);
        btnConsultas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultas.setMaximumSize(new java.awt.Dimension(24, 24));
        btnConsultas.setMinimumSize(new java.awt.Dimension(24, 24));
        btnConsultas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultasMouseClicked(evt);
            }
        });
        jToolBar.add(btnConsultas);

        jtConsultas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jspLista.setViewportView(jtConsultas);

        jTabbedPane.addTab("Lista", jspLista);

        jpDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbPaciente.setText("Paciente:");

        lbFecha.setText("Fecha:");

        jftFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jtDetale.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jspDetalleConsultas.setViewportView(jtDetale);

        javax.swing.GroupLayout jpDetalleLayout = new javax.swing.GroupLayout(jpDetalle);
        jpDetalle.setLayout(jpDetalleLayout);
        jpDetalleLayout.setHorizontalGroup(
            jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetalleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspDetalleConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jpDetalleLayout.createSequentialGroup()
                        .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPaciente)
                            .addComponent(lbFecha))
                        .addGap(18, 18, 18)
                        .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jpDetalleLayout.setVerticalGroup(
            jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetalleLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPaciente)
                    .addComponent(jcmbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha)
                    .addComponent(jftFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspDetalleConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jspDetalle.setViewportView(jpDetalle);

        jTabbedPane.addTab("Detalle", jspDetalle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Eventos">
    
    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        jcmbPacientes.setSelectedIndex(0);
        jftFecha.setValue(new Date());
        consulta.setId(null);
        consulta.setPacientes(null);
        consulta.setUsuarios(null);
        consulta.setFecha(new Date());
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        obtenerListaExamenes();
        if(jtConsultas.getSelectedRow() > -1){
            consulta = ctmc.getValue(jtConsultas.getSelectedRow());
            jcmbPacientes.setSelectedItem(consulta.getPacientes());
            jftFecha.setValue(consulta.getFecha());
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        consulta.setPacientes((Pacientes)jcmbPacientes.getSelectedItem());
        consulta.setUsuarios(Globals.medico);
        consulta.setFecha((Date)jftFecha.getValue());
        inicializar();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        if(jtConsultas.getSelectedRow() > -1){
            consulta = ctmc.getValue(jtConsultas.getSelectedRow());
            consulta.delete();
            inicializar();
        }
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultasMouseClicked
        iniciarExamen();
    }//GEN-LAST:event_btnConsultasMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        inicializar();
    }//GEN-LAST:event_btnActualizarMouseClicked

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">
    
    public static VConsultas getInstance(){
        if(instance == null){
            instance = new VConsultas();
        }
        return instance;
    }
    
    private void inicializar(){
        cargarConsultas();
        cargarPacientes();
    }
    
    private void cargarConsultas(){
        ctmc.addRows(consulta.getList());
        jtConsultas.setModel(ctmc);
        jtConsultas.repaint();
    }
    
    private void cargarPacientes(){
        jcmbPacientes.removeAllItems();
        List<Pacientes> pacientes = new Pacientes().getList();
        pacientes.forEach(p->{
            jcmbPacientes.addItem(p);
        });
        jcmbPacientes.repaint();
    }
    
    private void iniciarExamen(){
        if(jtConsultas.getSelectedRow() > -1){
            VExamen vexamenModal = new VExamen(VMenu.getInstance(), ctme.getValue(jtConsultas.getSelectedRow()).getId());
            vexamenModal.setVisible(true);
        }
    }
    
    private void obtenerListaExamenes(){
        if(jtConsultas.getSelectedRow() > -1){
            String where = "where consulta_id = " + ctme.getValue(jtConsultas.getSelectedRow()).getId();
            ctme.addRows(examen.getListaByWhere(where));
            jtDetale.setModel(ctme);
            jtDetale.repaint();
        } else {
            jtDetale.setModel(ctme);
            jtDetale.repaint();
        }
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbajo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnArriba;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JComboBox<Pacientes> jcmbPacientes;
    private javax.swing.JFormattedTextField jftFecha;
    private javax.swing.JPanel jpDetalle;
    private javax.swing.JScrollPane jspDetalle;
    private javax.swing.JScrollPane jspDetalleConsultas;
    private javax.swing.JScrollPane jspLista;
    private javax.swing.JTable jtConsultas;
    private javax.swing.JTable jtDetale;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbPaciente;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
