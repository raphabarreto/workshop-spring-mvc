package com.workshop.cobranca.model;

public enum StatusTitulo {

	PENDENTE("Pendente"),
	RECEBIBO("Recebido");
	
	private String descricao;

	StatusTitulo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}