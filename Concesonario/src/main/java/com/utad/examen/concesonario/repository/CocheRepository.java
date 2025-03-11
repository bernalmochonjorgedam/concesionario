package com.utad.examen.concesonario.repository;

import com.utad.examen.concesonario.models.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {
}
