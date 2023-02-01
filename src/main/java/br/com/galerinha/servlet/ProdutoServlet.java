package br.com.galerinha.servlet;

import java.io.IOException;

import br.com.galerinha.controller.ProdutoController;
import br.com.galerinha.dto.ProdutoDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastroDeProduto")
public class ProdutoServlet extends HttpServlet {
	
	private ProdutoController produtoController = new ProdutoController();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("jsp/cadastro-produto.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String qtdEstoque = req.getParameter("qtdEstoque");
		String valor = req.getParameter("valor");
		
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setNome(nome);
		produtoDTO.setQtdEstoque(qtdEstoque);
		produtoDTO.setValor(valor);
		
		req.setAttribute("nomeDoProduto", nome);
		produtoController.salvarPedido(produtoDTO);
        req.getRequestDispatcher("jsp/produto-cadastrado-com-sucesso.jsp").forward(req, resp);
	}
}
