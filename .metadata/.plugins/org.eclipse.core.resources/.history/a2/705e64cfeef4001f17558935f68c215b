package com.learning.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Alien a = em.find(Alien.class, 1);
		System.out.println(a);
		if (a == null) {
			a = new Alien();
			a.setAid(1);
			a.setfName("Riya");
			a.setColor("Blue");
			a.setmName("Kumar");
			a.setlName("Singh");
			em.persist(a);
		}
		//This will fire an update query because our object is in persistence session.
		a.setfName("Aman");
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
