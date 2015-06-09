<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>

<!-- CSA -->
<!-- <script src="http://localhost:8080/FitnessTracker/assets/js/studentController.js" type="text/javascript"></script> -->
<!-- <script src="http://localhost:8080/FitnessTracker/assets/js/mainApp.js" type="text/javascript"></script> -->

<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table, td, tr,th{
		border: 1px solid red		
	}
	
</style>

</head>
<body ng-app="myApp">

<div  ng-controller="myController" ng-init="countries=[{locale:'en-US',name:'United States'},
														{locale:'en-GB',name:'United Kingdom'}]">
	<input type="text" ng-model="input1">
	<h1>{{input1}}</h1>
	<h1 ng-bind="name"></h1>
	<h2>list of countries and locales</h2>
	filter for locale: <input type="text" ng-model="localeFilter">
	<ul>
		<li ng-repeat="x in countries | filter: localeFilter">
			{{"Country" + x.name + ", locale: " + x.locale}}
		</li>
	</ul>
	<br>Ordered by name filter
	<ul>
		<li ng-repeat="x in countries | orderBy: 'name'">
			{{"Country" + x.name + ", locale: " + x.locale}}
		</li>
	</ul>
</div>
<div ng-controller="controller2">
	first name: <input type="text" ng-model="student.firstName">
	lastname:<input type="text" ng-model="student.lastName">
	<br>
	fullname: {{student.fullName() | uppercase}}
</div>

Students table
<div ng-controller="studentController">
	<table >
		<tr><td>name:</td><td>{{student.fullName()}}</td></tr>
		<tr><td>subjects</td>
			<td>
				<table>
					<tr><th>name</th><th>mark</th></tr>
					<tr ng-repeat="s in student.subjects">
						<td>{{s.name}}</td>
						<td>{{s.mark}}</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>

show
<br>
<input type="checkbox" ng-model="check">
<button type="submit" ng-show="check">adada</button>
<br>
disabled
<br>
<button type="submit" ng-disabled="check">adada</button>

<script src='<spring:url value="assets/js/mainApp.js" />' type="text/javascript"></script>
<script src='<spring:url value="assets/js/studentController.js" />' type="text/javascript"></script>
<script src='<spring:url value="assets/js/myController.js" />' type="text/javascript"></script>
<script src='<spring:url value="assets/js/controller2.js" />' type="text/javascript"></script>

</body>
</html>