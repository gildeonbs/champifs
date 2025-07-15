package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.AtletaEntity;
import dev.gildeonbs.champifs.entities.EquipeEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class AtletaDTO {

    private Long id;
    private String nomeCompleto;
    private String apelido;
    private String matricula;
    private String telefone;
    //private String senhaHash;
    private String tipo;
    private EquipeEntity equipe;

    public AtletaDTO() {}

    public AtletaDTO(AtletaEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
