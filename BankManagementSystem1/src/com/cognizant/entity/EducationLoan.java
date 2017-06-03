package com.cognizant.entity;

import java.util.ArrayList;
import java.util.List;

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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="EDUCATION_LOAN_DETAILS")
public class EducationLoan {
	
	
	           String educationLoanId;
                
	           
	          @Id
                private long Edu_Loan_Account_Number;
                
                @Column(name="Edu_Loan_Amount")
                @NotNull
                private double Edu_Loan_Amount;
                
                @Column(name="Loan_Apply_Date")
                @NotNull
                private String Loan_Apply_Date;
                
                @Column(name="Edu_Loan_Duration")
                @NotNull
                private int Edu_Loan_Duration;
                
                @Column(name="Father_Annual_Income")
                @NotNull
                private double Father_Annual_Income;
                
                @Column(name="Course_Fee")
                @NotNull
                private double Course_Fee;
                
                @Column(name="Course_Name")
                @NotNull
                private String Course_Name;
                
                @Column(name="Father_Name")
                @NotNull
                private String Father_Name;
                
                @Column(name="ID_Card_Number")
                @NotNull
                private long ID_Card_Number;
                @JsonBackReference
                @JsonIgnore
                @ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
           	 @JoinColumn(name = "ACCOUNT_NUMBER")
                private UserDetails userDtails; 
                
              //  public List <educationLoanVO> list=new ArrayList<educationLoanVO>() ;
               // EducationLoan obj=new EducationLoan();
				public EducationLoan() {
                                super();
                                // TODO Auto-generated constructor stub
                }
                

				public EducationLoan(double edu_Loan_Amount,
                                                String loan_Apply_Date, int edu_Loan_Duration, double father_Annual_Income, double course_Fee,
                                                String course_Name, String father_Name, long iD_Card_Number,UserDetails userDtails) {
                                super();
                
                              //  Account_Number = account_Number;
                                Edu_Loan_Amount = edu_Loan_Amount;
                                Loan_Apply_Date = loan_Apply_Date;
                                Edu_Loan_Duration = edu_Loan_Duration;
                                Father_Annual_Income = father_Annual_Income;
                                Course_Fee = course_Fee;
                                Course_Name = course_Name;
                                Father_Name = father_Name;
                                ID_Card_Number = iD_Card_Number;
                               this.userDtails =userDtails;
                }


                //Getters and Setters for EducationLoan


               
            /*    public int getAccount_Number() {
                                return Account_Number;
                }
                public void setAccount_Number(int account_Number) {
                                Account_Number = account_Number;
                }*/
                public long getEdu_Loan_Account_Number() {
                                return Edu_Loan_Account_Number;
                }
                public String getEducationLoanId() {
					return educationLoanId;
				}




				public void setEducationLoanId(String educationLoanId) {
					this.educationLoanId = educationLoanId;
				}




				public void setEdu_Loan_Account_Number(long edu_Loan_Account_Number) {
                                Edu_Loan_Account_Number = edu_Loan_Account_Number;
                }
                public double getEdu_Loan_Amount() {
                                return Edu_Loan_Amount;
                }
                public void setEdu_Loan_Amount(double edu_Loan_Amount) {
                                Edu_Loan_Amount = edu_Loan_Amount;
                }
                public String getLoan_Apply_Date() {
                                return Loan_Apply_Date;
                }
                public void setLoan_Apply_Date(String loan_Apply_Date) {
                                Loan_Apply_Date = loan_Apply_Date;
                }
                public int getEdu_Loan_Duration() {
                                return Edu_Loan_Duration;
                }
                public void setEdu_Loan_Duration(int edu_Loan_Duration) {
                                Edu_Loan_Duration = edu_Loan_Duration;
                }
                public double getFather_Annual_Income() {
                                return Father_Annual_Income;
                }
                public void setFather_Annual_Income(double father_Annual_Income) {
                                Father_Annual_Income = father_Annual_Income;
                }
                public double getCourse_Fee() {
                                return Course_Fee;
                }
                public void setCourse_Fee(double course_Fee) {
                                Course_Fee = course_Fee;
                }
                public String getCourse_Name() {
                                return Course_Name;
                }
                public void setCourse_Name(String course_Name) {
                                Course_Name = course_Name;
                }
                public String getFather_Name() {
                                return Father_Name;
                }
                public void setFather_Name(String father_Name) {
                                Father_Name = father_Name;
                }
                public long getID_Card_Number() {
                                return ID_Card_Number;
                }
                public void setID_Card_Number(long iD_Card_Number) {
                                ID_Card_Number = iD_Card_Number;
                }
                public UserDetails getUser() {
					return userDtails;
				}

				public void setUser(UserDetails userDtails) {
					this.userDtails = userDtails;
				}

                
                
                
              
                
                
}
