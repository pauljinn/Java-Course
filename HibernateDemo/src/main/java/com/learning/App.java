package com.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class App 
{
    public static void main( String[] args )
    {
        Alien alien = new Alien();
        //Loading hibernate.cfg.xml
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        //Applying the configuration to hibernate
        StandardServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        //Creating a sessionfactory.
        SessionFactory sf = con.buildSessionFactory(reg);
        //Opening a connection
        Session sessionOne = sf.openSession();
        sessionOne.beginTransaction();
//        Alien obj = new Alien();
//        obj.setAid(1);
//        obj.setAname(new Name("Aman", "Kumar", "Soni"));
//        obj.setColor("Green");
//        session.persist(obj);
        alien = sessionOne.get(Alien.class, 1);
        //First level caching , Doesn't fire the query again.
        alien = sessionOne.get(Alien.class, 1);
        System.out.println(alien);
        
        Query queryOne =sessionOne.createQuery("from Alien where aid = 1");
        queryOne.setCacheable(true);
        alien = (Alien) queryOne.uniqueResult();
        
        System.out.println("Fetched by query one " + alien);
        sessionOne.getTransaction().commit();
        sessionOne.close();
        
        /**
         * First level caching not works here.
         * Fires the query again because the session is different
         * Need second level caching
         */
        Session sessionTwo = sf.openSession();
        sessionTwo.beginTransaction();
        alien = sessionTwo.get(Alien.class, 1);
        System.out.println(alien);
        
        /**
         * Second level cache not work at query level we need to specify properties in hibernate.cfg.xml
         * We also need to set query caching true.
         */
        Query queryTwo =sessionTwo.createQuery("from Alien where aid = 1");
        queryTwo.setCacheable(true);
        alien = (Alien) queryTwo.uniqueResult();
        
        System.out.println("Fetched by query two " + alien);
        sessionTwo.getTransaction().commit();
        sessionTwo.close();
        
        sf.close();
        
    }
}
