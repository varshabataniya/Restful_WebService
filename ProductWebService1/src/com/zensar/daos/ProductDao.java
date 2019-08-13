package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Product;

/*Author: Varsha B
 * Creation Date: 25th July 2019 05.55 PM
 * Modified Date: 26th July 2019 10.55 AM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Data Access Object Interface.
 * It is used to access Product Data from Database.
 */

public interface ProductDao {

	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	
	Product getById(int productId);
	List<Product> getAll();
	
}
