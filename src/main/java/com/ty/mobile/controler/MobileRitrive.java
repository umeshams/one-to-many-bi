package com.ty.mobile.controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.mobile.dto.Mobile;
import com.ty.mobile.dto.Sim;

public class MobileRitrive {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			
			
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			
	Mobile mobile=		entityManager.find(Mobile.class, 1);
	
	System.out.println("name is :"+mobile.getName());
	System.out.println("cost is :"+mobile.getCost());
	System.out.println("mobile id :"+mobile.getId());
	List<Sim > sim =mobile.getSim();
	
	for(Sim s:sim) {
		System.out.println("imrc is :"+s.getImrc());
		System.out.println("provider is :"+s.getProvider());
	
	}
			
	}
}
