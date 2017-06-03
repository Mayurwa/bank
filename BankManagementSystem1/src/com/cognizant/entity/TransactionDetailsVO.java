package com.cognizant.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.criterion.Property;
import org.springframework.beans.factory.annotation.Value;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity



//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, 
//property = "idTaskAction")



public class TransactionDetailsVO {
	@Override
	public String toString() {
		return "TransactionDetailsVO [transactionId=" + transactionId + ", transactionDescription="
				+ transactionDescription + ", transactionType=" + transactionType + ", transactionAmount="
				+ transactionAmount + "]";
	}

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TRANSACTION_ID")
	long transactionId=(long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;;
	
	@NotNull
    @Size(min=4,max=50)
	@Column(name="TRANSACTION_DESCRIPTION")
	String transactionDescription;
	
	@NotNull
	@Column(name="TRANSACTION_TYPE")
	String transactionType;
	
	@NotNull
	@Column(name="TRANSACTION_AMOUNT")
	int transactionAmount;
	
	@JsonBackReference
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_NUMBER")
		private UserDetails userDtails;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}


	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(int accountBalance) {
		this.transactionAmount = accountBalance;
	}
	
	

	
	public TransactionDetailsVO(){
		
	}

	public TransactionDetailsVO(String transactionDescription, String transactionType, int transactionAmount) {
		super();
		this.transactionDescription = transactionDescription;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
	}

	public UserDetails getUser() {
		return userDtails;
	}

	public void setUser(UserDetails userDtails) {
		this.userDtails = userDtails;
	}
	
	}
