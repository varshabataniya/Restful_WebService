package com.zensar.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;


/*Author: Varsha B
 * Creation Date: 25th July 2019 05.55 PM
 * Modified Date: 26th July 2019 10.55 AM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Data access Object interface Implementor.
 * It uses hibernateAPI to access Product Data from Database.
 */

public class ProductDaoImpl implements ProductDao {

	private Session session;
	
	public ProductDaoImpl(){
		super();
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		session = factory.openSession();
		System.out.println("DB Connection established");
	}
	
	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.save(product);
		tx.commit();
		System.out.println("Product Inserted");
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.update(product);
		tx.commit();
		System.out.println("Product updated");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.delete(product);
		tx.commit();
		System.out.println("Product deleted");
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return session.get(Product.class,productId);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		Query query= session.createQuery("from Product");
		
		return query.getResultList();
	}

}
