<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Registration Page</title>
<style>
	.cssClass {
		background-color: red;
	}
</style>
</head>
<body>

<form:form method="POST" commandName="/BaseCodeSlice_BankManagementSystem1/mvc/applyHomeLoan" modelAttribute="homeLoan">
<table>
   
    <tr>
        <td>Loan Amount :</td>
        <td><form:input path="loanAmount" /></td>
        <td><form:errors path="loanAmount" cssClass="error" /></td>
    </tr>
    <tr>
        <td>Loan Apply Date  :</td>
        <td><form:input path="loanApplyDate" /></td>
        <td><form:errors path="loanApplyDate" cssClass="error" /></td>
    </tr><tr>
        <td>Duration of the loan  :</td>
        <td><form:input path="loanDuration" /></td>
        <td><form:errors path="loanDuration" cssClass="error" /></td>
    </tr>
    <tr>
        <td>Annual Income  :</td>
        <td><form:input path="annualIncome" /></td>
        <td><form:errors path="annualIncome" cssClass="error" /></td>
    </tr>
    <tr>
        <td>Company Name   :</td>
        <td><form:input path="companyName" /></td>
        <td><form:errors path="companyName" cssClass="error" /></td>
    </tr>
    <tr>
        <td>Designation  :</td>
        <td><form:input path="designation" /></td>
        <td><form:errors path="designation" cssClass="error" /></td>
    </tr>
    <tr>
        <td>Total Exp   :</td>
        <td><form:input path="totalExperience" /></td>
        <td><form:errors path="totalExperience" cssClass="error" /></td>
    </tr>
    <tr>
        <td>Exp with Current company :</td>
        <td><form:input path="currentExperience" /></td>
        <td><form:errors path="currentExperience" cssClass="error" /></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Add"></td>
    </tr>
</table>
</form:form>

</body>
</html>