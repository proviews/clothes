package cn.clothes.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
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
		// TODO Auto-generated method stub
		for (InventoryManagement inventoryManagement : list) {
			inventoryManagementDao.saveAndFlush(inventoryManagement);
		}

	}

	@Override
	public List<InventoryManagement> findAll() {
		// TODO Auto-generated method stub
		return inventoryManagementDao.findAll();
	}

}
