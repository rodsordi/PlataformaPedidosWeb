package br.com.galerinha.servlet;

import java.io.IOException;

import br.com.galerinha.controller.UsuarioController;
import br.com.galerinha.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastroDeUsuario")
public class UsuarioServlet extends HttpServlet {
	
	private UsuarioController usuarioController = new UsuarioController();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("jsp/cadastrar-usuario.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeDoUsuario = req.getParameter("nomeDoUsuario");
		String emailDoUsuario = req.getParameter("emailDoUsuario");
		String senhaDoUsuario = req.getParameter("senhaDoUsuario");
		
		Usuario usuario = new Usuario();
		usuario.setNomeDoUsuario(nomeDoUsuario);
		usuario.setEmailDoUsuario(emailDoUsuario);
		usuario.setSenhaDoUsuario(senhaDoUsuario);
		
		req.setAttribute("nomeDoUsuario", nomeDoUsuario);
		
		usuarioController.salvarUsuario(usuario);
		
        req.getRequestDispatcher("jsp/usuario-cadastrado-com-sucesso.jsp").forward(req, resp);
	}
	
	
}
