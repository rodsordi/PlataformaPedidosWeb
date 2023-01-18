package br.com.galerinha.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.StringUtils;

import br.com.galerinha.business.UsuarioBusiness;
import br.com.galerinha.dto.UsuarioDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastroDeUsuario")
public class UsuarioController extends HttpServlet {
	
	private UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("jsp/cadastrar-usuario.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeDoUsuario = req.getParameter("nomeDoUsuario");
		String dataDeNascimento = req.getParameter("dataDeNascimento");
		String emailDoUsuario = req.getParameter("emailDoUsuario");
		String senhaDoUsuario = req.getParameter("senhaDoUsuario");
		
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		usuarioDTO.setNomeDoUsuario(nomeDoUsuario);
		usuarioDTO.setDataNascimento(dataDeNascimento);
		usuarioDTO.setEmailDoUsuario(emailDoUsuario);
		usuarioDTO.setSenhaDoUsuario(senhaDoUsuario);
		
		req.setAttribute("nomeDoUsuario", nomeDoUsuario);
		
		if (StringUtils.isEmpty(usuarioDTO.getNomeDoUsuario()))
			throw new RuntimeException("Nome do usuário dever ser informado!");
		
		if (!usuarioDTO.getEmailDoUsuario().contains("@"))
			throw new RuntimeException("E-mail do usuário inválido!");
		
		LocalDate.parse(usuarioDTO.getDataNascimento(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		usuarioBusiness.salvarUsuario(usuarioDTO);
		
        req.getRequestDispatcher("jsp/usuario-cadastrado-com-sucesso.jsp").forward(req, resp);
	}
	
	
}
