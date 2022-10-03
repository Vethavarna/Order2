package com.sopra.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Person();
p.setPersonId(200);
p.setPersonName("Vetha");
p.setPersonLocation("Bangalore");
EntityManagerFactory emf=Persistence.createEntityManagerFactory("com/sopra/hibernate/persistence.xml");
EntityManager em=emf.createEntityManager();
em.getTransaction().begin();
em.persist(p);
em.getTransaction().commit();
em.close();

	}

}


