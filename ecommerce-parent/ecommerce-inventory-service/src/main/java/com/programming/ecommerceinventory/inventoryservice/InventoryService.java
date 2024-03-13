package com.programming.ecommerceinventory.inventoryservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.ecommerceinventory.inventoryrepository.InventoryRepository;
import com.programming.ecommerceinventory.inventoryrequestresponse.InventoryResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InventoryService {
	
	@Autowired
	InventoryRepository inventoryRepository;

	 public List<InventoryResponse> isInStock(List<String> skuCode) {
	        log.info("Checking Inventory");
//	        return inventoryRepository.findBySkuCodeIn(skuCode).stream()
//	                .map(inventory ->
//	                        InventoryResponse.builder()
//	                                .skuCode(inventory.getSkuCode())
//	                                .isInStock(inventory.getQuantity() > 0)
//	                                .build()
//	                ).toList();
	        
	        List<InventoryResponse> list=new ArrayList<InventoryResponse>();
	        list.add(new InventoryResponse("iphone 13",true));
	        list.add(new InventoryResponse("iphone 14", true));
	        
	        return list;
	    }	

	
	

}
