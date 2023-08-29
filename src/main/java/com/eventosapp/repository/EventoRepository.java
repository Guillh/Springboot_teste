package com.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.eventoapp.eventoapp.models.Evento;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento, String> {


}
