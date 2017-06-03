package com.cognizant.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class UserDetails {

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ACCOUNT_NUMBER")
	long accountNumber;
	String accountType;
	String accountHolderName;
	long acconutBalance;

	@JsonManagedReference
	@OneToMany(mappedBy = "userDtails", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@Fetch(FetchMode.SELECT)
	private List<HomeLoan> homeLoan;

	public UserDetails() {
	}

	public List<HomeLoan> getHomeLoan() {
		return homeLoan;
	}

	public void setHomeLoan(List<HomeLoan> homeLoan) {
		this.homeLoan = homeLoan;
	}

	@JsonManagedReference
	@OneToMany(mappedBy = "userDtails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<EducationLoan> educationLoan;

	public List<EducationLoan> getEducationLoan() {
		return educationLoan;
	}

	public void setEducationLoan(List<EducationLoan> educationLoan) {
		this.educationLoan = educationLoan;
	}

	@JsonManagedReference
	@OneToMany(mappedBy = "userDtails", cascade = CascadeType.ALL)
	private List<TransactionDetailsVO> tdDetails;

	public List<TransactionDetailsVO> getTdDetails() {
		return tdDetails;
	}

	public void setTdDetails(List<TransactionDetailsVO> tdDetails) {
		this.tdDetails = tdDetails;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ACCOUNT_NUMBER")
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getAcconutBalance() {
		return acconutBalance;
	}

	public void setAcconutBalance(long acconutBalance) {
		this.acconutBalance = acconutBalance;
	}

	public UserDetails(long accountNumber, String accountType, String accountHolderName, long acconutBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.acconutBalance = acconutBalance;
		// this.homeLoan = homeLoan;
	}

	@Override
	public String toString() {
		return "UserDetails [accountNumber=" + accountNumber + ", accountType=" + accountType + ", accountHolderName="
				+ accountHolderName + ", acconutBalance=" + acconutBalance + "]";
	}

}
