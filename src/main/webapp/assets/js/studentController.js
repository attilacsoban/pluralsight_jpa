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