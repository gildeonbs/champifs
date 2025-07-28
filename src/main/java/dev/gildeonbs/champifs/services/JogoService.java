package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.JogoDTO;
import dev.gildeonbs.champifs.entities.JogoEntity;
import dev.gildeonbs.champifs.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    @Transactional(readOnly = true)
    public List<JogoDTO> findAll() {
        List<JogoEntity> result = jogoRepository.findAll();
        List<JogoDTO> jogoDTOS = result.stream().map(x -> new JogoDTO(x)).toList();
        return jogoDTOS;
    }

    @Transactional
    public void registrarResultado(Long idJogo, JogoDTO dto) {
        JogoEntity jogo = jogoRepository.findById(idJogo)
                .orElseThrow(() -> new RuntimeException("Jogo no encontrado"));

        jogo.setPlacarA(dto.getPlacarA());
        jogo.setPlacarB(dto.getPlacarB());
        jogo.setWoEquipeA(dto.getWoEquipeA());
        jogo.setWoEquipeB(dto.getWoEquipeB());

        jogoRepository.save(jogo);
    }

}
