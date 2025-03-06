package com.learning;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class RelationApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).addAnnotatedClass(ClassRoom.class);
		StandardServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		
		SessionFactory sf = cfg.buildSessionFactory(reg);
		
		Session session =  sf.openSession();
		session.beginTransaction();
		
		
		Laptop lapOne = new Laptop(1, "HP");
		Laptop lapTwo = new Laptop(2, "Dell");
		List<Laptop> lapList = new ArrayList<>();
		lapList.add(lapOne);
		lapList.add(lapTwo);
		
		Student studOne = new Student(1, "Aman");
		lapOne.setStudent(studOne);
		lapTwo.setStudent(studOne);
		studOne.setLaptops(lapList);
		
		ClassRoom clsOne = new ClassRoom(1);
		ClassRoom clsTwo = new ClassRoom(2);
		List<ClassRoom> clsList = new ArrayList<>();
		clsList.add(clsOne);
		clsList.add(clsTwo);
		
		studOne.setClassRooms(clsList);
		
		List<Student> studLs = new ArrayList<>();
		studLs.add(studOne);
		clsOne.setStudents(studLs);
		clsTwo.setStudents(studLs);
		
		session.persist(lapOne);
		session.persist(lapTwo);
		session.persist(clsOne);
		session.persist(clsTwo);
		session.persist(studOne);
		
		session.getTransaction().commit();
		
//		Student fetchedStudent = null;
//		fetchedStudent = (Student) session.get(Student.class, 1);
//		fetchedStudent =(Student) session.get(Student.class, 1);
//		
//		
//		System.out.println(fetchedStudent);
		
		session.close();
		
		
		

	}

}
