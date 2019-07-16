package com.eventoApp.eventoApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoApp.eventoApp.models.Evento;

public interface EventosRepository extends CrudRepository<Evento, String> {

	Evento findByCodigo(long codigo);
	
}
