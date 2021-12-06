/**
 * 
 */
package com.ieso.shopping_product_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ieso.shopping_product_api.model.Category;

/**
 * @author Anderson dos Reis Santos
 *
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
