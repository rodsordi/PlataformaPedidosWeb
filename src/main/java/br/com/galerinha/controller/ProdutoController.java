package br.com.galerinha.controller;

import br.com.galerinha.business.ProdutoBusiness;
import br.com.galerinha.dto.ProdutoDTO;
import br.com.galerinha.entity.ProdutoEntity;


public class ProdutoController {
	
	private ProdutoBusiness produtoBusiness = new ProdutoBusiness();
	
	public void salvarPedido(ProdutoDTO produtoDTO) {
		if (produtoDTO.getNome() == null)
			throw new RuntimeException("Nome do produto deve ser informado");
		
		if (produtoDTO.getQtdEstoque() == null)
			throw new RuntimeException("Quantidade de estoque deve ser informado");
		
		if (produtoDTO.getValor() == null)
			throw new RuntimeException("Valor do produto deve ser informado");
		
		ProdutoEntity produtoEntity = new ProdutoEntity();
		produtoEntity.setNome(produtoDTO.getNome());
		produtoEntity.setQtd_estoque(Integer.valueOf(produtoDTO.getQtdEstoque()));
		produtoEntity.setValor(Double.valueOf(produtoDTO.getValor()));
		
		produtoBusiness.salvarProduto(produtoEntity);
	}
}
