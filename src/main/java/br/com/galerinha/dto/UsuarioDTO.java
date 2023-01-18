package br.com.galerinha.dto;

public class UsuarioDTO {
	
	private String nomeDoUsuario;
	private String dataNascimento;
	private String emailDoUsuario;
	private String senhaDoUsuario;
	
	public String getNomeDoUsuario() {
		return nomeDoUsuario;
	}
	public void setNomeDoUsuario(String nomeDoUsuario) {
		this.nomeDoUsuario = nomeDoUsuario;
	}
	public String getEmailDoUsuario() {
		return emailDoUsuario;
	}
	public void setEmailDoUsuario(String emailDoUsuario) {
		this.emailDoUsuario = emailDoUsuario;
	}
	public String getSenhaDoUsuario() {
		return senhaDoUsuario;
	}
	public void setSenhaDoUsuario(String senhaDoUsuario) {
		this.senhaDoUsuario = senhaDoUsuario;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
