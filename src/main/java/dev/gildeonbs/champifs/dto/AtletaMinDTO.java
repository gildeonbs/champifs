package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.AtletaEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AtletaMinDTO {

    private Long id;
    private String nomeCompleto;
    private String apelido;
    private String matricula;
    private String telefone;
    private String tipo;

    public AtletaMinDTO(AtletaEntity entity) {
        this.id = entity.getId();
        this.nomeCompleto = entity.getNomeCompleto();
        this.apelido = entity.getApelido();
        this.matricula = entity.getMatricula();
        this.telefone = entity.getTelefone();
        this.tipo = entity.getTipo();
    }
}
