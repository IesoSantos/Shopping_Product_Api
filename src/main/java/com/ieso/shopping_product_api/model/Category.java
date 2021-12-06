/**
 * 
 */
package com.ieso.shopping_product_api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ieso.shopping_product_api.dto.CategoryDTO;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Getter
@Setter
@Entity(name = "category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;

	public static Category convert(CategoryDTO categoryDTO) {
		Category category = new Category();
		category.setId(categoryDTO.getId());
		category.setNome(categoryDTO.getNome());
		return category;
	}

}
