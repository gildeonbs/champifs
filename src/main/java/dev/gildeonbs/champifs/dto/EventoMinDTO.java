package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.EventoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EventoMinDTO {

    private Long id;
    private String nome;

    public EventoMinDTO(EventoEntity evento) {
        this.id = evento.getId();
        this.nome = evento.getNome();
    }
}
