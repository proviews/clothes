package cn.clothes.service;

import java.util.List;

import cn.clothes.domain.ProductRecordTable;
import cn.clothes.utils.Result;

public interface ProduceService {
	List<ProductRecordTable> findAllProduce();

	void addProduce(ProductRecordTable productRecordTable);

	Result deleteById(Long id);

	ProductRecordTable findById(Long id);

	Result updateProductRecordTable(ProductRecordTable productRecordTable);
}
