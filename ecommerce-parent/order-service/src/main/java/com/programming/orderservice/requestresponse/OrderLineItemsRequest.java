package com.programming.orderservice.requestresponse;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class OrderLineItemsRequest {
	
	private Long id;
	
	private String skuCode;
	private BigDecimal price;
	private Integer quantity;

}
