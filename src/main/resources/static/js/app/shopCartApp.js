var app = angular.module("shopCartApp", ['ngRoute']).config(function($routeProvider){
	$routeProvider	 
	 .when('/login', {
		  templateUrl : '/view/login/login.html',
	      controller  : 'loginController'
	 })
	 .when('/produtos', {
		  templateUrl : '/view/produto/produto-index.html',
	      controller  : 'produtoController'
	 })	 
	 .when('/list-view', {
		  templateUrl : '/view/produto/list-view.html',
	      controller  : 'produtoController'
	 })
	 .when('/grid-view', {
		  templateUrl : '/view/produto/grid-view.html',
	      controller  : 'produtoController'
	 })
	 .when('/three-col', {
		  templateUrl : '/view/produto/three-col.html',
	      controller  : 'produtoController'
	 })
	 .when('/four-col', {
		  templateUrl : '/view/produto/four-col.html',
	      controller  : 'produtoController'
	 })
	 .when('/general', {
		  templateUrl : '/view/produto/general.html',
	      controller  : 'produtoController'
	 })	
	 .when('/product-details', {
		  templateUrl : '/view/produto/product_details.html',
	      controller  : 'produtoController'
	 })
	 .when('/registrar', {
		  templateUrl : '/view/registrar/register.html',
	 })
	 .when('/localizacao', {
		  templateUrl : '/view/company/contact.html',
		  controller  : 'contratarController'
	 })
	 .when('/carrinho', {
		  templateUrl : '/view/carrinho/cart.html',
		  controller  : 'carrinhoController'
	 })	
	 .otherwise({rediretTo:'/shop-cart/home'});
		
	
});