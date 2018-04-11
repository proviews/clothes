package cn.clothes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.clothes.dao.ProduceTypeDao;
import cn.clothes.domain.ProductType;
import cn.clothes.service.ProduceTypeService;
@Service
@Transactional
public class ProduceTypeServiceImpl implements ProduceTypeService {
	@Autowired
	private ProduceTypeDao produceTypeDao;
	@Override
	public List<ProductType> findAll() {
		// TODO Auto-generated method stub
		return produceTypeDao.findAll();
	}

}
