package com.cognizant.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cognizant.entity.EducationLoan;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.ApplyEducationLoanService;

@Controller
public class ApplyEducationLoanController {
	
	@Autowired
	ApplyEducationLoanService service;
	UserDetails user;
	
	
	@RequestMapping(value="/insertEducationLoan", method=RequestMethod.GET)
	public String getEducationLoan(@ModelAttribute("educationLoan") @Valid EducationLoan eduacationLoan,
			BindingResult result, Model model){
		
		return "insertEducationLoan";
	}
	
	


@RequestMapping(value = "/insertEducationLoan", method = RequestMethod.POST)
public String initiateEducationLoan(
	@ModelAttribute("insertEducationLoan") @Valid EducationLoan educationLoan,
	BindingResult result, 
	Model model) {
	
	String id=service.generateLoanId(educationLoan.getID_Card_Number());
    educationLoan.setEducationLoanId(id);
    educationLoan.setEdu_Loan_Account_Number(service.generateLoanAccountNumber());
	
	try {	
		service.updateEducationLoanDetails(educationLoan, 1234567890123456L);
	} 
	catch (ConstraintViolationException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
		Iterator<ConstraintViolation<?>> iterator = constraintViolations.iterator();
		while(iterator.hasNext()){
			ConstraintViolation<?> next = iterator.next();
			System.out.println("Validation message: "+next.getMessage());
			System.out.println("Invalid field: "+next.getPropertyPath());
			System.out.println("Validation class/bean: "+next.getRootBean());
//			 result.reject(next.getPropertyPath(), next.getMessage());
			result.rejectValue(next.getPropertyPath().toString(), "", next.getMessage());
//			result.rejectValue(arg0, arg1, arg2);
		}
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	model.addAttribute("m1", educationLoan.getEdu_Loan_Account_Number());

	if (result.hasErrors()) {
		return "educationLoan";
	} 
	
	return "member";
	

}
}

	


