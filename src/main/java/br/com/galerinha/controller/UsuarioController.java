package br.com.galerinha.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import br.com.galerinha.dao.UsuarioDAO;
import br.com.galerinha.model.Usuario;

public class UsuarioController {
	
	private UsuarioDAO dao = new UsuarioDAO();
	
	public void salvarUsuario(Usuario usuario) {
		if (StringUtils.isEmpty(usuario.getNomeDoUsuario()))
			throw new RuntimeException("Nome do usuário dever ser informado!");
		
		if (!usuario.getEmailDoUsuario().contains("@"))
			throw new RuntimeException("E-mail do usuário inválido!");
		
		dao.salvarUsuario(usuario);
	}
	
	public List<Usuario> consultarTodosUsuario() {
		return dao.consultarTodosUsuario();
	}
	
	public Usuario consultarUsuarioPorId(long id) {
		return dao.consultarUsuarioPorId(id);
	}

}
