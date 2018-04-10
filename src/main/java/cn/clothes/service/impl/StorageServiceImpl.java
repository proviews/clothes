package cn.clothes.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import cn.clothes.dao.InventoryManagementDao;
import cn.clothes.domain.InventoryManagement;
import cn.clothes.service.StorageService;
@Service
@Transactional
public class StorageServiceImpl implements StorageService {
	@Autowired
	private InventoryManagementDao inventoryManagementDao;

	@Override
	public void saveBatch(List<InventoryManagement> list) {
		
		for (InventoryManagement inventoryManagement : list) {
			
			
			InventoryManagement m = inventoryManagementDao.findByClothesnames(inventoryManagement.getClothesnames());
			
			if(m!=null) {
				inventoryManagementDao.delete(m);
				inventoryManagementDao.save(inventoryManagement);
				
			}
			inventoryManagementDao.save(inventoryManagement);
		}

	}

	@Override
	public List<InventoryManagement> findAll() {
		// TODO Auto-generated method stub
		return inventoryManagementDao.findAll();
	}

}
