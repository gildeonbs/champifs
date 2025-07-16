package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.ArbitroEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class ArbitroDTO {

    private Long id;
    private String nome;
    private String matricula;
    //private String senha;

    public ArbitroDTO() {}

    public ArbitroDTO(ArbitroEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
