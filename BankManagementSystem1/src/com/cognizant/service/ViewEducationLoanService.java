package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.ViewEducationLoanDAO;
import com.cognizant.entity.EducationLoan;
import com.cognizant.entity.UserDetails;

@Component
public class ViewEducationLoanService {
UserDetails userDtails =new UserDetails();
	@Autowired
	ViewEducationLoanDAO dao;
	//private List<EducationLoan> eduLoan=new ArrayList<EducationLoan>();

	public UserDetails retriveEducationLoanDetails(long i) {
		// TODO Auto-generated method stub
		userDtails=dao.retriveEducationLoanDetails(i);
		return userDtails;
	}

}
