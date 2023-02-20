package net.skhu.controller;
/*
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
		/*
		if(number1==null) {
			number1=0.0;
		}
		if(number2==null) {
			number2=0.0;
		}
		 */
		
		String errorMessage="";
		/*
		if(number1.getClass().getName()!=Double) {
			errorMessage="잘못 입력하셨습니다.";
		}
		*/
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


			int num1, num2;
			if(number1%1==0) {
				num1=(int)(double)(number1);
				model.addAttribute("number1", num1);
			}
			else {
				model.addAttribute("number1", number1);
			}

			if(number2%1==0) {
				num2=(int)(double)number2;
				model.addAttribute("number2", num2);
			}
			else {
				model.addAttribute("number2", number2);
			}
		}
		// ExceptionHandler는 오류가 났을 때 사용자에게 "죄송합니다 고객님~" 같은 메시지 창이 뜰 수 있도록 하는 거다! 
		/*
		@ExceptionHandler(MethodArgumentTypeMismatchException.class)
		public String catcher(Model model) {
			errorMessage="숫자를 입력해주세요.";
			model.addAttribute("errorMessage", errorMessage);
			
			return "calculator/main";
		}*/
		
		model.addAttribute("operator", operator);

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
			if((num1-num2)%1==0) {
				return Integer.toString((int)(num1-num2));
			}
			else {
				return Double.toString(num1-num2);
			}
		case "*":
			if((num1*num2)%1==0) {
				return Integer.toString((int)(num1*num2));
			}
			else {
				return Double.toString(num1*num2);
			}
		case "/":
			if((num1/num2)%1==0) {
				return Integer.toString((int)(num1/num2));
			}
			else {
				return Double.toString(num1/num2);
			}
		default:
			return "-1";
		}
	}
}
