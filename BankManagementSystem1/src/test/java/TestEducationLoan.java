package test.java;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.entity.EducationLoan;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.ApplyEducationLoanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestEducationLoan {

	
	@Autowired
	ApplyEducationLoanService service;
	
	private List<EducationLoan> eduLoan;
	private UserDetails user;

	@Before
	public void setup(){
		 user=new UserDetails(4544523445699997L,"current","Raman", 70000);
		 
		 long loanAccountNumber1=service.generateLoanAccountNumber();
		 long loanAccountNumber2=service.generateLoanAccountNumber();

		 

		EducationLoan e1 = new EducationLoan(16900,"2006-08-20",2,9000,160000,"BA","Ajax",399991310,user);
		EducationLoan e2 = new EducationLoan(16000,"06-07-2017",2,9000,160000,"BA","Ajax",399991310,user);
		
		String eduLoanId1=service.generateLoanId(e1.getID_Card_Number());
		String eduLoanId2=service.generateLoanId(e2.getID_Card_Number());
		e1.setEdu_Loan_Account_Number(loanAccountNumber1);
		e2.setEdu_Loan_Account_Number(loanAccountNumber2);
		e1.setEducationLoanId(eduLoanId1);
		e2.setEducationLoanId(eduLoanId2);
		eduLoan = new ArrayList<EducationLoan>();
		eduLoan.add(e1);
		eduLoan.add(e2);
		
	}
	@Test
	public void testinsertEducationLoanDetails(){
		try{
			user.setEducationLoan(eduLoan);
			service.insertEducationLoanDetails(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Not supplied valid name");
		}
	}
	
	//@Test
	public void testupdateEducationLoanDetails(){
		long i=1234567994124577L;
		EducationLoan e = new EducationLoan(79000,"06-07-2017",2,9000,160000,"BSC","Ramesh",348771310,user);
		String eduLoanId=service.generateLoanId(e.getID_Card_Number());
		long loanAccountNumber=service.generateLoanAccountNumber();
		e.setEdu_Loan_Account_Number(loanAccountNumber);
		e.setEducationLoanId(eduLoanId);
		

			
			service.updateEducationLoanDetails(e,i);
		
		}
}
	
	
        
               
               
	
	
	



