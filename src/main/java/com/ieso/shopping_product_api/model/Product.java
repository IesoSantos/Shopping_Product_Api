/**
 * 
 */
package com.ieso.shopping_product_api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ieso.shopping_product_api.dto.ProductDTO;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Getter
@Setter
@Entity(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private float preco;
	private String descricao;
	private String productIdentifier;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	public static Product convert(ProductDTO productDTO) {
		Product product = new Product();
		product.setNome(productDTO.getNome());
		product.setPreco(productDTO.getPreco());
		product.setDescricao(productDTO.getDescricao());
		product.setProductIdentifier(productDTO.getProductIdentifier());
		if(productDTO.getCategoryDTO() != null) {
			product.setCategory(
					Category.convert(productDTO.getCategoryDTO()));
		}
		return product;
	}

}
