package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.JogoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@NoArgsConstructor
public class JogoMinDTO {

    private Long id;
    private LocalDate data;
    private LocalTime hora;

    public JogoMinDTO(JogoEntity jogo) {
        this.id = jogo.getId();
        this.data = jogo.getData();
        this.hora = jogo.getHora();
    }

}
