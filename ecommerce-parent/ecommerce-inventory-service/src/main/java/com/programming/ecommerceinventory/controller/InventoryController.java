package com.programming.ecommerceinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.programming.ecommerceinventory.inventoryrequestresponse.InventoryResponse;
import com.programming.ecommerceinventory.inventoryservice.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	@Autowired
	InventoryService inventoryService;
	
	
	@GetMapping
	public List<InventoryResponse> isInStock(@RequestParam List<String> skuCodes){
		
		return inventoryService.isInStock(skuCodes);
		
	}

}
