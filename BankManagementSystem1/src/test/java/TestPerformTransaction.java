package test.java;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.entity.TransactionDetailsVO;
import com.cognizant.service.PerformTransactionService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestPerformTransaction {

	@Autowired
	PerformTransactionService service;
	TransactionDetailsVO transaction;
	
	//@Before
	public void setUp() {
		transaction = new TransactionDetailsVO("hjdhjdj","withdrawal",16523);
		}

	//@Test
	public void testUpdateTransactionDetails (){
		System.out.println(transaction);
		service.updateTransactionDetails(transaction,(long)1234);
		assertTrue(true);
	}
	
	//@Test
	public void retrieveTransactionDetails(){
		List<TransactionDetailsVO> transactionDetails=service.retrieveTransactionDetails((long) 1234);
		assertEquals(transactionDetails.size(),2);
		
	}
	
}
