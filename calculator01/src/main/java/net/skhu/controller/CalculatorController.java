package net.skhu.controller;
/*
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/*
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
*/
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {
	
	@RequestMapping("calculator/main")
	public String main(Model model) {
		return "calculator/main";
	}
}
