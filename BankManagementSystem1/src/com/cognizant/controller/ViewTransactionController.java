package com.cognizant.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.entity.TransactionDetailsVO;
import com.cognizant.service.PerformTransactionService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ViewTransactionController  {
	 @Autowired
	 PerformTransactionService service;
	 TransactionDetailsVO transactionDetails;
	 
	private List<TransactionDetailsVO> details;
	@RequestMapping(value = "/getTransaction", method=RequestMethod.GET)
	public String searchUserTransaction (){
		
		return "getTransaction";
	}
	@RequestMapping(value="/getTransactionDetails",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody  List<TransactionDetailsVO> getUserDetails(){
		
		List<TransactionDetailsVO> transactionDetailsList=service.retrieveTransactionDetails(1234567890123456l);
		/*User userDetails= new User(1231457890123856L,"saving","sumit,",4785655);
		User userDetails2=new User(1231457890123456L,"saving","sumit,",4785655);
		List<User> u=new ArrayList<User>();
		u.add(userDetails);
		u.add(userDetails2);*/
		
		//System.out.println("controller:"+transactionDetailsList);
		return transactionDetailsList;
	
	}
	
}
