package cn.clothes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.clothes.biz.FormJson;
import cn.clothes.domain.FinancialManagementAccountPayable;
import cn.clothes.domain.ProductRecordTable;
import cn.clothes.domain.ProductStyle;
import cn.clothes.domain.ProductType;
import cn.clothes.service.ProduceService;
import cn.clothes.service.ProduceStyleService;
import cn.clothes.service.ProduceTypeService;
import cn.clothes.utils.Result;


@Controller
public class ProduceController {
	
	@Autowired
	private ProduceService produceService;
	
	@Autowired
	private ProduceStyleService produceStyleService;
	
	@Autowired
	private ProduceTypeService produceTypeService;
	
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
	/**
	 * 	展示添加产品
	 * @return
	 */
	@RequestMapping("/showAddProduce")
	public String showAdd(Model model) {
		List<ProductStyle> style = produceStyleService.findAll();
		List<ProductType> type = produceTypeService.findAll();
		model.addAttribute("style", style);
		model.addAttribute("type", type);
		return "/produce/produceEdit";
	}
	/**
	 * 增加商品
	 * @param
	 */
	@RequestMapping(value="/addProduce",method=RequestMethod.POST)
	@ResponseBody
	public Result addProduce(ProductRecordTable productRecordTable) {
		 produceService.addProduce(productRecordTable);
		 return Result.ok();
	}
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/produceDel")
	@ResponseBody
	public Result providerDel(Long id) {
		Result result = produceService.deleteById(id);
		return result;
	}
	@RequestMapping("/showProduceEdit")
	public String showProduceEdit(Model model,Long id) {
		ProductRecordTable productRecordTable = produceService.findById(id);
		model.addAttribute("productRecordTable", productRecordTable);
		List<ProductStyle> style = produceStyleService.findAll();
		List<ProductType> type = produceTypeService.findAll();
		model.addAttribute("style", style);
		model.addAttribute("type", type);
		return "/produce/produceEdit";
	}
	@RequestMapping(value="/editProduce",method=RequestMethod.POST)
	@ResponseBody
	public void editProduce(ProductRecordTable productRecordTable) {
		produceService.updateProductRecordTable(productRecordTable);
	}
}
