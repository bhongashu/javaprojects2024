package com.programming.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.programming.orderservice.orderservice.OrderService;
import com.programming.orderservice.requestresponse.OrderRequest;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public String placeOrder(@RequestBody OrderRequest orderRequest) {
		
		if(orderRequest==null) {
			return "Please add correct values";
		}
		else {
		service.placeOrder(orderRequest);
		return "Order placed successfully";
		}
		
	}

}
