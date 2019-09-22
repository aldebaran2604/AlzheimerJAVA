/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.views;

import com.alzheimer.custom_controls.CustomTableModelPacientes;
import com.alzheimer.models.Modelo;
import com.alzheimer.models.Pacientes;
import com.alzheimer.utilities.Globals;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aldebaran
 */
public class VPacientes extends javax.swing.JPanel {

    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    
    private static VPacientes instance = null;
    
    CustomTableModelPacientes ctmp = new CustomTableModelPacientes();
    
    private Pacientes paciente = new Pacientes();
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    
    /**
     * Creates new form VPacientes
     */
    public VPacientes() {
        initComponents();
        inicializar();
    }
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngSexo = new javax.swing.ButtonGroup();
        jToolBar = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jTabbedPane = new javax.swing.JTabbedPane();
        jspLista = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        jspDetalle = new javax.swing.JScrollPane();
        jpDetalle = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        lbApellidoPaterno = new javax.swing.JLabel();
        jtfApellidoPaterno = new javax.swing.JTextField();
        lbApellidoMaterno = new javax.swing.JLabel();
        jtfApellicoMaterno = new javax.swing.JTextField();
        lbFechaNacimiento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jrbHombre = new javax.swing.JRadioButton();
        jrbMujer = new javax.swing.JRadioButton();
        jftFechaNacimiento = new javax.swing.JFormattedTextField();

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

        jtPacientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jspLista.setViewportView(jtPacientes);

        jTabbedPane.addTab("Lista", jspLista);

        lbNombre.setText("Nombre:");

        lbApellidoPaterno.setText("Apellido Paterno:");

        lbApellidoMaterno.setText("Apellido Materno:");

        lbFechaNacimiento.setText("Fecha de Nacimiento:");

        jLabel1.setText("Sexo:");

        btngSexo.add(jrbHombre);
        jrbHombre.setSelected(true);
        jrbHombre.setText("Hombre");

        btngSexo.add(jrbMujer);
        jrbMujer.setText("Mujer");

        jftFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        javax.swing.GroupLayout jpDetalleLayout = new javax.swing.GroupLayout(jpDetalle);
        jpDetalle.setLayout(jpDetalleLayout);
        jpDetalleLayout.setHorizontalGroup(
            jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetalleLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDetalleLayout.createSequentialGroup()
                        .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombre)
                            .addComponent(lbApellidoPaterno)
                            .addComponent(lbApellidoMaterno))
                        .addGap(15, 15, 15)
                        .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfApellidoPaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfApellicoMaterno))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpDetalleLayout.createSequentialGroup()
                        .addComponent(lbFechaNacimiento)
                        .addGap(18, 18, 18)
                        .addComponent(jftFechaNacimiento))
                    .addGroup(jpDetalleLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbHombre)
                        .addGap(39, 39, 39)
                        .addComponent(jrbMujer)))
                .addGap(54, 54, 54))
        );
        jpDetalleLayout.setVerticalGroup(
            jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetalleLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbApellidoPaterno)
                    .addComponent(jtfApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbApellidoMaterno)
                    .addComponent(jtfApellicoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFechaNacimiento)
                    .addComponent(jftFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jrbHombre)
                    .addComponent(jrbMujer))
                .addContainerGap(68, Short.MAX_VALUE))
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
    
    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        cargarPacientes();
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        jtfNombre.setText(Globals.stringEmpty);
        jtfApellidoPaterno.setText(Globals.stringEmpty);
        jtfApellicoMaterno.setText(Globals.stringEmpty);
        jftFechaNacimiento.setValue(new Date());
        jrbHombre.setSelected(true);
        paciente.setId(null);
        paciente.setNombres(Globals.stringEmpty);
        paciente.setApellidoPaterno(Globals.stringEmpty);
        paciente.setApellidoMaterno(Globals.stringEmpty);
        paciente.setFechaNacimiento(new Date());
        paciente.setSexo((short)0);
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if(jtPacientes.getSelectedRow() > -1){
            paciente = ctmp.getValue(jtPacientes.getSelectedRow());
            jtfNombre.setText(paciente.getNombres());
            jtfApellidoPaterno.setText(paciente.getApellidoPaterno());
            jtfApellicoMaterno.setText(paciente.getApellidoMaterno());
            jftFechaNacimiento.setValue(paciente.getFechaNacimiento());
            if(paciente.getSexo() == 0) {
                jrbHombre.setSelected(true);
            }
            else{
                jrbMujer.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        paciente.setNombres(jtfNombre.getText().trim());
        paciente.setApellidoPaterno(jtfApellidoPaterno.getText().trim());
        paciente.setApellidoMaterno(jtfApellicoMaterno.getText().trim());
        paciente.setFechaNacimiento((Date)jftFechaNacimiento.getValue());
        paciente.setSexo((short)(jrbHombre.isSelected()? 0 : 1));
        if(paciente.getId() != null){
            Modelo.save(getUpdateQuery(paciente));
        }
        else{
            Modelo.save(getInsertQuery(paciente));
        }
        cargarPacientes();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        if(jtPacientes.getSelectedRow() > -1){
            paciente = ctmp.getValue(jtPacientes.getSelectedRow() );
            paciente.delete();
            cargarPacientes();
        }
    }//GEN-LAST:event_btnBorrarMouseClicked

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">
    
    public static VPacientes getInstance(){
        if(instance == null){
            instance = new VPacientes();
        }
        return instance;
    }
    
    private void inicializar(){
        cargarPacientes();
    }
    
    private void cargarPacientes(){
        ctmp.addRows(paciente.getList());
        jtPacientes.setModel(ctmp);
        jtPacientes.repaint();
    }
    
    private String getInsertQuery(Pacientes paciente){
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO ").append(paciente.getClass().getSimpleName().toLowerCase()).append("").
            append(" (nombres, apellido_paterno, apellido_materno, fecha_nacimiento, sexo)").
            append(" VALUES ('").append(paciente.getNombres()).append("', '").append(paciente.getApellidoPaterno()).
            append("', '").append(paciente.getApellidoMaterno()).append("', '").append(new SimpleDateFormat("yyyy-MM-dd").format(paciente.getFechaNacimiento())).
            append("', '").append(paciente.getSexo()).append("')");
        return query.toString();
    }
    
    private String getUpdateQuery(Pacientes paciente){
        StringBuilder query = new StringBuilder();
        query.append("UPDATE ").append(paciente.getClass().getSimpleName().toLowerCase()).append("").
            append(" SET nombres='").append(paciente.getNombres()). append("',").
            append(" apellido_paterno='").append(paciente.getApellidoPaterno()).append("',").
            append(" apellido_materno='").append(paciente.getApellidoMaterno()).append("',").
            append(" fecha_nacimiento='").append(new SimpleDateFormat("yyyy-MM-dd").format(paciente.getFechaNacimiento())).append("',").
            append(" sexo='").append(paciente.getSexo()).append("'").
            append(" WHERE `id`='").append(paciente.getId()).append("'");
        return query.toString();
    }
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup btngSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JFormattedTextField jftFechaNacimiento;
    private javax.swing.JPanel jpDetalle;
    private javax.swing.JRadioButton jrbHombre;
    private javax.swing.JRadioButton jrbMujer;
    private javax.swing.JScrollPane jspDetalle;
    private javax.swing.JScrollPane jspLista;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField jtfApellicoMaterno;
    private javax.swing.JTextField jtfApellidoPaterno;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JLabel lbApellidoMaterno;
    private javax.swing.JLabel lbApellidoPaterno;
    private javax.swing.JLabel lbFechaNacimiento;
    private javax.swing.JLabel lbNombre;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
