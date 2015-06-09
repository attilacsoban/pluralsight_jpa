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
<script type="text/javascript" src="assets/js/mainApp.js" /></script>
<script type="text/javascript" src="assets/js/studentController.js" ></script>
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






<script type="text/javascript">
var app = angular.module("myApp",[]);

app.controller("myController", function($scope) {
	$scope.name = "Attila";
});


app.controller("controller2", function($scope) {
	$scope.student = {
			firstName: "attila",
			lastName: "csoban",
			fullName: function(){
				var obj;
				obj = $scope.student;
				return obj.firstName + " " + obj.lastName;
			}			
	};
});
app.controller("studentController", function($scope) {
	$scope.student =  {
			firstName: "Attila",
			lastName: "Csoban",
			fees: 500,
			subjects: [
			           {name:"math",mark:70},
			           {name:"phisysics",mark:80},
			           {name:"chemistry",mark:90}
			           ],
			fullName: function(){
				var obj = $scope.student;
				return  obj.lastName + " " + obj.firstName;
			}			
	};
});

</script>

</body>
</html>