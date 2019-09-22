/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.custom_controls;

import com.alzheimer.models.Usuarios;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aldebaran
 */
public class CustomTableModelMedicos extends DefaultTableModel {
    private final ArrayList<Usuarios> dataList_ = new ArrayList<>();
    
    Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
    };
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false
    };

    public CustomTableModelMedicos() {
        super.addColumn("ID");
        super.addColumn("Usuario");
        super.addColumn("Nombre");
        super.addColumn("Apellido Paterno");
        super.addColumn("Apellido Materno");
        super.addColumn("Fecha de Nacimiento");
        super.addColumn("Sexo");
    }
    
    public void addRows(List<Usuarios> lista){
        deleteRows();
        lista.forEach(this::addRow);
    }
    
    public void addRow(Usuarios usuario){
        insertRow(getRowCount(), usuario);
    }
    
    public void insertRow(int row, Usuarios usuario){
        dataList_.add(row, usuario);
        addRow(getObject(usuario));
        fireTableRowsInserted(row, row);
    }
    
    private void deleteRows(){
        int sizeDataVector = getRowCount();
        for(int index=sizeDataVector-1 ; index>=0; index--){
            dataList_.remove(index);
            removeRow(index);
            fireTableRowsDeleted(index, index);
        }
    }
    
    public Usuarios getValue(int row){
        return dataList_.get(row);
    }
    
    private Object[] getObject(Usuarios usuario){
        return new Object[]{ usuario.getId(), usuario.getNombreUsuario(), usuario.getNombres(), usuario.getApellidoPaterno(), usuario.getApellidoMaterno(), usuario.getFechaNacimiento(), usuario.getSexo()};
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Usuarios usuario = dataList_.get(row);
        switch(column) {
            case 0: return usuario.getId();
            case 1: return usuario.getNombreUsuario();
            case 2: return usuario.getNombres();
            case 3: return usuario.getApellidoPaterno();
            case 4: return usuario.getApellidoMaterno();
            case 5: return usuario.getFechaNacimiento();
            case 6: return (usuario.getSexo()== 0)? "Hombre": "Mujer";
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
