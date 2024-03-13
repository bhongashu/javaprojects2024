package com.programming.ecommerceinventory.inventoryrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.programming.ecommerceinventory.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
	
    //List<Inventory> findBySkuCodeIn(@Param("skuCode") List<String> skuCode);
}