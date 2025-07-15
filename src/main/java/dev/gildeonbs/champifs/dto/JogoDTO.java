package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class JogoDTO {

    private Long id;
    private EventoEntity evento;
    private GrupoEntity grupo;
    private String fase;
    private LocalDate data;
    private LocalTime hora;
    private EquipeEntity equipeA;
    private EquipeEntity equipeB;
    private Integer placarA;
    private Integer placarB;
    private Boolean woEquipeA;
    private Boolean woEquipeB;
    private ArbitroEntity arbitro;

    public JogoDTO() {}

    public JogoDTO(JogoEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
