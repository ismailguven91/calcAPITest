package com.newcalc.calculator;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class homeController implements ErrorController{
	
	@RequestMapping(value = "/")
	public String root() {
		return cs.Description();
	}
	
	
	//instantierar calculatorService här
	private calculatorService cs = new calculatorService();
	
	
	
     //example: http://localhost:8080/math/?operation=multiplication&value1=10&value2=20
	  @RequestMapping("/add")
	    public Double addition(Double number1, Double number2) {
	        Double sum = cs.addition(number1, number2);
	        return sum;
	    }

	    @RequestMapping("/sub")
	    public Double subtraction(Double number1, Double number2) {
	        Double sum = cs.subtraction(number1, number2);
	        return sum;
	    }

	    @RequestMapping("/multi")
	    public Double multiplication(Double number1, Double number2) {
	        Double sum = cs.multiplication(number1, number2);
	        return sum;
	    }

	    @RequestMapping("/div")
	    public Double division(Double number1, Double number2) {
	        Double sum = cs.division(number1, number2);
	        return sum;
	    }
	    
	    private static final String PATH = "/error";

		@RequestMapping(value = PATH, produces = MediaType.TEXT_HTML_VALUE)
		public String error() {
			return "This URL doesnt work. Please try with something else :)";
		}

		public String getErrorPath() {
			
			return PATH;
		}

}