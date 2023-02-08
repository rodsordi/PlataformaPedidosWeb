package br.com.galerinha.servlet;

import java.io.IOException;

import br.com.galerinha.controller.UsuarioController;
import br.com.galerinha.dto.UsuarioDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/produtos")
public class ProdutosServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("jsp/produtos.jsp").forward(req, resp);
	}
}
