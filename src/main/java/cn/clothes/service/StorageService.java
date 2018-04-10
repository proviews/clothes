package cn.clothes.service;

import java.util.List;

import cn.clothes.domain.InventoryManagement;

public interface StorageService {
	void saveBatch(List<InventoryManagement> list);

	List<InventoryManagement> findAll();
}
