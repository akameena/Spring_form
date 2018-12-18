package com.anil.controlller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anil.model.Employee;

@Controller
@RequestMapping("/employee")
public class FillForm {
	
	
	// add an initbinder ... to convert trim input strings
		// remove leading and trailing whitespace
		// resolve issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/fillForm")
	public String  showForm(Model model)
	{
		Employee emp = new Employee();
		
		//emp.setFname("anil"); 
		//System.out.println(emp.getFieldList());
											 // if we add this line it effect on jsp page as showing name anil input field
		model.addAttribute("employee",emp); // here we need to add a Employee object to model for process form on jsp page
		return "Home";
	}
	
	@RequestMapping("/process") 			//@valid perform validation rule on employee object
	public String  processform(@Valid @ModelAttribute("employee") Employee employee, BindingResult br) //it is working for  submission 
												//whatever value is we putting  in text field is set for employee field
	{											// here binding result is store result of validation it must be just next parameter of model attribut
						
		if(br.hasErrors())
		{
			//System.out.println("in error block");
			return "Home";
		}
		//System.out.println(employee);
		else
			return "showemp";
	}
	
	
}

