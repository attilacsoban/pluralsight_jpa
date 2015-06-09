<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>

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
<br>

<div ng-controller="events">
reset data with ng-click practice
<input name="firstname" ng-model="firstName" type="text" ><br>
<input name="lastname" ng-model="lastName" type="text" ><br>
<input name="email" ng-model="email" type="text" ><br>
<button ng-click="reset()">reset inputs to def</button>
</div>
<br>
validation
<div ng-controller="validation">
	<form action="" name="form1" novalidate="novalidate">
		<table>
			<tr>
				<td>firstname:</td>
				<td>
					<input type="text" ng-model="firstName" name="firstname" required="required">
					<span style="color:red" ng-show="form1.firstname.$dirty && form1.firstname.$invalid">
						<span ng-show="form1.firstname.$error.required">name required</span>
					</span>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>{{'dirty?: =>  ' + form1.firstname.$dirty}}</td>
			</tr>
			<tr>
				<td>a</td>
				<td>a</td>
			</tr>
		</table>
		
	</form>
	
</div>


<script src='<spring:url value="assets/js/mainApp.js" />' type="text/javascript"></script>
<script src='<spring:url value="assets/js/studentController.js" />' type="text/javascript"></script>
<script src='<spring:url value="assets/js/myController.js" />' type="text/javascript"></script>
<script src='<spring:url value="assets/js/controller2.js" />' type="text/javascript"></script>
<script src='<spring:url value="assets/js/events.js" />' type="text/javascript"></script>
<script src='<spring:url value="assets/js/validation.js" />' type="text/javascript"></script>

</body>
</html>