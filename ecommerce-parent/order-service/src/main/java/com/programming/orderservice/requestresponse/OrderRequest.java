package com.programming.orderservice.requestresponse;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.programming.orderservice.model.OrderLineItems;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderRequest {
	
	private Long id;
	private String orderNumber;
	
	@OneToMany(cascade= CascadeType.ALL)
	private List<OrderLineItemsRequest> orderLineItemsRequest;

}
