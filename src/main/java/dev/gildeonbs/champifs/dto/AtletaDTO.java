package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.AtletaEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AtletaDTO {

    private Long id;
    private String nomeCompleto;
    private String apelido;
    private String matricula;
    private String telefone;
    private String senhaHash;
    private String tipo;
    private EquipeMinDTO equipe;

    public AtletaDTO(AtletaEntity entity) {
        id = entity.getId();
        nomeCompleto = entity.getNomeCompleto();
        apelido = entity.getApelido();
        matricula = entity.getMatricula();
        telefone = entity.getTelefone();
        senhaHash = entity.getSenhaHash();
        tipo = entity.getTipo();
        if (entity.getEquipe() != null) {
            equipe = new EquipeMinDTO(entity.getEquipe());
        }
    }
}
