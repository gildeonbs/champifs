package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.CoordenadorEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CoordenadorMinDTO {

    private Long id;
    private String nome;
    private String matricula;
    private String email;

    public CoordenadorMinDTO(CoordenadorEntity coordenador) {
        this.id = coordenador.getId();
        this.nome = coordenador.getNome();
        this.matricula = coordenador.getMatricula();
        this.email = coordenador.getEmail();
    }

}
