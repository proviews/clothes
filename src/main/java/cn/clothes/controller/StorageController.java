package cn.clothes.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;

import cn.clothes.biz.StorageJson;
import cn.clothes.domain.InventoryManagement;
import cn.clothes.service.StorageService;

@Controller
public class StorageController {
	@Autowired
	private StorageService storageService;
	@RequestMapping("/storage")
	public String storage() {
		return "storage/storage";
	}
	@RequestMapping(value="/storageFile",method=RequestMethod.POST)
	public String storageFile(MultipartFile myFile) throws Exception{
		List<InventoryManagement> list = new ArrayList<InventoryManagement>();
		HSSFWorkbook workbook = new HSSFWorkbook(myFile.getInputStream());
		//根据名称获得指定Sheet对象
		HSSFSheet hssfSheet = workbook.getSheet("Sheet1");
		for (Row row : hssfSheet) {
			int rowNum = row.getRowNum();
			if(rowNum == 0){
				continue;
			}
			for(int i=0;i<8;i++) {
			row.getCell(i).setCellType(Cell.CELL_TYPE_STRING);
			}
			String inventoryNum = row.getCell(0).getStringCellValue();
			String stockNumber = row.getCell(1).getStringCellValue();
			String clothesNames = row.getCell(2).getStringCellValue();
			String size = row.getCell(3).getStringCellValue();
			String color = row.getCell(4).getStringCellValue();
			String unit = row.getCell(5).getStringCellValue();
			String price = row.getCell(6).getStringCellValue();
			String date = row.getCell(7).getStringCellValue();
			int in = Integer.parseInt(inventoryNum);
			int sn = Integer.parseInt(stockNumber);
			int si = Integer.parseInt(size);
			long pr = Long.parseLong(price);
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			Date da = sdf.parse(date);
			InventoryManagement inventoryManagement=new InventoryManagement(in, sn, clothesNames, si, color, unit, pr, da);
			list.add(inventoryManagement);
		}
		storageService.saveBatch(list);
		return "content/index";
	}
	@RequestMapping("/showStorage")
	@ResponseBody
	public String showStorage() {
		List<StorageJson> list2=new ArrayList<StorageJson>();
		List<InventoryManagement> list = storageService.findAll();
		for (InventoryManagement inventoryManagement : list) {
			StorageJson storageJson=new StorageJson(inventoryManagement.getClothesnames(),inventoryManagement.getInventorynum());
			list2.add(storageJson);
		}
		String json = JSON.toJSONString(list2);
		return json;
	}
	@RequestMapping("/download")
	public String download(HttpServletResponse response) {
		List<InventoryManagement> list = storageService.findAll();
		System.out.println(list.get(0).getClothesnames());
		return "storage/storage";
	}
}
