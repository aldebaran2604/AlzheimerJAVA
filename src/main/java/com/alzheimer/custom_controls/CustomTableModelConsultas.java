/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.custom_controls;

import com.alzheimer.models.Consultas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aldebaran
 */
public class CustomTableModelConsultas extends DefaultTableModel {
    private final ArrayList<Consultas> dataList_ = new ArrayList<>();
    
    Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
    };
    
    boolean[] canEdit = new boolean [] {
        false, false, false, false
    };

    public CustomTableModelConsultas() {
        super.addColumn("ID");
        super.addColumn("Medico");
        super.addColumn("Paciente");
        super.addColumn("Fecha de Consulta");
    }
    
    public void addRows(List<Consultas> lista){
        deleteRows();
        lista.forEach(this::addRow);
    }
    
    public void addRow(Consultas consulta){
        insertRow(getRowCount(), consulta);
    }
    
    public void insertRow(int row, Consultas consulta){
        dataList_.add(row, consulta);
        addRow(getObject(consulta));
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
    
    public Consultas getValue(int row){
        return dataList_.get(row);
    }
    
    private Object[] getObject(Consultas consulta){
        return new Object[]{ consulta.getId(), consulta.getUsuarios().getNombres(), consulta.getPacientes().getNombres(), consulta.getFecha()};
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Consultas consulta = dataList_.get(row);
        switch(column) {
            case 0: return consulta.getId();
            case 1: return consulta.getUsuarios().getNombres();
            case 2: return consulta.getPacientes().getNombres();
            case 3: return consulta.getFecha();
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
