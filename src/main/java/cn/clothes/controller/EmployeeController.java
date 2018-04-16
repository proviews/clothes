package cn.clothes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.clothes.biz.FormJson;
import cn.clothes.domain.EmployeeTable;
import cn.clothes.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@RequestMapping("/showEmployee")
	@ResponseBody
	public FormJson showEmployee() {
		List<EmployeeTable> list = employeeService.findAll();
		FormJson<EmployeeTable> formJson=new FormJson<EmployeeTable>();
		formJson.setCount(0);
		formJson.setData(list);
		formJson.setCode(0);
		return formJson;
	}
	@RequestMapping(value="/showProgress",method=RequestMethod.POST)
	@ResponseBody
	public String showProgress(Long employeenumber) {
		EmployeeTable e = employeeService.findById(employeenumber);
		String json=e.getDocumentaryFlow().getId().toString();
		return json;
	}
	@RequestMapping("/showWork")
	@ResponseBody
	public String showWork() {
		List<EmployeeTable> list = employeeService.findAll();
		List<String> list2=new ArrayList<String>();
		for (EmployeeTable employeeTable : list) {
			String flow=employeeTable.getDocumentaryFlow().getFlow();
			list2.add(flow);
		}
		String json = JSON.toJSONString(list2);
		return json;
	}
}
