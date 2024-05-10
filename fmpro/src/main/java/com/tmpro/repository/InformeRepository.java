package com.tmpro.repository;

import com.tmpro.entity.Informe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformeRepository extends JpaRepository<Informe, Long> {

    // Métodos adicionales específicos de la entidad Informe (si es necesario)
}

