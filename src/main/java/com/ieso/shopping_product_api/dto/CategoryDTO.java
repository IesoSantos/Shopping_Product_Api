/**
 * 
 */
package com.ieso.shopping_product_api.dto;

import com.ieso.shopping_product_api.model.Category;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Getter
@Setter
public class CategoryDTO {
	
	private long id;
	private String nome;
	
	public static CategoryDTO convert(Category category)
	{
		CategoryDTO categoryDTO= new CategoryDTO();
		categoryDTO.setId(category.getId());
		categoryDTO.setNome(category.getNome());
		return categoryDTO;
		
	}

}
