/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer;

import com.alzheimer.utilities.SessionFactoryHelper;
import com.alzheimer.views.VMenu;
import java.awt.EventQueue;

/**
 *
 * @author root
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        SessionFactoryHelper.buidSessinFactory();
        
        /* Create and display the form */
        EventQueue.invokeLater(() -> {
            VMenu windowApp = new VMenu();
            windowApp.setVisible(true);
        });
    }
    
}
