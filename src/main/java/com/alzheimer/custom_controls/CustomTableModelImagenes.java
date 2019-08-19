/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.custom_controls;

import com.alzheimer.models.Imagenes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author root
 */
public class CustomTableModelImagenes extends DefaultTableModel {
    private final ArrayList<Imagenes> dataList_ = new ArrayList<>();
    
    Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
    };
    
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false
    };
    
     public CustomTableModelImagenes() {
        super.addColumn("ID");
        super.addColumn("Paciente");
        super.addColumn("Directorio");
        super.addColumn("Parentesco");
        super.addColumn("Descripción");
    }
     
     public void addRows(List<Imagenes> lista){
        deleteRows();
        lista.forEach(this::addRow);
    }
    
    public void addRow(Imagenes imagen){
        insertRow(getRowCount(), imagen);
    }
    
    public void insertRow(int row, Imagenes imagen){
        dataList_.add(row, imagen);
        addRow(getObject(imagen));
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
    
    public Imagenes getValue(int row){
        return dataList_.get(row);
    }
    
    private Object[] getObject(Imagenes imagen){
        return new Object[]{ imagen.getId(), imagen.getPacientes().toString(), imagen.getDirectorio(), imagen.getParentescos(), imagen.getDescripcion() }; 
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Imagenes imagen = dataList_.get(row);
        switch(column) {
            case 0: return imagen.getId();
            case 1: return imagen.getPacientes().toString();
            case 2: return imagen.getDirectorio();
            case 3: return imagen.getParentescos();
            case 4: return imagen.getDescripcion();
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
