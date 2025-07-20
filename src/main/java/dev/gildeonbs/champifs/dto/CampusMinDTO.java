package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.CampusEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CampusMinDTO {

    private Long id;
    private String nome;

    public CampusMinDTO(CampusEntity entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
    }

}
