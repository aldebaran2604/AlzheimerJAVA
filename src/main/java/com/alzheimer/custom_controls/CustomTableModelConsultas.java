/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.custom_controls;

import com.alzheimer.models.Consultas;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aldebaran
 */
public class CustomTableModelConsultas extends DefaultTableModel {
    private final Vector<Consultas> dataVector_ = new Vector<>();
    
    Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
    };
    
    boolean[] canEdit = new boolean [] {
        false, false, false, false
    };

    public CustomTableModelConsultas() {
        addColumn("ID");
        addColumn("Medico");
        addColumn("Paciente");
        addColumn("Fecha de Consulta");
    }
    
    public void addRows(List<Consultas> lista){
        lista.forEach(this::addRow);
    }
    
    public void addRow(Consultas consulta){
        insertRow(getRowCount(), consulta);
    }
    
    public void insertRow(int row, Consultas consulta){
        dataVector_.insertElementAt(consulta, row);
        addRow(getObject(consulta));
        fireTableRowsInserted(row, row);
    }
    
    public Consultas getValue(int row){
        return dataVector_.get(row);
    }
    
    private Object[] getObject(Consultas consulta){
        return new Object[]{ consulta.getId(), consulta.getUsuarios().getNombres(), consulta.getPacientes().getNombres(), consulta.getFecha()};
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Consultas consulta = dataVector_.get(row);
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
