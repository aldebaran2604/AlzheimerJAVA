/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.views;

import com.alzheimer.utilities.*;

/**
 *
 * @author aldebaran
 */
public class VMenu extends javax.swing.JFrame {
    
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Creates new form Application
     */
    public VMenu() {
        initComponents();
        inicialialiacion();
    }
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspContenedor = new javax.swing.JScrollPane();
        jpContenedor = new javax.swing.JPanel();
        jmbMenuOpciones = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmiInicio = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jmMedicos = new javax.swing.JMenu();
        jmiMedicosRegistro = new javax.swing.JMenuItem();
        jmPacientes = new javax.swing.JMenu();
        jmiPacienteRegistro = new javax.swing.JMenuItem();
        jmiHistoricos = new javax.swing.JMenuItem();
        jmiImagenes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alzheimer");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout jpContenedorLayout = new javax.swing.GroupLayout(jpContenedor);
        jpContenedor.setLayout(jpContenedorLayout);
        jpContenedorLayout.setHorizontalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jpContenedorLayout.setVerticalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jspContenedor.setViewportView(jpContenedor);

        jmArchivo.setText("Archivo");

        jmiInicio.setText("Inicio");
        jmiInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmiInicioMousePressed(evt);
            }
        });
        jmArchivo.add(jmiInicio);

        jmiSalir.setText("Salir");
        jmiSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmiSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmiSalirMousePressed(evt);
            }
        });
        jmArchivo.add(jmiSalir);

        jmbMenuOpciones.add(jmArchivo);

        jmMedicos.setText("Medicos");

        jmiMedicosRegistro.setText("Registro");
        jmiMedicosRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmiMedicosRegistroMousePressed(evt);
            }
        });
        jmMedicos.add(jmiMedicosRegistro);

        jmbMenuOpciones.add(jmMedicos);

        jmPacientes.setText("Pacientes");

        jmiPacienteRegistro.setText("Registro");
        jmiPacienteRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmiPacienteRegistroMousePressed(evt);
            }
        });
        jmPacientes.add(jmiPacienteRegistro);

        jmiHistoricos.setText("Historicos");
        jmiHistoricos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmiHistoricosMousePressed(evt);
            }
        });
        jmPacientes.add(jmiHistoricos);

        jmiImagenes.setText("Imagenes");
        jmiImagenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmiImagenesMousePressed(evt);
            }
        });
        jmPacientes.add(jmiImagenes);

        jmbMenuOpciones.add(jmPacientes);

        setJMenuBar(jmbMenuOpciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspContenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspContenedor, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // <editor-fold defaultstate="collapsed" desc="Eventos">
    
    private void jmiInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmiInicioMousePressed
        cambiarPanel(OpcionesMenu.OVInicio);
    }//GEN-LAST:event_jmiInicioMousePressed

    private void jmiMedicosRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmiMedicosRegistroMousePressed
        cambiarPanel(OpcionesMenu.OVMedicos);
    }//GEN-LAST:event_jmiMedicosRegistroMousePressed

    private void jmiSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmiSalirMousePressed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jmiSalirMousePressed

    private void jmiPacienteRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmiPacienteRegistroMousePressed
        cambiarPanel(OpcionesMenu.OVPacientes);
    }//GEN-LAST:event_jmiPacienteRegistroMousePressed

    private void jmiHistoricosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmiHistoricosMousePressed
        cambiarPanel(OpcionesMenu.OVHistoricos);
    }//GEN-LAST:event_jmiHistoricosMousePressed

    private void jmiImagenesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmiImagenesMousePressed
        cambiarPanel(OpcionesMenu.OVImagenes);
    }//GEN-LAST:event_jmiImagenesMousePressed
    
    //</editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">
    
    private void inicialialiacion(){
        VInicio.getInstance().setSize(jpContenedor.getWidth(), jpContenedor.getHeight());
        VMedicos.getInstance().setSize(jpContenedor.getWidth(), jpContenedor.getHeight());
        VPacientes.getInstance().setSize(jpContenedor.getWidth(), jpContenedor.getHeight());
        VConsultas.getInstance().setSize(jpContenedor.getWidth(), jpContenedor.getHeight());
        VHistoricos.getInstance().setSize(jpContenedor.getWidth(), jpContenedor.getHeight());
        VImagenes.getInstance().setSize(jpContenedor.getWidth(), jpContenedor.getHeight());
        
        jpContenedor.add(VInicio.getInstance());
        jpContenedor.add(VMedicos.getInstance());
        jpContenedor.add(VPacientes.getInstance());
        jpContenedor.add(VConsultas.getInstance());
        jpContenedor.add(VHistoricos.getInstance());
        jpContenedor.add(VImagenes.getInstance());
        
        cambiarPanel(OpcionesMenu.OVInicio);
    }
    
    private void cambiarPanel(OpcionesMenu opcion){
        switch(opcion){
            case OVInicio:
                visualizarOpcionMenu(true, false, false, false, false, false);
                break;
            case OVMedicos:
                visualizarOpcionMenu(false, true, false, false, false, false);
                break;
            case OVPacientes:
                visualizarOpcionMenu(false, false, true, false, false, false);
                break;
            case OVConsultas:
                visualizarOpcionMenu(false, false, false, true, false, false);
                break;
            case OVHistoricos:
                visualizarOpcionMenu(false, false, false, false, true, false);
                break;
            case OVImagenes:
                visualizarOpcionMenu(false, false, false, false, false, true);
                break;
        }
    }
    
    private void visualizarOpcionMenu(boolean inicio, boolean medicos, boolean pacientes, boolean consultas, boolean historicos, boolean imagenes){
        VInicio.getInstance().setVisible(inicio);
        VMedicos.getInstance().setVisible(medicos);
        VPacientes.getInstance().setVisible(pacientes);
        VConsultas.getInstance().setVisible(consultas);
        VHistoricos.getInstance().setVisible(historicos);
        VImagenes.getInstance().setVisible(imagenes);
        validate();
    }
    
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmMedicos;
    private javax.swing.JMenu jmPacientes;
    private javax.swing.JMenuBar jmbMenuOpciones;
    private javax.swing.JMenuItem jmiHistoricos;
    private javax.swing.JMenuItem jmiImagenes;
    private javax.swing.JMenuItem jmiInicio;
    private javax.swing.JMenuItem jmiMedicosRegistro;
    private javax.swing.JMenuItem jmiPacienteRegistro;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JPanel jpContenedor;
    private javax.swing.JScrollPane jspContenedor;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
