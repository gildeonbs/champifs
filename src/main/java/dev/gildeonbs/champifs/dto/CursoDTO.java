package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.CampusEntity;
import dev.gildeonbs.champifs.entities.CoordenadorEntity;
import dev.gildeonbs.champifs.entities.CursoEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class CursoDTO {

    private Long id;
    private String nome;
    private String nivel;
    private CoordenadorEntity coordenador;
    private CampusEntity campus;

    public CursoDTO() {}

    public CursoDTO(CursoEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
