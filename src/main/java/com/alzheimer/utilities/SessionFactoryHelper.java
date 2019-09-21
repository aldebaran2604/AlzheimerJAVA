/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.utilities;

import com.alzheimer.models.*;
import com.alzheimer.views.VPacientes;
import java.io.File;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *  Clase para el manejo de la sesión de la base de datos
 * @author aldebaran
 */
public class SessionFactoryHelper {
    private static SessionFactory sessionFactory = null;
    
    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null){
           buidSessinFactory(); 
        }
        return sessionFactory;
    }
    
    public static void buidSessinFactory(){
        try {
            // Creating Configuration Instance & Passing Hibernate Configuration File
            Configuration config = new Configuration();
            config.configure(new File("src/main/resources/META-INF/hibernate.cfg.xml"));
            config.addAnnotatedClass(Usuarios.class);
            config.addAnnotatedClass(Roles.class);
            config.addAnnotatedClass(Pacientes.class);
            config.addAnnotatedClass(Imagenes.class);
            config.addAnnotatedClass(Examenes.class);
            config.addAnnotatedClass(Consultas.class);
            config.addAnnotatedClass(VPacientes.class);

            ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();

            // Creating Hibernate SessionFactory Instance
            sessionFactory = config.buildSessionFactory(serviceRegistryObj);
        } catch (HibernateException e) {
            System.err.println("Error in creating SessionFactory object." + e.getMessage());
        }
    }
    
    /*static {
        try {
            // Creating Configuration Instance & Passing Hibernate Configuration File
            Configuration config = new Configuration();
            config.configure(new File("src/main/resources/META-INF/hibernate.cfg.xml"));
            config.addAnnotatedClass(Usuarios.class);
            config.addAnnotatedClass(Roles.class);
            config.addAnnotatedClass(Parentescos.class);
            config.addAnnotatedClass(Pacientes.class);
            config.addAnnotatedClass(ImagenesId.class);
            config.addAnnotatedClass(Imagenes.class);
            config.addAnnotatedClass(Examenes.class);
            config.addAnnotatedClass(Consultas.class);

            ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();

            // Creating Hibernate SessionFactory Instance
            sessionFactory = config.buildSessionFactory(serviceRegistryObj);
        } catch (Throwable e) {
            System.err.println("Error in creating SessionFactory object." + e.getMessage());
            throw new ExceptionInInitializerError(e);
        }
    }*/
}
