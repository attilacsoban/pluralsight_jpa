<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body ng-app="myApp">

<div  ng-controller="myController" ng-init="countries=[{locale:'en-US',name:'United States'},
																		{locale:'en-GB',name:'United Kingdom'}]">
	<input type="text" ng-model="input1">
	<h1>{{input1}}</h1>
	<h1 ng-bind="name"></h1>
	<h2>list of countries and locales</h2>
	<ul>
		<li ng-repeat="x in countries">
			{{"Country" + x.name + ", locale: " + x.locale}}
		</li>
	</ul>
</div>
<div ng-controller="controller2">
	first name: <input type="text" ng-model="student.firstName">
	lastname:<input type="text" ng-model="student.lastName">
	<br>
	fullname: {{student.fullName()}}
</div>

aaa













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

</script>

</body>
</html>