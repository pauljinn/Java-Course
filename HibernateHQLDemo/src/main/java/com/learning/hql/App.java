package com.learning.hql;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
        StandardServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        SessionFactory sf =cfg.buildSessionFactory(sr);
        
         Session session = sf.openSession();
         session.beginTransaction();
         
//         for(int i=0;i<50;i++) {
//        	 session.persist(new Student(i+1,"Name " + (i+1), i+60));
//         }
         
         //HQL
         Query query =session.createQuery("from Student s");
        
         List<Student> students = query.list();
         System.out.println(students);
         
         //SQL
         SQLQuery sqlQuery = session.createSQLQuery("select * from student where rollno = 1");
         sqlQuery.addEntity(Student.class);
         List<Student> resList = sqlQuery.list();
         System.out.println(resList);
         Student res = (Student) sqlQuery.uniqueResult();
         System.out.println(res);
         
         //When you select particular fields
         SQLQuery selectQuery = session.createSQLQuery("select marks, name from student");
         List<Object[]> objLs = selectQuery.list();
         
         for(Object[] obj: objLs) {
        	 System.out.println("Marks " + obj[0] + " Name " + obj[1]);
         }
         
         //Another way by transforming the fetched result
         SQLQuery selectQueryTransform = session.createSQLQuery("select marks, name from student");
         selectQueryTransform.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
         List objTrans = selectQueryTransform.list();
         
         for(Object o: objTrans) {
        	 Map mp = (Map) o;
        	 System.out.println("Marks " + mp.get("marks") + " Name " + mp.get("name"));
        	 
         }
         session.getTransaction().commit();
         session.close();
         sf.close();
    }
}
