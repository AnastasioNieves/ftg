package com.tmpro.repository;

import com.tmpro.entity.Alineacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlineacionRepository extends JpaRepository<Alineacion, Long> {

}
