package com.anil.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anil.model.Employee;

@Controller
@RequestMapping("/employee")
public class FillForm {
	
	@RequestMapping("/fillForm")
	public String  showForm(Model model)
	{
		Employee emp = new Employee();
		
		//emp.setFname("anil"); 
		System.out.println(emp.getFieldList());
											 // if we add this line it effect on jsp page as showing name anil input field
		model.addAttribute("employee",emp); // here we need to add a Employee object to model for process form on jsp page
		return "Home";
	}
	
	@RequestMapping("/process") 
	public String  processform(@ModelAttribute("employee") Employee employee) //it is working for  submission 
												//whatever value is we putting  in text field is set for employee field
	{
		System.out.println(employee);
		return "showemp";
	}
	
	
}

