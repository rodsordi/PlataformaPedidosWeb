package br.com.galerinha.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.StringUtils;

import br.com.galerinha.business.UsuarioBusiness;
import br.com.galerinha.dto.UsuarioDTO;
import br.com.galerinha.entity.UsuarioEntity;


public class UsuarioController {
	
	private UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
	
	public void salvarUsuario(UsuarioDTO usuarioDTO) {
		if (StringUtils.isEmpty(usuarioDTO.getNomeDoUsuario()))
			throw new RuntimeException("Nome do usuário dever ser informado!");
		
		if (!usuarioDTO.getEmailDoUsuario().contains("@"))
			throw new RuntimeException("E-mail do usuário inválido!");
		
		LocalDate.parse(usuarioDTO.getDataNascimento(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		LocalDate dataDeNascimento = LocalDate.parse(usuarioDTO.getDataNascimento(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		UsuarioEntity usuarioEntity = new UsuarioEntity();
		usuarioEntity.setNome(usuarioDTO.getNomeDoUsuario());
		usuarioEntity.setEmail(usuarioDTO.getEmailDoUsuario());
		usuarioEntity.setSenha(usuarioDTO.getSenhaDoUsuario());
		usuarioEntity.setDtNasc(dataDeNascimento);
		
		usuarioBusiness.salvarUsuario(usuarioEntity);
	}
}
