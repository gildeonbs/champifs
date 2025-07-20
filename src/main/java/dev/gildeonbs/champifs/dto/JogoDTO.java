package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.JogoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
public class JogoDTO {

    private Long id;
    private String fase;
    private LocalDate data;
    private LocalTime hora;
    private Integer placarA;
    private Integer placarB;
    private Boolean woEquipeA;
    private Boolean woEquipeB;

    private EventoMinDTO evento;
    private GrupoMinDTO grupo;
    private EquipeMinDTO equipeA;
    private EquipeMinDTO equipeB;
    private ArbitroMinDTO arbitro;

    public JogoDTO(JogoEntity entity) {
        this.id = entity.getId();
        this.fase = entity.getFase();
        this.data = entity.getData();
        this.hora = entity.getHora();
        this.placarA = entity.getPlacarA();
        this.placarB = entity.getPlacarB();
        this.woEquipeA = entity.getWoEquipeA();
        this.woEquipeB = entity.getWoEquipeB();

        if (entity.getEvento() != null) {
            this.evento = new EventoMinDTO(entity.getEvento());
        }
        if (entity.getGrupo() != null) {
            this.grupo = new GrupoMinDTO(entity.getGrupo());
        }
        if (entity.getEquipeA() != null) {
            this.equipeA = new EquipeMinDTO(entity.getEquipeA());
        }
        if (entity.getEquipeB() != null) {
            this.equipeB = new EquipeMinDTO(entity.getEquipeB());
        }
        if (entity.getArbitro() != null) {
            this.arbitro = new ArbitroMinDTO(entity.getArbitro());
        }

    }

}
