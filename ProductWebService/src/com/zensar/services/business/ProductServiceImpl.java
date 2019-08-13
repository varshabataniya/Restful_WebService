package com.zensar.services.business;

import java.util.ArrayList;
import java.util.List;

import com.zensar.daos.ProductDao;
import com.zensar.daos.ProductDaoImpl;
import com.zensar.entities.Product;

/*Author: Varsha B
 * Creation Date: 25th July 2019 11.25 AM
 * Modified Date: 26th July 2019 11.02 AM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Data Access Object Interface implement. 
 * It encapsulates logic of application component Product.
 * It interacts with DAO  Layer to get data from database.
 * It also interacts with Presentation Layer to give data as per business requirement.
 */

public class ProductServiceImpl implements ProductService {

	private ProductDao dao;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
		dao = new ProductDaoImpl();
	}
	
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.insert(product);
	}

	@Override
	public void edit(Product product) {
		// TODO Auto-generated method stub
		Product dbProduct = findProductById(product.getProductId());
		if(dbProduct!=null){
			dbProduct.setName(product.getName());
			dbProduct.setBrand(product.getBrand());
			dbProduct.setPrice(product.getPrice());
			dao.update(dbProduct);
		}else{
			System.out.println("Product not found");
		}
	}

	@Override
	public void remove(Product product) {
		// TODO Auto-generated method stub
		Product dbProduct = findProductById(product.getProductId());
		if(dbProduct!=null)
			dao.delete(dbProduct);
		else
			System.out.println("Product not found");
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.getById(productId);
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public int getProductCount() {
		// TODO Auto-generated method stub
		return findAllProducts().size();
	}

	@Override
	public List<Product> findProductsByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Product> pList = findAllProducts();
		List<Product> pBList = new ArrayList<>();
		for(Product p:pList){
			if(p.getBrand().equals(brand))
				pBList.add(p);
		}
		return pBList;
	}

	@Override
	public List<Product> findProductsByRange(float minPrice, float maxPrice) {
		// TODO Auto-generated method stub
		List<Product> pList = findAllProducts();
		List<Product> pPList = new ArrayList<>();
		for(Product p:pList){
			if(p.getPrice()>minPrice && p.getPrice()<maxPrice)
				pPList.add(p);
			
		}

		return pPList;
	}

}
