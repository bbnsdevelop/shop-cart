package br.com.shopcart.rest.response;

import java.util.List;

public class carregamentoInicialResponse {
	private List<ProdutosResponse> produtos;
	
	private List<ProdutosNovosResponse> novos;
	
	private List<ProdutosChegadosResponse> chegado;
	
	public List<ProdutosResponse> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutosResponse> produtos) {
		this.produtos = produtos;
	}

	public List<ProdutosNovosResponse> getNovos() {
		return novos;
	}

	public void setNovos(List<ProdutosNovosResponse> novos) {
		this.novos = novos;
	}

	public List<ProdutosChegadosResponse> getChegado() {
		return chegado;
	}

	public void setChegado(List<ProdutosChegadosResponse> chegado) {
		this.chegado = chegado;
	}
	
	
}
