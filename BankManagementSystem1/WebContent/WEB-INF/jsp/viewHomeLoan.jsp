<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">
<title>Insert title here</title>
</head>

<body ng-app="myApp">
    <div ng-controller="EmpCtrl">
       
      <input type="text" ng-model="search.companyName" placeholder="Search By company Name"/>
       <hr/>

        <table>
            <tr ng-repeat="homeLoan in homeLoans | filter: search">
                <td>{{$index + 1}}</td>
                <td>{{homeLoan.homeLoanId}}</td>
                <td>{{homeLoan.loanAmount}}</td>
                <td>{{homeLoan.loanDuration}}</td>
                <td>{{homeLoan.loanApplyDate}}</td>
                <td>{{homeLoan.annualIncome}}</td>
                <td>{{homeLoan.companyName}}</td>
                <td>{{homeLoan.designation}}</td>
                <td>{{homeLoan.totalExperience}}</td>
                <td>{{homeLoan.currentExperience}}</td>
                <td>{{homeLoan.currentExperience}}</td>
            </tr>
        </table>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <script>
        var app = angular.module('myApp', []);
        app.controller('EmpCtrl', function($scope, $http){
            $http({
              method: 'GET',
              url: 'http://localhost:8086/BankManagementSystem1/mvc/viewHomeLoan1'
            }).then(res=>res.data)
            .then(data => {
            	console.log(data);
            	$scope.homeLoans = data;
            })
        
           
        })
    </script>
</body>
</html>