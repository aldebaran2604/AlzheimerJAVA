/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.views;

/**
 *
 * @author aldebaran
 */
public class VExamen extends javax.swing.JDialog {
    
    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    
    private int consulta = 0;
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Creates new form VExamen
     */
    public VExamen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializar();
    }
    
    /**
     * Creates new form VExamen Modal
     */
    public VExamen(java.awt.Frame parent) {
        this(parent, true);
    }
    
    public VExamen(java.awt.Frame parent, int consulta){
        this(parent, true);
        this.consulta = consulta;
    }
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbImagen = new javax.swing.JLabel();
        lbMensaje = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Examen");
        setResizable(false);

        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/imagen_prueba.jpg"))); // NOI18N
        lbImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbMensaje.setText("¿Es Conocido?");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/cancel.png"))); // NOI18N
        btnCancelar.setToolTipText("No");
        btnCancelar.setMaximumSize(new java.awt.Dimension(43, 43));
        btnCancelar.setMinimumSize(new java.awt.Dimension(43, 43));
        btnCancelar.setPreferredSize(new java.awt.Dimension(43, 43));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/accept.png"))); // NOI18N
        btnAceptar.setToolTipText("Si");
        btnAceptar.setMaximumSize(new java.awt.Dimension(43, 43));
        btnAceptar.setMinimumSize(new java.awt.Dimension(43, 43));
        btnAceptar.setPreferredSize(new java.awt.Dimension(43, 43));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(lbMensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMensaje))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Métodos">
    
    public void inicializar(){
        
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbMensaje;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
