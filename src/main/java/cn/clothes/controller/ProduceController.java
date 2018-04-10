package cn.clothes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.clothes.biz.FormJson;
import cn.clothes.domain.ProductRecordTable;
import cn.clothes.service.ProduceService;


@Controller
public class ProduceController {
	
	@Autowired
	private ProduceService produceService;
	
	@RequestMapping("/produceRecord")
	public String produceRecord() {
		return "produce/produceRecord";
	}
	
	@RequestMapping("/produceShow")
	@ResponseBody
	public FormJson produceShow() {
		List<ProductRecordTable> list = produceService.findAllProduce();
		FormJson<ProductRecordTable> formJson=new FormJson<ProductRecordTable>();
		formJson.setCode(0);
		formJson.setCount(0);
		formJson.setData(list);
		return formJson;
	}
}
