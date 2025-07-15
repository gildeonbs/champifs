package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.EventoEntity;
import dev.gildeonbs.champifs.entities.GrupoEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class GrupoDTO {

    private long id;
    private String codigo;
    private EventoEntity evento;

    public GrupoDTO() {}

    public GrupoDTO(GrupoEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
