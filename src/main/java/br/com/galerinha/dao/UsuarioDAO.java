package br.com.galerinha.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import br.com.galerinha.dto.UsuarioDTO;
import br.com.galerinha.entity.UsuarioEntity;
import br.com.galerinha.util.BancoDeDadosUtil;

public class UsuarioDAO {
	
private BancoDeDadosUtil bancoDeDadosUtil = new BancoDeDadosUtil();
	
	public void salvarUsuario(UsuarioEntity usuario) {
		try {
			Connection connection = bancoDeDadosUtil.pegarConexaoDoBancoDeDados();
			String sql = "insert into galerinha.Usuario (nome, email, senha, dt_nasc, dthr_criacao)"
					+ "values (?, ?, ?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getSenha());
			stmt.setDate(4, Date.valueOf(usuario.getDtNasc()));
			stmt.setDate(5, Date.valueOf(LocalDate.now()));
			
			stmt.execute();
			bancoDeDadosUtil.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<UsuarioDTO> consultarTodosUsuario() {
		Connection connection = bancoDeDadosUtil.pegarConexaoDoBancoDeDados();
		//TODO código
		bancoDeDadosUtil.close();
		return null;
	}
	
	public UsuarioDTO consultarUsuarioPorId(long id) {
		Connection connection = bancoDeDadosUtil.pegarConexaoDoBancoDeDados();
		//TODO código
		bancoDeDadosUtil.close();
		return null;
	}
	
}
