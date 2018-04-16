package cn.clothes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProduceControlController {
	@RequestMapping("/control")
	public String control() {
		return "producecontrol/control";
	}
	@RequestMapping("/look")
	public String look() {
		return "producecontrol/look";
	}
}
