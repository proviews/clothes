package cn.clothes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.clothes.dao.ProduceDao;
import cn.clothes.domain.ProductRecordTable;
import cn.clothes.service.ProduceService;
import cn.clothes.utils.Result;
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
	@Override
	public void addProduce(ProductRecordTable productRecordTable) {
		produceDao.save(productRecordTable);
	}
	@Override
	public Result deleteById(Long id) {
		// TODO Auto-generated method stub
		produceDao.deleteById(id);
		return Result.ok();
	}
	@Override
	public ProductRecordTable findById(Long id) {
		// TODO Auto-generated method stub
		return produceDao.findById(id).get();
	}
	@Override
	public Result updateProductRecordTable(ProductRecordTable productRecordTable) {
		// TODO Auto-generated method stub
		produceDao.saveAndFlush(productRecordTable);
		return Result.ok();
	}

}
