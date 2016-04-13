package com.workshop.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>{

}
