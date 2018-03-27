package cn.clothes.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.clothes.domain.UserTable;
import cn.clothes.service.UserService;


@Controller
public class AdminController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login.html")
	public String login(){
		return "/admin/login";
	}
	@RequestMapping(value="/loginInfo",method=RequestMethod.POST)
	public String loginInfo(UserTable userTable,HttpSession session,Model model) {
		UserTable user = userService.findUserByName(userTable.getUsername());
		if(user==null) {
			return "redirect:/login.html";
		}else if(!user.getPassword().equals(userTable.getPassword())) {
			return "redirect:/login.html";
		}else {
			session.setAttribute("userTable", user);
			return "content/content";
		}
	}
	@RequestMapping("/register")
	public String register(){
		return "admin/register";
	}
	@RequestMapping(value="/registerInfo",method=RequestMethod.POST)
	public String registerInfo(UserTable userTable,Model model) {
		UserTable user = userService.findUserByName(userTable.getUsername());
		if(user!=null) {
			model.addAttribute("message", "用户名已存在！");
			return "redirect:/register";
		}else {
		userService.addUser(userTable);
		model.addAttribute("message", "注册成功！");
		return "admin/login";
	}
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("userTable");
		return "admin/login";
	}
}
