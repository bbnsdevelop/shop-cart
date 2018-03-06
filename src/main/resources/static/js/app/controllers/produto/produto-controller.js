app.controller('produtoController', function($scope, $location, ServiceInitializer) {
	$scope.produtosNovos = null;
	$scope.produtosNew = null;
	$scope.produtos = null;
	
	var produtosResponse = [];
	
	carregarProdutos = function(){
		ServiceInitializer.getCarregamentoDados()
		.then(function(response) { //sucess
			produtosResponse = response.data;
    		$scope.produtos = produtosResponse.produtos;
    		$scope.produtosNovos = produtosResponse.novos;
    		$scope.produtosNew = produtosResponse.chegado;
    	},
    	function(response){ //error
    	 
    	});	    
	};
	
	$scope.detalheProduto = function(produto){
		$scope.produtoDetalhe = produto;
    	$location.path('/product-details');
    };
	
	carregarProdutos();
});