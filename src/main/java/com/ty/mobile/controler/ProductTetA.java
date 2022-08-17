package com.ty.mobile.controler;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.mobile.dto.Brand;
import com.ty.mobile.dto.Product;

public class ProductTetA {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();

	Brand brand=new Brand();
	brand.setName("iphone");
	brand.setBrandid(8786767);
	
	Product product=new Product();
	product.setName("mobile");
	product.setQulity("good");
	product.setCost(14500);

	product.setBrand(brand);
	
	Product product1=new Product();
	product1.setName("i pod");
	product1.setCost(1200);
	product1.setQulity("not");
	product.setBrand(brand);
	
	
	
	entityTransaction.begin();
	entityManager.persist(brand);
	entityManager.persist(product);
	entityManager.persist(product1);
	entityTransaction.commit();
	System.out.println("data stored");
	
	
}
}
