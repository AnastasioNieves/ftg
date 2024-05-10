package com.tmpro.repository;

import com.tmpro.entity.SesionEntrenamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SesionEntrenamientoRepository extends JpaRepository<SesionEntrenamiento, Long> {


}
