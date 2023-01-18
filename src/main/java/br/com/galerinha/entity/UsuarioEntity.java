package br.com.galerinha.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UsuarioEntity {
	
	private Integer id;
	private String nome;
	private LocalDate dtNasc;
	private String email;
	private String senha;
	private LocalDateTime dthrCriacao;
	private LocalDateTime dthrUltimoAcesso;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(LocalDate dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public LocalDateTime getDthrCriacao() {
		return dthrCriacao;
	}
	public void setDthrCriacao(LocalDateTime dthrCriacao) {
		this.dthrCriacao = dthrCriacao;
	}
	public LocalDateTime getDthrUltimoAcesso() {
		return dthrUltimoAcesso;
	}
	public void setDthrUltimoAcesso(LocalDateTime dthrUltimoAcesso) {
		this.dthrUltimoAcesso = dthrUltimoAcesso;
	}
	
}
