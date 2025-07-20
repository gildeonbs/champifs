package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.GrupoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GrupoMinDTO {

    private Long id;
    private String codigo;

    public GrupoMinDTO(GrupoEntity entity) {
        this.id = entity.getId();
        this.codigo = entity.getCodigo();
    }

}
