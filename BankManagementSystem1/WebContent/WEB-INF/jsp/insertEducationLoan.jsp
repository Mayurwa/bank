<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Insert Education Loan</title>
<style>
	.cssClass {
		background-color: red;
	}
</style>
</head>
<body>

<form:form method="POST" commandName="/BankManagementSystem1/mvc/insertEducationLoan" modelAttribute="educationLoan">
<table>
   
   
   
    <tr>
        <td>Loan Amount </td>
        <td><form:input path="Edu_Loan_Amount" /></td>
        <td><form:errors path="Edu_Loan_Amount" cssClass="error" /></td>
    </tr>
    
     <tr>
        <td>Loan Apply Date </td>
        <td><form:input path="Loan_Apply_Date" /></td>
        <td><form:errors path="Loan_Apply_Date" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td>Loan Duration </td>
        <td><form:input path="Edu_Loan_Duration" /></td>
        <td><form:errors path="Edu_Loan_Duration" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td>Course name </td>
        <td><form:input path="Course_Name" /></td>
        <td><form:errors path="Course_Name" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td>Course Fee</td>
        <td><form:input path="Course_Fee" /></td>
        <td><form:errors path="Course_Fee" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td>Father Name </td>
        <td><form:input path="Father_Name" /></td>
        <td><form:errors path="Father_Name" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td>ID Number </td>
        <td><form:input path="ID_Card_Number" /></td>
        <td><form:errors path="ID_Card_Number" cssClass="error" /></td>
    </tr>
     <tr>
        <td>Father's Annual Income </td>
        <td><form:input path="Father_Annual_Income" /></td>
        <td><form:errors path="Father_Annual_Income" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td colspan="2"><input type="submit" value="add"></td>
    </tr>
</table>
</form:form>

</body>
</html>