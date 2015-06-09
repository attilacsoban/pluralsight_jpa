app.controller("validation",function($scope){
	$scope.reset = function (){
		$scope.firstName = "Attila";
		$scope.lastName = "Csoban";
		$scope.email = "aaa@aa.aa";
	}
	$scope.reset();
});