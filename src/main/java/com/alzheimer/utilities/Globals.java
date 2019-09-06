/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.utilities;

import com.alzheimer.models.Usuarios;

/**
 *
 * @author root
 */
public final class Globals {
    public static Usuarios medico = null;
    private static String directorioImagenes = null;
    
    public static String getDirectorioImagenes(){
        if(directorioImagenes == null) {
            switch(System.getProperty("os.name")){
                case "Linux":
                    directorioImagenes = "/home/aldebaran/Pictures";
                    break;
                case "Windows":
                    directorioImagenes = "C:\\Users\\aldebaran\\Pictures";
                    break;
            }
        }
        return directorioImagenes;
    }
}
