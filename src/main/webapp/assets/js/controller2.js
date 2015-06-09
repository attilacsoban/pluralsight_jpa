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