package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.CursoEntity;
import dev.gildeonbs.champifs.entities.EquipeEntity;
import dev.gildeonbs.champifs.entities.EsporteEntity;
import dev.gildeonbs.champifs.entities.EventoEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class EquipeDTO {

    private Long id;
    private String nome;
    private CursoEntity curso;
    private EsporteEntity esporte;
    private EventoEntity evento;

    public EquipeDTO() {}

    public EquipeDTO(EquipeEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
