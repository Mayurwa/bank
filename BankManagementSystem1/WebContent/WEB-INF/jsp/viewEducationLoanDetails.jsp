<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body ng-app="myApp">
    <div ng-controller="EmpCtrl">
  
       
      <input type="text" ng-model="search.course_Name" placeholder="Search By Course Fee"/>
       <hr/>

        <table>
            <tr ng-repeat="e in List | filter: search">
                <td>{{e.edu_Loan_Account_Number}}</td>
                <td>{{e.education_Loan_ID}}</td>
                <td>{{e.edu_Loan_Amount}}</td>
                <td>{{e.loan_Apply_Date}}</td>
                <td>{{e.edu_Loan_Duration}}</td>
                <td>{{e.father_Annual_Income}}</td>
                <td>{{e.course_Fee}}</td>
                <td>{{e.course_Name}}</td>
                <td>{{e.father_Name}}</td>
                <td>{{e.id_Card_Number}}</td>
            </tr>
        </table>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <script>
        var app = angular.module('myApp', []);
        app.controller('EmpCtrl', function($scope, $http){
            $http({
              method: 'GET',
              url: 'http://localhost:8086/BankManagementSystem1/mvc/viewEducationLoanDetails1'
            }).then(res=>res.data)
            .then(data => {
            	console.log(data);
            	$scope.List = data;
            	console.log($scope.List);
            })
        
           
        })
    </script>
</body>
</html>