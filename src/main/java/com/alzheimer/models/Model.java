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
import org.hibernate.query.Query;

/**
 *
 * @author aldebaran
 * @param <T>
 */
public class Model<T> {
    
    public void save(){
        Session session = null;
        try {
            session = SessionFactoryHelper.getSessionFactory().openSession();
            session.save(this);
        }catch(HibernateException ex){
            
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
            
        }finally{
            if(session != null){
                session.close();
            }
        }
        return lista;
    }
}
