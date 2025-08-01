package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.CoordenadorEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class CoordenadorDTO {

    private Long id;
    private String nome;
    private String matricula;
    private String email;
    private String senha;

    public CoordenadorDTO(CoordenadorEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
