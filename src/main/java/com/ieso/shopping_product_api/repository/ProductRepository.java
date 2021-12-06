/**
 * 
 */
package com.ieso.shopping_product_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ieso.shopping_product_api.model.Product;

/**
 * @author Anderson dos Reis Santos
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query(value="select p "
			+ "from product p "
			+ "join category c on p.category.id = c.id "
			+ "where c.id = :categoryId ")
	public List<Product> getProductByCategory(
			@Param("categoryId") long categoryId);
	
	public Product findByProductIdentifier(String productIdentifier);

}
