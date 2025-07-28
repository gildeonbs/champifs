package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.CursoDTO;
import dev.gildeonbs.champifs.entities.CampusEntity;
import dev.gildeonbs.champifs.entities.CoordenadorEntity;
import dev.gildeonbs.champifs.entities.CursoEntity;
import dev.gildeonbs.champifs.repository.CampusRepository;
import dev.gildeonbs.champifs.repository.CoordenadorRepository;
import dev.gildeonbs.champifs.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private CoordenadorRepository coordenadorRepository;
    @Autowired
    private CampusRepository campusRepository;

    @Transactional(readOnly = true)
    public List<CursoDTO> findAll() {
        List<CursoEntity> result = cursoRepository.findAll();
        List<CursoDTO> cursoDTOS = result.stream().map(x -> new CursoDTO(x)).toList();
        return cursoDTOS;
    }

    @Transactional
    public CursoDTO criar(CursoDTO dto) {
        CursoEntity entity = new CursoEntity();
        entity.setNome(dto.getNome());
        entity.setNivel(dto.getNivel());

        if (dto.getCoordenador().getId() != null) {
            CoordenadorEntity coordenador = coordenadorRepository.findById(dto.getCoordenador().getId())
                    .orElseThrow(() -> new IllegalStateException("Coordenador não encontrado"));
            entity.setCoordenador(coordenador);
        }
        if (dto.getCampus().getId() != null) {
            CampusEntity campus = campusRepository.findById(dto.getCampus().getId())
                    .orElseThrow(() -> new IllegalStateException("Campus não encontrado"));
            entity.setCampus(campus);
        }

        entity =  cursoRepository.save(entity);
        return new CursoDTO(entity);

    }
}
