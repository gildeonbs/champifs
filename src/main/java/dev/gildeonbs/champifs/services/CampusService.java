package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.CampusDTO;
import dev.gildeonbs.champifs.entities.CampusEntity;
import dev.gildeonbs.champifs.repository.CampusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CampusService {

    @Autowired
    private CampusRepository campusRepository;

    @Transactional(readOnly = true)
    public List<CampusDTO> findAll() {
        List<CampusEntity> result = campusRepository.findAll();
        List<CampusDTO> campusDTOs = result.stream().map(x -> new CampusDTO(x)).toList();
        return campusDTOs;
    }

    @Transactional
    public CampusDTO criar(CampusDTO dto) {
        CampusEntity entity = new CampusEntity();
        entity.setNome(dto.getNome());
        return new CampusDTO(campusRepository.save(entity));
    }
}
