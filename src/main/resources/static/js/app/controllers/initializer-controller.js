app.controller('initializerController', function($scope, $location, ServiceInitializer) {
	$scope.produtos = {};
	
	$scope.produtos.itens = 3;
	$scope.produtos.valorTotal = 200.98;
	var loginResponse= [];
	$scope.logar = function() {
        var usuario = $scope.login;
        var pas = $scope.senha;
        ServiceInitializer.getLogin(usuario, pas)
        	.then(function(response) {
        		loginResponse = response.data;
        		$scope.login = loginResponse;
        		verificarLogin($scope.login);
	    }, 
	    function(response) { // error
	    	console.log(response.data);
	    	console.log(response.status);
	    });
    };    
    verificarLogin = function(login){
    	if(login){
    		
    	}
    }    
    
    init = function(){
    	$location.path('/produtos');
    };
    init();
});