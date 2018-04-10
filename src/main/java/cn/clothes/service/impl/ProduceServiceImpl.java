package cn.clothes.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.clothes.dao.ProduceDao;
import cn.clothes.domain.ProductRecordTable;
import cn.clothes.service.ProduceService;
@Service
@Transactional
public class ProduceServiceImpl implements ProduceService {
	@Autowired
	private ProduceDao produceDao;
	@Override
	public List<ProductRecordTable> findAllProduce() {
		// TODO Auto-generated method stub
		return produceDao.findAll();
	}

}
