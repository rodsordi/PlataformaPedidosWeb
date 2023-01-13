package br.com.galerinha.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.galerinha.model.Usuario;
import br.com.galerinha.util.BancoDeDadosUtil;

public class UsuarioDAO {
	
private BancoDeDadosUtil bancoDeDadosUtil = new BancoDeDadosUtil();
	
	public void salvarUsuario(Usuario usuario) {
		try {
			Connection connection = bancoDeDadosUtil.pegarConexaoDoBancoDeDados();
			Statement stmt = connection.createStatement();
			stmt.executeUpdate("insert into galerinha.Usuario (nome, email, senha, dthr_criacao) " + "values ('"
					+ usuario.getNomeDoUsuario() + "', '" + usuario.getEmailDoUsuario() + "', '"
					+ usuario.getSenhaDoUsuario() + "', now())");
			bancoDeDadosUtil.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Usuario> consultarTodosUsuario() {
		Connection connection = bancoDeDadosUtil.pegarConexaoDoBancoDeDados();
		//TODO código
		bancoDeDadosUtil.close();
		return null;
	}
	
	public Usuario consultarUsuarioPorId(long id) {
		Connection connection = bancoDeDadosUtil.pegarConexaoDoBancoDeDados();
		//TODO código
		bancoDeDadosUtil.close();
		return null;
	}
	
}
