package net.skhu.controller;
/*
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/*
import org.springframework.web.bind.annotation.RequestMapping;
*/

@Controller
public class CalculatorController {
	
	@GetMapping("calculator/main")
	public String main(Model model) {
		return "calculator/main";
	}
	
	@PostMapping("calculator/main")
	public String main(Model model, Integer number1, String operator, Integer number2) {
		String errorMessage="";
		if(number1==null) {
			errorMessage="숫자 1을 입력하세요.";
			model.addAttribute("errorMessage", errorMessage);
		}
		else if(operator==null) {
			errorMessage="연산자를 선택하세요.";
			model.addAttribute("errorMessage", errorMessage);
		}
		else if(number2==null) {
			errorMessage="숫자 2를 입력하세요.";
			model.addAttribute("errorMessage", errorMessage);
		}
		else {
			
		}
		return "calculator/main";
	}
	
	private int calculation(int num1, String operator, int num2) {
		switch(operator) {
			case "+":
				return num1+num2;
			case "-":
				return num1-num2;
			case "*":
				return num1*num2;
			case "/":
				return num1/num2;
		}
	}
}
