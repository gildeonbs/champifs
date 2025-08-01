package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.EsporteEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class EsporteDTO {

    private Long id;
    private String nome;
    private Integer minJogadores;
    private Integer maxJogadores;

    public EsporteDTO(EsporteEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
