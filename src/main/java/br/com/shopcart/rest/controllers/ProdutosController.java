package br.com.shopcart.rest.controllers;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.shopcart.service.ProdutoService;

@RestController
public class ProdutosController {
	
	@Inject
	ProdutoService ProdutoService;
	
	@RequestMapping(value="/carregar-dados", method = RequestMethod.GET)
	public ResponseEntity<?> carregar(){
		
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(ProdutoService.carregarDadosIniciais());
	} 
}
