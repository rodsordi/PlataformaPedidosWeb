package br.com.galerinha.business;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import br.com.galerinha.dao.UsuarioDAO;
import br.com.galerinha.dto.UsuarioDTO;
import br.com.galerinha.entity.UsuarioEntity;

public class UsuarioBusiness {
	
	private UsuarioDAO dao = new UsuarioDAO();
	
	public void salvarUsuario(UsuarioEntity usuarioEntity) {
		long diferencaIdade = ChronoUnit.YEARS.between(usuarioEntity.getDtNasc(), LocalDate.now());
		if (diferencaIdade < 18)
			throw new RuntimeException("Usuário deve ter mais de 18 anos!");
		
		dao.salvarUsuario(usuarioEntity);
	}
	
}
