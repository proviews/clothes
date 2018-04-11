package cn.clothes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.clothes.dao.ProduceStyleDao;
import cn.clothes.domain.ProductStyle;
import cn.clothes.service.ProduceStyleService;
@Service
@Transactional
public class ProduceStyleImpl implements ProduceStyleService {
	
	@Autowired
	private ProduceStyleDao produceStyleDao;
	@Override
	public List<ProductStyle> findAll() {
		// TODO Auto-generated method stub
		return produceStyleDao.findAll();
	}

}
