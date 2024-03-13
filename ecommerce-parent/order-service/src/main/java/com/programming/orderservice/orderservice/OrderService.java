package com.programming.orderservice.orderservice;

import java.util.List;
import java.util.UUID;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;

import com.programming.orderservice.model.Order;
import com.programming.orderservice.model.OrderLineItems;
import com.programming.orderservice.orderRepository.OrderRepository;
import com.programming.orderservice.requestresponse.OrderLineItemsRequest;
import com.programming.orderservice.requestresponse.OrderRequest;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	WebClient webclient;

	public void placeOrder(OrderRequest orderRequest) {
		
		log.info("BeforesaveService"+orderRequest);
		
		Order order =new Order();
		order.setOrderNumber(UUID.randomUUID().toString());
		
		List<OrderLineItems> orderLineItemslist=orderRequest.getOrderLineItemsRequest().stream()
												.map(this::mapToOrder)
												.toList();
		
		order.setOrderLineItems(orderLineItemslist);
		
		List<String> skucodes=orderLineItemslist.stream().map(OrderLineItems::getSkuCode).toList();
		
		//call inventory to check available quantity then place order
		
		
		orderRepository.save(order);
	
	}
	
	private OrderLineItems mapToOrder(OrderLineItemsRequest request) {
		
		OrderLineItems items=new OrderLineItems();
		items.setPrice(request.getPrice());
		items.setQuantity(request.getQuantity());
		items.setSkuCode(request.getSkuCode());
		return items;
		
	}
	
	

}
