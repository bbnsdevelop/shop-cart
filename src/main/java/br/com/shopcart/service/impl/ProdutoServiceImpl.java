package br.com.shopcart.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.shopcart.rest.response.ProdutosChegadosResponse;
import br.com.shopcart.rest.response.ProdutosNovosResponse;
import br.com.shopcart.rest.response.ProdutosResponse;
import br.com.shopcart.rest.response.carregamentoInicialResponse;
import br.com.shopcart.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Override
	public carregamentoInicialResponse carregarDadosIniciais() {
		carregamentoInicialResponse response = new carregamentoInicialResponse();
		
		String nome = "Relogio";
		Integer quantidade = 10;
		BigDecimal preco = new BigDecimal(28); 
		String descricao = "Nowadays the lingerie industry is one of the most successful business spheres. We always stay in touch with the latest fashion tendencies - that is why our goods are so popular..";
		String cor = "preto";
		List<ProdutosResponse> produtosList = new ArrayList<>();
		List<ProdutosNovosResponse> produtosNovosList = new ArrayList<>();
		List<ProdutosChegadosResponse> produtosChegadosList = new ArrayList<>();
		
		for(int i = 0; i<= 10; i++){
			ProdutosResponse produtos = new ProdutosResponse();
			ProdutosNovosResponse produtosNovosResponse = new ProdutosNovosResponse();
			ProdutosChegadosResponse produtosChegadosResponse = new ProdutosChegadosResponse();
			produtos.setNome(nome);
			produtos.setQuantidade(quantidade);
			produtos.setPreco(preco);
			produtos.setDescricao(descricao);
			produtos.setCor(cor);
			produtosList.add(produtos);
			produtosNovosResponse.setNome(nome);
			produtosNovosResponse.setQuantidade(quantidade);
			produtosNovosResponse.setPreco(preco);
			produtosNovosResponse.setDescricao(descricao);
			produtosNovosResponse.setCor(cor);
			produtosNovosList.add(produtosNovosResponse);
			produtosChegadosResponse.setNome(nome);
			produtosChegadosResponse.setQuantidade(quantidade);
			produtosChegadosResponse.setPreco(preco);
			produtosChegadosResponse.setDescricao(descricao);
			produtosChegadosResponse.setCor(cor);
			produtosChegadosList.add(produtosChegadosResponse);			
			
		}
		response.setChegado(produtosChegadosList);
		response.setNovos(produtosNovosList);
		response.setProdutos(produtosList);
		return response;
	}

}
