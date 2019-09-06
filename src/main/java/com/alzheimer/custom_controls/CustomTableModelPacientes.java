/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.custom_controls;

import com.alzheimer.models.Pacientes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aldebaran
 */
public class CustomTableModelPacientes extends DefaultTableModel {
    private final ArrayList<Pacientes> dataList_ = new ArrayList<>();
    
    Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
    };
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false
    };

    public CustomTableModelPacientes() {
        super.addColumn("ID");
        super.addColumn("Nombre");
        super.addColumn("Apellido Paterno");
        super.addColumn("Apellido Materno");
        super.addColumn("Fecha de Nacimiento");
        super.addColumn("Sexo");
    }
    
    public void addRows(List<Pacientes> lista){
        deleteRows();
        lista.forEach(this::addRow);
    }
    
    public void addRow(Pacientes paciente){
        insertRow(getRowCount(), paciente);
    }
    
    public void insertRow(int row, Pacientes paciente){
        dataList_.add(row, paciente);
        addRow(getObject(paciente));
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
    
    public Pacientes getValue(int row){
        return dataList_.get(row);
    }
    
    private Object[] getObject(Pacientes paciente){
        return new Object[]{ paciente.getId(), paciente.getNombres(), paciente.getApellidoPaterno(), paciente.getApellidoMaterno(), paciente.getFechaNacimiento(), paciente.getSexo()};
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Pacientes usuario = dataList_.get(row);
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
