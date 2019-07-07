/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.custom_controls;

import com.alzheimer.models.Usuarios;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aldebaran
 */
public class CustomTableModelMedicos extends DefaultTableModel {
    private final Vector<Usuarios> dataVector_ = new Vector<>();
    
    Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
    };
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false
    };

    public CustomTableModelMedicos() {
        addColumn("ID");
        addColumn("Nombre");
        addColumn("Apellido Paterno");
        addColumn("Apellido Materno");
        addColumn("Fecha de Nacimiento");
        addColumn("Sexo");
    }
    
    public void addRows(List<Usuarios> lista){
        lista.forEach(this::addRow);
    }
    
    public void addRow(Usuarios usuario){
        insertRow(getRowCount(), usuario);
    }
    
    public void insertRow(int row, Usuarios usuario){
        dataVector_.insertElementAt(usuario, row);
        addRow(getObject(usuario));
        fireTableRowsInserted(row, row);
    }
    
    public Usuarios getValue(int row){
        return dataVector_.get(row);
    }
    
    private Object[] getObject(Usuarios usuario){
        return new Object[]{ usuario.getId(), usuario.getNombres(), usuario.getApellidoPaterno(), usuario.getApellidoMaterno(), usuario.getFechaNacimiento(), usuario.getSexo()};
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Usuarios usuario = dataVector_.get(row);
        switch(column) {
            case 0: return usuario.getId();
            case 1: return usuario.getNombres();
            case 2: return usuario.getApellidoPaterno();
            case 3: return usuario.getApellidoMaterno();
            case 4: return usuario.getFechaNacimiento();
            case 5: return (usuario.getSexo()== 0)? "Hombre": "Mujer";
            default: return null;
        }
    }
    
    @Override
    public boolean isCellEditable(int i, int i1) {
        return canEdit [i1];
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return types [i];
    }
}
