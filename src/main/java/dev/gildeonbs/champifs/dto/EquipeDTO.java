package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.EquipeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class EquipeDTO {

    private Long id;
    private String nome;
    private CursoMinDTO curso;
    private EsporteMinDTO esporte;
    private EventoMinDTO evento;

    private List<AtletaMinDTO> atletas = new ArrayList<>();
    private List<JogoMinDTO> jogosA = new ArrayList<>();
    private List<JogoMinDTO> jogosB = new ArrayList<>();

    public EquipeDTO(EquipeEntity entity) {
        id = entity.getId();
        nome = entity.getNome();
        if (entity.getCurso() != null) {
            curso = new CursoMinDTO(entity.getCurso());
        }
        if (entity.getEsporte() != null) {
            esporte = new EsporteMinDTO(entity.getEsporte());
        }
        if (entity.getEvento() != null) {
            evento = new EventoMinDTO(entity.getEvento());
        }

        atletas = entity.getAtletas().stream().map(AtletaMinDTO::new).collect(Collectors.toList());
        jogosA = entity.getEquipesA().stream().map(JogoMinDTO::new).collect(Collectors.toList());
        jogosB = entity.getEquipesB().stream().map(JogoMinDTO::new).collect(Collectors.toList());


    }
}
