package com.cognizant.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.entity.EducationLoan;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.ViewEducationLoanService;

@Controller
public class ViewEducationLoanController {
	
	
	@Autowired
	ViewEducationLoanService service;
	List<EducationLoan> eduLoan;
	
	@RequestMapping(value = "/viewEducationLoanDetails", method=RequestMethod.GET)
	public String getEducationLoans(){
		
		
		return "viewEducationLoanDetails";
	}
	
	@RequestMapping(value="/viewEducationLoanDetails1",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody  List<UserDetails> getList (){
		
		UserDetails userDetails = service.retriveEducationLoanDetails(4544523445699997L);

		userDetails.setHomeLoan(null);
		userDetails.setTdDetails(null);

	List<UserDetails> List=new ArrayList<UserDetails>();
	List<EducationLoan>  eduLoan=userDetails.getEducationLoan();
	List<EducationLoan> newEduList=new ArrayList<>();
	
	for(int i=0;i<eduLoan.size();i++){
		EducationLoan eld=null;
		eld=eduLoan.get(i);
		eld.setUser(null);
		newEduList.add(eld);	
	}
System.out.println(eduLoan);
userDetails.setEducationLoan(newEduList);
List.add(userDetails);
System.out.println(newEduList);
return List;
		
	}
	
}

