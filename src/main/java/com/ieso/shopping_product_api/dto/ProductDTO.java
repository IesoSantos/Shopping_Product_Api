/**
 * 
 */
package com.ieso.shopping_product_api.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ieso.shopping_product_api.model.Product;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Getter
@Setter
public class ProductDTO {
	
	@NotBlank
	private String productIdentifier;
	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	@NotNull
	private float preco;
	@NotNull
	private CategoryDTO categoryDTO;
	
	public static ProductDTO convert(Product product) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setNome(product.getNome());
		productDTO.setPreco(product.getPreco());
		productDTO.setProductIdentifier(product.getProductIdentifier());
		productDTO.setDescricao(product.getDescricao());
		
		if(product.getCategory() != null) {
			productDTO.setCategoryDTO(
					CategoryDTO.convert(product.getCategory()));
		}
		return productDTO;
	}

}
