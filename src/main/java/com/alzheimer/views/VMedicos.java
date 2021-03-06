/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.views;

import com.alzheimer.custom_controls.CustomTableModelMedicos;
import com.alzheimer.models.Modelo;
import com.alzheimer.models.Roles;
import com.alzheimer.models.Usuarios;
import com.alzheimer.utilities.Globals;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aldebaran
 */
public class VMedicos extends javax.swing.JPanel {

    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    
    private static VMedicos instance = null;
    
    CustomTableModelMedicos ctmm = new CustomTableModelMedicos();
    
    Usuarios medico = new Usuarios();
    
    Roles rolMedico = new Roles().getByID(2);
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    
    /**
     * Creates new form VMedicos2
     */
    public VMedicos() {
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
        jtMedicos = new javax.swing.JTable();
        jspDetalle = new javax.swing.JScrollPane();
        jpDetalle = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        lbApellidoPaterno = new javax.swing.JLabel();
        jtfApellidoPaterno = new javax.swing.JTextField();
        lbApellidoMaterno = new javax.swing.JLabel();
        jtfApellicoMaterno = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        jrbHombre = new javax.swing.JRadioButton();
        jrbMujer = new javax.swing.JRadioButton();
        lbFechaNacimiento = new javax.swing.JLabel();
        jftFechaNacimiento = new javax.swing.JFormattedTextField();
        lbNombreUsuario = new javax.swing.JLabel();
        jtfNombreUsuario = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        jpfPassword = new javax.swing.JPasswordField();

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

        jtMedicos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jspLista.setViewportView(jtMedicos);

        jTabbedPane.addTab("Lista", jspLista);

        lbNombre.setText("Nombre:");

        lbApellidoPaterno.setText("Apellido Paterno:");

        lbApellidoMaterno.setText("Apellido Materno:");

        lbSexo.setText("Sexo:");

        btngSexo.add(jrbHombre);
        jrbHombre.setSelected(true);
        jrbHombre.setText("Hombre");

        btngSexo.add(jrbMujer);
        jrbMujer.setText("Mujer");

        lbFechaNacimiento.setText("Fecha de Nacimiento:");

        jftFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        lbNombreUsuario.setText("Usuario:");

        lbPassword.setText("Clave:");

        javax.swing.GroupLayout jpDetalleLayout = new javax.swing.GroupLayout(jpDetalle);
        jpDetalle.setLayout(jpDetalleLayout);
        jpDetalleLayout.setHorizontalGroup(
            jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetalleLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDetalleLayout.createSequentialGroup()
                        .addComponent(lbSexo)
                        .addGap(93, 93, 93)
                        .addComponent(jrbHombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jrbMujer))
                    .addGroup(jpDetalleLayout.createSequentialGroup()
                        .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombre)
                            .addComponent(lbApellidoPaterno)
                            .addComponent(lbApellidoMaterno)
                            .addComponent(lbNombreUsuario))
                        .addGap(15, 15, 15)
                        .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfApellidoPaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfApellicoMaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfNombre)
                            .addComponent(jtfNombreUsuario)))
                    .addGroup(jpDetalleLayout.createSequentialGroup()
                        .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFechaNacimiento)
                            .addComponent(lbPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpfPassword)
                            .addComponent(jftFechaNacimiento))))
                .addGap(54, 54, 54))
        );
        jpDetalleLayout.setVerticalGroup(
            jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetalleLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreUsuario)
                    .addComponent(jtfNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword)
                    .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jpDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo)
                    .addComponent(jrbHombre)
                    .addComponent(jrbMujer))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jspDetalle.setViewportView(jpDetalle);

        jTabbedPane.addTab("Detalle", jspDetalle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Eventos">
    
    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        jtfNombreUsuario.setText(Globals.stringEmpty);
        jtfNombre.setText(Globals.stringEmpty);
        jtfApellidoPaterno.setText(Globals.stringEmpty);
        jtfApellicoMaterno.setText(Globals.stringEmpty);
        jftFechaNacimiento.setValue(new Date());
        jpfPassword.setText(Globals.stringEmpty);
        jrbHombre.setSelected(true);
        medico.setId(null);
        medico.setNombreUsuario(Globals.stringEmpty);
        medico.setNombres(Globals.stringEmpty);
        medico.setApellidoPaterno(Globals.stringEmpty);
        medico.setApellidoMaterno(Globals.stringEmpty);
        medico.setFechaNacimiento(new Date());
        medico.setPassword(Globals.stringEmpty);
        medico.setSexo((short)0);
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if(jtMedicos.getSelectedRow() > -1){
            medico = ctmm.getValue(jtMedicos.getSelectedRow());
            jtfNombreUsuario.setText(medico.getNombreUsuario());
            jtfNombre.setText(medico.getNombres());
            jtfApellidoPaterno.setText(medico.getApellidoPaterno());
            jtfApellicoMaterno.setText(medico.getApellidoMaterno());
            jftFechaNacimiento.setValue(medico.getFechaNacimiento());
            jpfPassword.setText(medico.getPassword());
            if(medico.getSexo() == 0) {
                jrbHombre.setSelected(true);
            }
            else{
                jrbMujer.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        medico.setNombreUsuario(jtfNombreUsuario.getText().trim());
        medico.setNombres(jtfNombre.getText().trim());
        medico.setApellidoPaterno(jtfApellidoPaterno.getText().trim());
        medico.setApellidoMaterno(jtfApellicoMaterno.getText().trim());
        medico.setFechaNacimiento((Date)jftFechaNacimiento.getValue());
        medico.setRoles(rolMedico);
        medico.setPassword(String.valueOf(jpfPassword.getPassword()));
        medico.setSexo((short)(jrbHombre.isSelected()? 0 : 1));
        if(medico.getId() != null){
            Modelo.save(getUpdateQuery(medico));
        }
        else{
            Modelo.save(getInsertQuery(medico));
        }
        cargarUsuarios();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        if(jtMedicos.getSelectedRow() > -1){
            medico = ctmm.getValue(jtMedicos.getSelectedRow() );
            medico.delete();
            cargarUsuarios();
        }
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        cargarUsuarios();
    }//GEN-LAST:event_btnActualizarMouseClicked

     // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">
    
    public static VMedicos getInstance(){
        if(instance == null){
            instance = new VMedicos();
        }
        return instance;
    }
    
    private void inicializar(){
        cargarUsuarios();
        jftFechaNacimiento.setValue(new Date());
    }
    
    private void cargarUsuarios(){
        ctmm.addRows(medico.getList());
        jtMedicos.setModel(ctmm);
        jtMedicos.repaint();
    }
    
    private String getInsertQuery(Usuarios usurio){
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO ").append(usurio.getClass().getSimpleName().toLowerCase()).append("").
            append(" (nombre_usuario, nombres, apellido_paterno, apellido_materno, fecha_nacimiento, sexo, password, rol_id)").
            append(" VALUES ('").append(usurio.getNombreUsuario()).append("', '").
            append(usurio.getNombres()).append("', '").append(usurio.getApellidoPaterno()).
            append("', '").append(usurio.getApellidoMaterno()).append("', '").
            append(new SimpleDateFormat("yyyy-MM-dd").format(usurio.getFechaNacimiento())).
            append("', '").append(usurio.getSexo()).
            append("', '").append(usurio.getPassword()).
            append("', '").append(usurio.getRoles().getId()).append("')");
        return query.toString();
    }
    
    private String getUpdateQuery(Usuarios usurio){
        StringBuilder query = new StringBuilder();
        query.append("UPDATE ").append(usurio.getClass().getSimpleName().toLowerCase()).append("").
            append(" SET nombres_usuario = '").append(usurio.getNombreUsuario()). append("',").
            append(" nombres='").append(usurio.getNombres()). append("',").
            append(" apellido_paterno = '").append(usurio.getApellidoPaterno()).append("', ").
            append(" apellido_materno = '").append(usurio.getApellidoMaterno()).append("', ").
            append(" fecha_nacimiento = '").append(new SimpleDateFormat("yyyy-MM-dd").format(usurio.getFechaNacimiento())).append("', ").
            append(" sexo = '").append(usurio.getSexo()).append("', ").
            append(" password = '").append(usurio.getPassword()).append("', ").
            append(" rol_id = '").append(usurio.getRoles().getId()).append("'").
            append(" WHERE id = '").append(usurio.getId()).append("'");
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
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JFormattedTextField jftFechaNacimiento;
    private javax.swing.JPanel jpDetalle;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JRadioButton jrbHombre;
    private javax.swing.JRadioButton jrbMujer;
    private javax.swing.JScrollPane jspDetalle;
    private javax.swing.JScrollPane jspLista;
    private javax.swing.JTable jtMedicos;
    private javax.swing.JTextField jtfApellicoMaterno;
    private javax.swing.JTextField jtfApellidoPaterno;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNombreUsuario;
    private javax.swing.JLabel lbApellidoMaterno;
    private javax.swing.JLabel lbApellidoPaterno;
    private javax.swing.JLabel lbFechaNacimiento;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombreUsuario;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbSexo;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
