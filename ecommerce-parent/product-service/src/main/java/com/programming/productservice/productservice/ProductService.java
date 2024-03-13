package com.programming.productservice.productservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.productservice.model.Product;
import com.programming.productservice.productrepository.ProductRepository;
import com.programming.productservice.productrequestresponse.ProductRequest;
import com.programming.productservice.productrequestresponse.ProductResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {
	
	@Autowired
	ProductRepository repository;

	public void addProduct(ProductRequest productRequest) {
		
		Product product=Product.builder()
								.name(productRequest.getName())
								.discription(productRequest.getDiscription())
								.price(productRequest.getPrice())
								.build();
		
		repository.save(product);
		
		log.info("Product inserted successfully",product.getId());
		
	}

	public List<ProductResponse> getAllProducts() {
		
		List<Product> products=repository.findAll();
		
		return products.stream().map(this::mapToProductResponse).toList();
	}
		
	private ProductResponse mapToProductResponse(Product product) {
		
	
		return ProductResponse.builder()
								.id(product.getId())
								.name(product.getName())
								.discription(product.getDiscription())
								.price(product.getPrice())
								.build();
			
		}
	
	
		
	
	
	

}
