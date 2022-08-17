package com.ty.mobile.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.mobile.dto.Mobile;
import com.ty.mobile.dto.Sim;

public class MobileTest {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Mobile mobile=new Mobile();
	mobile.setName("samsung");
	mobile.setCost(15000);
	
	Sim sim=new Sim();
	sim.setImrc("AIR543");
	sim.setProvider("AIRTEAL");
	sim.setMobile(mobile);
	
	Sim sim1=new Sim();
	sim1.setImrc("BSN876");
	sim1.setProvider("BSNL");
	sim1.setMobile(mobile);
	
	entityTransaction.begin();
	entityManager.persist(mobile);
	entityManager.persist(sim);
	entityManager.persist(sim1);
	entityTransaction.commit();
	System.out.println("data stored");
	
}
}
