package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import com.cognizant.entity.TransactionDetailsVO;
import com.cognizant.entity.UserDetails;


@Component
//@ImportResource("classpath:beans.xml")
public class PerformTransactionDAO {
	  @PersistenceContext
	  private EntityManager em;
	 	
	
	public UserDetails updateTransactionDetails(Long accountNumber) {
		UserDetails userDtails=em.find(UserDetails.class,accountNumber );
		//System.out.println("dao user :"+userDtails);
		return userDtails;
		}
	/*@Transactional
	public String getAccountHolderName(Long accountNumber) {
		Query query = em.createQuery("select account_holder_name from mock_data e where e.account_number= ?");
		query.setParameter(1, accountNumber);
		String userName=(String) query.getSingleResult();
		return userName;
		
	}*/

	public List<TransactionDetailsVO> retrieveTransactionDetails(Long accountNumber) {
		
		UserDetails userDtails=em.find(UserDetails.class, accountNumber);
		//System.out.println(userDtails);
	//	System.out.println(userDtails.getTdDetails());
		List<TransactionDetailsVO> transaction=userDtails.getTdDetails();
		return transaction; 
		
	}

}
