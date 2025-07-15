package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.JogoDTO;
import dev.gildeonbs.champifs.entities.JogoEntity;
import dev.gildeonbs.champifs.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    @Transactional(readOnly = true)
    public List<JogoDTO> findAll() {
        List<JogoEntity> result = jogoRepository.findAll();
        List<JogoDTO> jogoDTOS = result.stream().map(x -> new JogoDTO(x)).toList();
        return jogoDTOS;
    }

}
