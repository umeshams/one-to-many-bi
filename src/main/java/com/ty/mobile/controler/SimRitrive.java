package com.ty.mobile.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.mobile.dto.Sim;

public class SimRitrive {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			
			
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			
			Sim sim=entityManager.find(Sim.class, 2);
			
			System.out.println("id is :"+sim.getId());
			System.out.println("imrc is :"+sim.getImrc());
			System.out.println("provider is :"+sim.getProvider());
			//
			System.out.println("name is :"+sim.getMobile().getName());
			System.out.println("cost is :"+sim.getMobile().getCost());
	}
}
