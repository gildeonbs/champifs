package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.CampusEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class CampusDTO {

    private long id;
    private String nome;

    public CampusDTO() {}

    public CampusDTO(CampusEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
