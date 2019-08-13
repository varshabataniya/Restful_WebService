package com.zensar.services.ui;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;
import com.zensar.services.business.ProductServiceImpl;

/*Author: Varsha B
 * Creation Date: 25th July 2019 12.15 AM
 * Modified Date: 26th July 2019 12.15 AM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Product Web Service.
 * It provides product data through
 * RESTful WEb Service
 */

@Path("/products")
public class ProductResource {
	
	private ProductService productService;


	public ProductResource() {
	
		productService = new ProductServiceImpl();
	}

	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Product> getAllProducts(){
		return productService.findAllProducts();
	}
}
