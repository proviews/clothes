package cn.clothes.service;

import java.util.List;

import cn.clothes.domain.ProductRecordTable;

public interface ProduceService {
	List<ProductRecordTable> findAllProduce();
}
