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
		/*
		int num1=0;
		String operator="+";
		int num2=0;
		
		model.addAttribute("number1", num1);
		model.addAttribute("operator", operator);
		model.addAttribute("number2", num2);
		*/		
		return "calculator/main";
	}
	
	@PostMapping("calculator/main")
	public String main(Model model, Double number1, String operator, Double number2) {
		model.addAttribute("number1", number1);
		model.addAttribute("operator", operator);
		model.addAttribute("number2", number2);
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
			String result = calculation(number1, operator, number2);
			model.addAttribute("result", result);
		}
		return "calculator/main";
	}
	
	private String calculation(double num1, String operator, double num2) {
		switch(operator) {
			case "+":
				if((num1+num2)%1==0) {
					return Integer.toString((int)(num1+num2));
				}
				else {
					return Double.toString(num1+num2);
				}
			case "-":
				return Double.toString(num1-num2);
			case "*":
				return Double.toString(num1*num2);
			case "/":
				return Double.toString(num1/num2);
			default:
				return "-1";
		}
	}
}
