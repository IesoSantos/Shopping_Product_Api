/**
 * 
 */
package com.ieso.shopping_product_api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ieso.shopping_product_api.dto.ProductDTO;
import com.ieso.shopping_product_api.exception.ProductNotFoundException;
import com.ieso.shopping_product_api.service.ProductService;

/**
 * @author Anderson dos Reis Santos
 *
 */
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product")
	public List<ProductDTO> getProducts(){
		List<ProductDTO> products = productService.getAll();
		return products;
	}
	
	@GetMapping("/product/category/{categoryId}")
	public List<ProductDTO> getProductByCategory(@PathVariable Long categoryId){
		List<ProductDTO> products = productService.getProductByCategoryId(categoryId);
		return products;
	}
	
	@GetMapping("/product/{productIdentifier}")
	ProductDTO findById(@PathVariable String productIdentifier) {
		return productService.findByProductIdentifier(productIdentifier);
	}

	@PostMapping("/product")
	ProductDTO newProduct(@Valid @RequestBody ProductDTO productDTO) {
		return productService.save(productDTO);
	}
	
	@DeleteMapping("/product/{id}")
	ProductDTO delete(@PathVariable Long id)
		throws ProductNotFoundException{
			return productService.delete(id);
		}	
}
