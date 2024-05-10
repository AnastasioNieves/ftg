package com.tmpro.repository;

import com.tmpro.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

    // Métodos adicionales específicos de la entidad Evento (si es necesario)
}
