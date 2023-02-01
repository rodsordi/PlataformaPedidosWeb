package br.com.galerinha.business;

import br.com.galerinha.dao.ProdutoDAO;
import br.com.galerinha.dto.ProdutoDTO;
import br.com.galerinha.entity.ProdutoEntity;

public class ProdutoBusiness {
	
	private ProdutoDAO produtoDAO = new ProdutoDAO();
	
	public void salvarProduto(ProdutoEntity produtoEntity) {
		if (produtoEntity.getQtd_estoque() < 1)
			throw new RuntimeException("Quantidade de produto não pode ser menor que 1");
		
		if (produtoEntity.getValor() <= 0)
			throw new RuntimeException("O valor deve ser informado");
		
		produtoDAO.salvarProduto(produtoEntity);
	}
}
