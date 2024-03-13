package com.programming.ecommerceinventory.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.programming.ecommerceinventory.inventoryrepository.InventoryRepository;
import com.programming.ecommerceinventory.model.Inventory;


@Configuration
public class CommandLineRunnerConfiguration {
	
	@Bean
	public CommandLineRunner loadData(InventoryRepository repository) {
		
		return args->
		{
			
		
		Inventory inventory=new Inventory();
		
		inventory.setSkuCode("iphone 14");
		inventory.setQuantity(3);
		
		Inventory inventory1=new Inventory();
		
		inventory1.setSkuCode("iphone 13_red");
		inventory1.setQuantity(2);
		
		repository.save(inventory);
		repository.save(inventory1);
		
		};
		
	}

}
