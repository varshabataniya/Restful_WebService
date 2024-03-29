package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Product;

/*Author: Varsha B
 * Creation Date: 25th July 2019 11.25 AM
 * Modified Date: 26th July 2019 11.02 AM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Business Object Interface.
 * It focuses on business logic of Product.
 */

public interface ProductService {

	void create(Product product);
	void edit(Product product);
	void remove(Product product);
	
	Product findProductById(int productId);
	List<Product> findAllProducts();
	int getProductCount();
	List<Product> findProductsByBrand(String brand);
	List<Product> findProductsByRange(float minPrice,float maxPrice);
	
	
}
