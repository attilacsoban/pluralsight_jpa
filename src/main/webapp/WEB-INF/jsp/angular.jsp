<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body ng-app="myApp">

<div ng-controller="myController">
	<input type="text" ng-model="input1">
	<h1>{{input1}}</h1>
	<h1 ng-bind="name"></h1>
</div>
aaa













<script type="text/javascript">

var app = angular.module("myApp",[]);
app.controller("myController", function($scope) {
	$scope.name = "Attila";
});

</script>

</body>
</html>