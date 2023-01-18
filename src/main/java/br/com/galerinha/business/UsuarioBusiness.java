package br.com.galerinha.business;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import br.com.galerinha.dao.UsuarioDAO;
import br.com.galerinha.dto.UsuarioDTO;
import br.com.galerinha.entity.UsuarioEntity;

public class UsuarioBusiness {
	
	private UsuarioDAO dao = new UsuarioDAO();
	
	public void salvarUsuario(UsuarioDTO usuarioDTO) {
		
		LocalDate dataDeNascimento = LocalDate.parse(usuarioDTO.getDataNascimento(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		long diferencaIdade = ChronoUnit.YEARS.between(dataDeNascimento, LocalDate.now());
		if (diferencaIdade < 18)
			throw new RuntimeException("Usuário deve ter mais de 18 anos!");
		
		UsuarioEntity usuarioEntity = new UsuarioEntity();
		usuarioEntity.setNome(usuarioDTO.getNomeDoUsuario());
		usuarioEntity.setEmail(usuarioDTO.getEmailDoUsuario());
		usuarioEntity.setSenha(usuarioDTO.getSenhaDoUsuario());
		usuarioEntity.setDtNasc(dataDeNascimento);
		
		dao.salvarUsuario(usuarioEntity);
	}
	
}
