/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.custom_controls;

import com.alzheimer.models.Examenes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lupadilla
 */
public class CustomTableModelExamenes extends DefaultTableModel  {
    private final ArrayList<Examenes> dataList_ = new ArrayList<>();
    
    Class[] types = new Class [] {
        
    };
    
    boolean[] canEdit = new boolean [] {
        
    };

    public CustomTableModelExamenes() {
        
    }
    
    public void addRows(List<Examenes> lista){
        deleteRows();
        lista.forEach(this::addRow);
    }
    
    public void addRow(Examenes examen){
        insertRow(getRowCount(), examen);
    }
    
    public void insertRow(int row, Examenes examen){
        dataList_.add(row, examen);
        addRow(getObject(examen));
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
    
    public Examenes getValue(int row){
        return dataList_.get(row);
    }
    
    private Object[] getObject(Examenes examen){
        return new Object[]{ };
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Examenes examen = dataList_.get(row);
        switch(column) {
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
