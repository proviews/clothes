package cn.clothes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.clothes.biz.FormJson;
import cn.clothes.domain.FinancialManagementAccountPayable;
import cn.clothes.service.FinancialManagementAccountPayableService;
import cn.clothes.utils.Result;

@Controller
public class ProviderController {
	@Autowired
	private FinancialManagementAccountPayableService financialManagementAccountPayableService;
	@RequestMapping("/providerList")
	public String providerList() {
		return "provider/provider";
	}
	/**
	 * 
	 * 分页显示
	 * @param curr
	 * @param limit
	 * @param keyword
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/providerShow")
	@ResponseBody
	public FormJson providerShow(Integer page,Integer limit,String keyword) {
		Page<FinancialManagementAccountPayable> list;
		if(keyword==""||keyword==null) {
			 list=financialManagementAccountPayableService.findAll(page-1, limit);
		}else {
			 list=financialManagementAccountPayableService.findByOrderid(keyword, page-1, limit);
		}
		FormJson<FinancialManagementAccountPayable> formJson=new FormJson<FinancialManagementAccountPayable>();
		Integer count=financialManagementAccountPayableService.getTotalCount();
		formJson.setCount(count);
		formJson.setData(list.getContent());
		formJson.setCode(0);
		return formJson;
	}
	@RequestMapping("/providerDel")
	@ResponseBody
	public Result providerDel(Long id) {
		Result result = financialManagementAccountPayableService.deleteById(id);
		return result;
	}
	@RequestMapping("/showProviderEdit")
	public String showProviderEdit(Model model,Long id) {
		FinancialManagementAccountPayable fmap = financialManagementAccountPayableService.findById(id);
		model.addAttribute("fmap", fmap);
		return "/provider/providerEdit";
	}
	@RequestMapping(value="/editProvider",method=RequestMethod.POST)
	@ResponseBody
	public void editProvider(FinancialManagementAccountPayable financialManagementAccountPayable) {
		financialManagementAccountPayableService.updateFinancialManagementAccountPayable(financialManagementAccountPayable);
	}
	/**
	 * 	展示添加商品
	 * @return
	 */
	@RequestMapping("/showAdd")
	public String showAdd() {
		return "/provider/providerEdit";
	}
	/**
	 * 增加商品
	 * @param financialManagementAccountPayable
	 */
	@RequestMapping(value="/addProvider",method=RequestMethod.POST)
	@ResponseBody
	public Result addProvider(FinancialManagementAccountPayable financialManagementAccountPayable) {
		return financialManagementAccountPayableService.addFinancialManagementAccountPayable(financialManagementAccountPayable);
	}
}
