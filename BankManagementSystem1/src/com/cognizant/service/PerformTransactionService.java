package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.dao.PerformTransactionDAO;
import com.cognizant.entity.TransactionDetailsVO;
import com.cognizant.entity.UserDetails;
import com.cognizant.exception.InvalidAccountBalance;




@Component
public class PerformTransactionService {

	@Autowired
	PerformTransactionDAO ptDAO;
	InvalidAccountBalance invalidAccountBalance ;
	
	@Transactional
	public void updateTransactionDetails(TransactionDetailsVO transaction,Long accountNumber) throws  InvalidAccountBalance {
		  System.out.println("inside service"); 
		  UserDetails userDtails=ptDAO.updateTransactionDetails(accountNumber);
          
		  transaction.setUser(userDtails);
          
		  List<TransactionDetailsVO> transactionList=new ArrayList<TransactionDetailsVO>();
          System.out.println(transaction);
          transactionList.add(transaction);
          userDtails.setTdDetails(transactionList);
          System.out.println(userDtails);
          //updates the balance in user table
          updateUser(transaction.getTransactionAmount(), userDtails,transaction.getTransactionType());
          
		
	}


		private void updateUser(int transactionAmount, UserDetails userDtails,String transactionType) throws InvalidAccountBalance {
			long newBalance=0;
			
			if(transactionType.equals("DEPOSIT")){
				newBalance=userDtails.getAcconutBalance()+transactionAmount;
				userDtails.setAcconutBalance(newBalance);
			}
			
			else{
				newBalance=userDtails.getAcconutBalance()-transactionAmount;
			
			
				if(newBalance<5000 &&userDtails.getAccountType().equals("SAVINGS")){
				
					throw new InvalidAccountBalance("Saving Account's Balance can't be less than 5000");
				
			}
				else if(newBalance<0){
				
					throw new InvalidAccountBalance("Insufficient Balance");
				}
			
			else{
			
				userDtails.setAcconutBalance(newBalance);
				}
			}
		
	}


		public List<TransactionDetailsVO> retrieveTransactionDetails(Long accountNumber) {
			List<TransactionDetailsVO> transactionDetails =ptDAO.retrieveTransactionDetails(accountNumber);
		//	System.out.println(transactionDetails);
			return transactionDetails;
		
	}
		
	
}
