/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.views;

import com.alzheimer.models.Usuarios;
import com.alzheimer.utilities.Globals;
import java.util.Optional;
import javax.swing.JOptionPane;

/**
 *
 * @author aldebaran
 */
public class VLoginDialog extends javax.swing.JDialog {

    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    
    private boolean verificacion = false;
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Creates new form LoginDialog
     */
    public VLoginDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Inicializa();
    }
    
    /**
     * Creates new form LoginDialog Modal
     */
    public VLoginDialog(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        Inicializa();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lbUsuario = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Inico de sesión");
        setResizable(false);

        lbUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbUsuario.setText("Usuario:");

        lbPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbPassword.setText("Contraseña:");

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/accept.png"))); // NOI18N
        btnAceptar.setToolTipText("Aceptar");
        btnAceptar.setMaximumSize(new java.awt.Dimension(43, 43));
        btnAceptar.setMinimumSize(new java.awt.Dimension(43, 43));
        btnAceptar.setPreferredSize(new java.awt.Dimension(43, 43));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/cancel.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(43, 43));
        btnCancelar.setMinimumSize(new java.awt.Dimension(43, 43));
        btnCancelar.setPreferredSize(new java.awt.Dimension(43, 43));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPassword)
                    .addComponent(lbUsuario))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtUsuario))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Eventos">
    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        if(validarLogin()){
            verificacion = true;
            this.dispose();
        }else{
            verificacion = false;
            JOptionPane.showMessageDialog(null, "¡Usuario y/o contraseña son incorrectos!", null, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        verificacion = false;
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">
    
    private void Inicializa(){
        setVisible(true);
    }
    
    public boolean verificacion(){
        return verificacion;
    }
    
    private boolean validarLogin(){
        Usuarios usuario = obtenerUsuarioRegistrado(String.valueOf(txtUsuario.getPassword()), String.valueOf(txtPassword.getPassword()));
        Globals.usuario = usuario;
        return usuario != null;
    }
    
    private String getWhereQuery(String nombreUsuario, String password){
        return " where nombre_usuario = '" + nombreUsuario+ "' and password = '"+ password + "'";
    }
    
    private Usuarios obtenerUsuarioRegistrado(String nombreUsuario, String password){
        Usuarios consultaUsuaro = new Usuarios();
        Optional<Usuarios> usuario = consultaUsuaro.getListaByWhere(getWhereQuery(nombreUsuario, password))
                .stream().filter(u -> u.getNombreUsuario().equals(nombreUsuario) && u.getPassword().equals(password))
                .findFirst();
        
        return usuario.orElse(null);
    }
    
    // </editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
