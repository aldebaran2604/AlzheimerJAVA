/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.views;

import com.alzheimer.models.Consultas;
import com.alzheimer.models.Imagenes;
import com.alzheimer.utilities.Globals;
import java.awt.Image;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author aldebaran
 */
public class VExamen extends javax.swing.JDialog {
    
    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    
    private final Imagenes imagen = new Imagenes();
    private Imagenes imagenActual = null;
    private Imagenes[] imagenesArray = new Imagenes[] { };
    private Consultas consulta = null;
    private int imagenesErroneas = 0;
    private int imagenesCorrectas = 0;
    private int contador = 0;
    private Date fecha = new Date();
    private Date horaInicio = new Date();
    
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Creates new form VExamen
     * @param parent
     * @param modal
     */
    public VExamen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializar();
    }
    
    /**
     * Creates new form VExamen Modal
     * @param parent
     */
    public VExamen(java.awt.Frame parent) {
        this(parent, true);
    }
    
    public VExamen(java.awt.Frame parent, Consultas consulta){
        super(parent, true);
        horaInicio = new Date();
        initComponents();
        fecha = new Date();
        this.consulta = consulta;
        inicializar();
        
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
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagenes/accept.png"))); // NOI18N
        btnAceptar.setToolTipText("Si");
        btnAceptar.setMaximumSize(new java.awt.Dimension(43, 43));
        btnAceptar.setMinimumSize(new java.awt.Dimension(43, 43));
        btnAceptar.setPreferredSize(new java.awt.Dimension(43, 43));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAceptarMousePressed(evt);
            }
        });

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

    // <editor-fold defaultstate="collapsed" desc="Eventos">
    
    private void btnAceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMousePressed
        examen(true);
    }//GEN-LAST:event_btnAceptarMousePressed

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        examen(false);
    }//GEN-LAST:event_btnCancelarMousePressed

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">
    
    public void inicializar(){
        cargarImagenesPaciente();
    }
    
    private void cargarImagenesPaciente(){
        String whereQuery = " where paciente_id = '"+consulta.getPacientes().getId()+"' ";
        List<Imagenes> imagenesLista = imagen.getListaByWhere(whereQuery);
        imagenesArray = (Imagenes[]) imagenesLista.toArray(new Imagenes[imagenesLista.size()]);
        if(imagenesArray.length == 0){
            JOptionPane.showMessageDialog(null, "No se encontraron imagenes para el paciente "+consulta.getPacientes().toString()+".", null, JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            imagenActual = imagenesArray[contador];
            lbImagen.setIcon(obtenerImagen(Globals.getDirectorioImagenes()+imagenActual.getDirectorio()));
        }
    }
    
    private void examen(boolean pariente) {
        if(contador < imagenesArray.length) {
            if (pariente && !imagenActual.getParentescos().toUpperCase().equals("NINGUNO")) {
                imagenesCorrectas++;
            } else if(!pariente && imagenActual.getParentescos().toUpperCase().equals("NINGUNO")) {
                imagenesCorrectas++;
            } else {
                imagenesErroneas++;
            }
            contador++;
            if(contador < imagenesArray.length){
                imagenActual = imagenesArray[contador];
                lbImagen.setIcon(obtenerImagen(Globals.getDirectorioImagenes()+imagenActual.getDirectorio()));
            } else {
                dispose();
            }
        } else {
            dispose();
        }
    }
    
    private ImageIcon obtenerImagen(String directorio){
        Image imagenIcono = new ImageIcon(directorio).getImage().
            getScaledInstance(lbImagen.getWidth(), lbImagen.getHeight(), java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(imagenIcono);
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
