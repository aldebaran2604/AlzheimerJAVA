/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alzheimer.models;

import com.alzheimer.utilities.SessionFactoryHelper;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

/**
 *
 * @author aldebaran
 * @param <T>
 */
public class Modelo<T> {
    
    public void delete(){
        Session session = null;
        try {
            session = SessionFactoryHelper.getSessionFactory().openSession();
            Transaction t = session.beginTransaction();
            session.delete(this);
            session.flush();
            t.commit();
        }catch(HibernateException ex){
            System.err.println("Error in delete" + ex.getMessage());
        }finally{
            if(session != null){
                session.close();
            }
        }
    }
    
    public void save(){
        Session session = null;
        try {
            session = SessionFactoryHelper.getSessionFactory().openSession();
            session.saveOrUpdate(this);
        }catch(HibernateException ex){
            System.err.println("Error in save" + ex.getMessage());
        }finally{
            if(session != null){
                session.close();
            }
        }
    }
    
    public static void save(String query){
        Session session = null;
        try {
            session = SessionFactoryHelper.getSessionFactory().openSession();
            Transaction t = session.beginTransaction();
            NativeQuery querySaveUpdate = session.createSQLQuery(query);
            querySaveUpdate.executeUpdate();
            t.commit();
        }catch(HibernateException ex){
            System.err.println("Error in save" + ex.getMessage());
        }finally{
            if(session != null){
                session.close();
            }
        }
    }
    
    public T getByID(int id){
        T result = null;
        Session session  = null;
        try {
            session = SessionFactoryHelper.getSessionFactory().openSession();
            result = (T)session.get(this.getClass(), id);
        }catch(HibernateException ex){
            System.err.println("Error in getByID" + ex.getMessage());
        }finally{
            if(session != null){
                session.close();
            }
        }
        return result;
    }
    
    public List<T> getList() {
        List<T> lista = new ArrayList<>();
        Session session = null;
        try {
            session = SessionFactoryHelper.getSessionFactory().openSession();
            Query query = session.createQuery("from " + this.getClass().getSimpleName());
            lista = query.list();
        }catch(HibernateException ex){
            System.err.println("Error in getList" + ex.getMessage());
        }finally{
            if(session != null){
                //session.close();
            }
        }
        return lista;
    }
}
