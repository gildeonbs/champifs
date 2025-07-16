package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.ArbitroEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class ArbitroMinDTO {

    private Long id;
    private String nome;
    private String matricula;

    public ArbitroMinDTO(ArbitroEntity entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.matricula = entity.getMatricula();
    }

}
