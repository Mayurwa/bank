<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PERFORM TRANSACTION PAGE</title>
</head>
<body>
<form:form method="POST" commandName="/BaseCodeSlice_BankManagementSystem/mvc/addTransaction" modelAttribute="transaction">
<table>
  <%--   <tr>
        <td>Account Number:</td>
        <td><form:input path="accountNumber" /></td>
        <td><form:errors path="accountNumber" cssClass="error" /></td>
    </tr> --%>
    
    <tr>
        <td>Transaction Description :</td>
        <td><form:input path="transactionDescription" /></td>
        <td><form:errors path="transactionDescription" cssClass="error" /></td>
    </tr>
    <tr>
        <td>Transaction Type :</td>
        <td><form:input path="transactionType" /></td>
        <td><form:errors path="transactionType" cssClass="error" /></td>
    </tr>
    <tr>
        <td>Transaction Amount :</td>
        <td><form:input path="transactionAmount" /></td>
        <td><form:errors path="transactionAmount" cssClass="error" /></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Add"></td>
    </tr>
</table>
</form:form>
</body>
</html>