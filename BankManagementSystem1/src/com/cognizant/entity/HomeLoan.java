package com.cognizant.entity;



import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.ejb.criteria.expression.function.AggregationFunction.MIN;
import org.springframework.beans.factory.annotation.Value;

import com.cognizant.entity.UserDetails;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
//@Table(name="Home_Loan_Details")
public class HomeLoan {

	
	//@GeneratedValue(strategy=GenerationType.AUTO)

	private String homeLoanId;
	
	// @Column(name="LOAN_AMOUNT")
	@NotNull
	private long loanAmount;
	
	// @Column(name="LOAN_DURATION")
	@NotNull
	private  int loanDuration;
	 
	 //long accountNumber;
	@NotNull
	private Date loanApplyDate;
    @NotNull
	private  long annualIncome;
	@NotNull
	private  String companyName;
	@NotNull
	private  String designation;
	@NotNull
	private  int totalExperience;
	@NotNull
	private  int currentExperience;
		
	 @Id
	 private  long loanAccountNumber;
//	 public long getAccountNumber() {
//		return accountNumber;
//	}
//	public void setAccountNumber(long accountNumber) {
//		this.accountNumber = accountNumber;
//	}
	public long getLoanAccountNumber() {
		return loanAccountNumber;
	}
	public void setLoanAccountNumber(long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	 @JoinColumn(name = "ACCOUNT_NUMBER")
		private UserDetails userDtails;
	 
	 public UserDetails getUserDtails() {
		return userDtails;
	}
	public void setUserDtails(UserDetails userDtails) {
		this.userDtails = userDtails;
	}



	 
	public String getHomeLoanId() {
		return homeLoanId;
	}
	public void setHomeLoanId(String homeLoanId) {
		this.homeLoanId = homeLoanId;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	
	public Date getLoanApplyDate() {
		return loanApplyDate;
	}
	public void setLoanApplyDate(Date loanApplyDate) {
		this.loanApplyDate = loanApplyDate;
	}
	public long getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(long annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}
	public int getCurrentExperience() {
		return currentExperience;
	}
	public void setCurrentExperience(int currentExperience) {
		this.currentExperience = currentExperience;
	}
	
	
	@Override
	public String toString() {
		return "HomeLoan [homeLoanId=" + homeLoanId + ", loanAmount=" + loanAmount + ", loanDuration=" + loanDuration
				+ ", loanApplyDate=" + loanApplyDate + ", annualIncome=" + annualIncome + ", companyName=" + companyName
				+ ", designation=" + designation + ", totalExperience=" + totalExperience + ", currentExperience="
				+ currentExperience + ", loanAccountNumber=" + loanAccountNumber + "]";
	}
	public HomeLoan(long loanAmount, int loanDuration, Date loanApplyDate,
			long annualIncome, String companyName, String designation, int totalExperience, int currentExperience,UserDetails userDetails) {
		super();
	//this.loanAccountNumber=loanAccountNumber;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.loanApplyDate = loanApplyDate;
		this.annualIncome = annualIncome;
		this.companyName = companyName;
		this.designation = designation;
		this.totalExperience = totalExperience;
		
		this.currentExperience = currentExperience;
		this.userDtails=userDetails;
	}
	
	  
	public HomeLoan(){}	
}
