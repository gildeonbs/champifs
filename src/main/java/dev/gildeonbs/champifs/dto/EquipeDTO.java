package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.CursoEntity;
import dev.gildeonbs.champifs.entities.EquipeEntity;
import dev.gildeonbs.champifs.entities.EsporteEntity;
import dev.gildeonbs.champifs.entities.EventoEntity;
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
    private CursoEntity curso;
    private EsporteEntity esporte;
    private EventoEntity evento;

    private List<AtletaMinDTO> atletas = new ArrayList<>();

    public EquipeDTO(EquipeEntity entity) {
        id = entity.getId();
        nome = entity.getNome();
        curso = entity.getCurso();
        esporte = entity.getEsporte();
        evento = entity.getEvento();

        atletas = entity.getAtletas().stream().map(AtletaMinDTO::new).collect(Collectors.toList());

    }
}
