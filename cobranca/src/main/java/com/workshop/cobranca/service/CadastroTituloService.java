package com.workshop.cobranca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.workshop.cobranca.model.StatusTitulo;
import com.workshop.cobranca.model.Titulo;
import com.workshop.cobranca.repository.Titulos;

@Service
public class CadastroTituloService {

	@Autowired
	private Titulos titulos;

	public void salvar(Titulo titulo) {
		try {
			titulos.save(titulo);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato de data inválido");
		}
	}

	public void deletar(Long id) {
		titulos.delete(id);
	}

	public String receber(Long id) {
		Titulo titulo = titulos.findOne(id);
		titulo.setStatus(StatusTitulo.RECEBIDO);
		titulos.save(titulo);
		return titulo.getStatus().getDescricao();
	}
}