app.service('ServiceInitializer', function($http) {

	this.getLogin = function(login, senha) {
		var response = $http({
			method : "POST",
			url : '/social-book/login',
			headers : {
				'Content-Type' : "application/json"
			},
			data : {
				login : login,
				senha : senha
			}

		});
		return response;
	};

	this.getCarregamentoDados = function() {
		var response = $http.get('/carregar-dados');
		return response;
	}

});