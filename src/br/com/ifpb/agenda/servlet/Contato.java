package br.com.ifpb.agenda.servlet;

import java.util.Date;

public class Contato {
	private Integer id;
	private	String nome;
	private String num;
	private Date dataCriacao;
	
	public Contato() {
		id = 0;
		nome = "Sem nome";
		num = "0000000";
		this.dataCriacao = new Date();
	}
	
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
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCadastro) {
		this.dataCriacao = dataCadastro;
	}
}
