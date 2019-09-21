/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.utilities;

/**
 *
 * @author aldebaran
 */
public enum OpcionesMenu {
    OVNinguno(0, ""),
    OVInicio(1, ""),
    OVMedicos(2, ""),
    OVPacientes(3, ""),
    OVConsultas(4, ""),
    OVImagenes(5, "");
    
    private int valor = 0;
    private String descripcion = "";
    
    OpcionesMenu(int valor, String descripcion){
        this.valor = valor;
        this.descripcion = descripcion;
    }
    
    public int getValor(){
        return valor;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
}
