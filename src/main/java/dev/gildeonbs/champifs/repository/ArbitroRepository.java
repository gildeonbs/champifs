package dev.gildeonbs.champifs.repository;

import dev.gildeonbs.champifs.entities.ArbitroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArbitroRepository extends JpaRepository<ArbitroEntity, Long> {

    boolean existsByMatricula(String matricula);
}
