package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.EquipeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EquipeMinDTO {

    private Long id;
    private String nome;

    public EquipeMinDTO(EquipeEntity entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
    }
}