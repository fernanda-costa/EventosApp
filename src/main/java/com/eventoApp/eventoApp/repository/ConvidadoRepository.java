package com.eventoApp.eventoApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoApp.eventoApp.models.Convidado;
import com.eventoApp.eventoApp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{

	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
	
}
