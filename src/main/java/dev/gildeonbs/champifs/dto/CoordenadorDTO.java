package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.CoordenadorEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class CoordenadorDTO {

    private long id;
    private String nome;
    private String matricula;
    private String email;
    //private String senha;

    public CoordenadorDTO() {}

    public CoordenadorDTO(CoordenadorEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
