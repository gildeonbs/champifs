package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.EventoEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class EventoDTO {

    private long id;
    private String nome;
    private String nivel;
    private Integer ano;
    private Integer semestre;

    public EventoDTO() {}

    public EventoDTO(EventoEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
