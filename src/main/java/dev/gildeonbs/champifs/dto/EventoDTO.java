package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.EventoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class EventoDTO {

    private Long id;
    private String nome;
    private String nivel;
    private Integer ano;
    private Integer semestre;

    private List<EquipeMinDTO> equipes;
    private List<GrupoMinDTO> grupos;
    private List<JogoMinDTO> jogos;

    public EventoDTO(EventoEntity entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.nivel = entity.getNivel();
        this.ano = entity.getAno();
        this.semestre = entity.getSemestre();

        equipes = entity.getEquipes().stream().map(EquipeMinDTO::new).collect(Collectors.toList());
        grupos = entity.getGrupos().stream().map(GrupoMinDTO::new).collect(Collectors.toList());
        jogos = entity.getJogos().stream().map(JogoMinDTO::new).collect(Collectors.toList());

    }

}
