package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.GrupoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GrupoDTO {

    private Long id;
    private String codigo;
    private EventoMinDTO evento;

    public GrupoDTO(GrupoEntity entity) {
        this.id = entity.getId();
        this.codigo = entity.getCodigo();
        if (entity.getEvento() != null) {
            this.evento = new EventoMinDTO(entity.getEvento());
        }
    }

}
