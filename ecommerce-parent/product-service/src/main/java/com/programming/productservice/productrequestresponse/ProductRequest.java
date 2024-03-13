package com.programming.productservice.productrequestresponse;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ProductRequest {
	
		private int id;		
		private String name;
		private String discription;
		private BigDecimal price;
		
	}

