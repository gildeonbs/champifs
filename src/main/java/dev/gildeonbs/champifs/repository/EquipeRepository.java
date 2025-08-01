package dev.gildeonbs.champifs.repository;

import dev.gildeonbs.champifs.entities.EquipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<EquipeEntity, Long> {
    boolean existsByCurso_IdAndEsporte_IdAndEvento_Id(Long cursoId, Long esporteId, Long eventoId);
}
