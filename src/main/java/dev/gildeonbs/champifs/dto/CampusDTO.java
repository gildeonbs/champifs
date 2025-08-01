package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.CampusEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class CampusDTO {

    private Long id;
    private String nome;

    public CampusDTO(CampusEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
