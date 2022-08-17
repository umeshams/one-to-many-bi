package com.ty.mobile.controler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.mobile.dto.Brand;
import com.ty.mobile.dto.Product;

public class AddProducte {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
	
		    Brand brand=      entityManager.find(Brand.class, 2);
		    
		    System.out.println("brand is :"+brand.getName());
		        
		    List<Product> products=new ArrayList<Product>();
		    Product product=new Product();
		    product.setName("ear phone");
		    product.setQulity("nice");
		    product.setCost(12000);
		    product.setBrand(brand);
		     products.add(product);
		    
		    Product product2=new Product();
		    product2.setName("wathch");
		    product2.setQulity("good");
		    product2.setCost(10000);
		    product.setBrand(brand);
		     products.add(product2);
		     
		     brand.setProduct(products);
		     
		     EntityTransaction entityTransaction=entityManager.getTransaction();
		     entityTransaction.begin();
		     entityManager.persist(product);
		     entityManager.persist(product2);
		     entityManager.persist(brand);
              entityTransaction.commit();
              System.out.println("-----------data stored-----------");
		     
		     
		     
		     
	}
}
