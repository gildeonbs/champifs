package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.CursoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CursoMinDTO {

    private Long id;
    private String nome;
    private String nivel;

    public CursoMinDTO(CursoEntity curso) {
        this.id = curso.getId();
        this.nome = curso.getNome();
        this.nivel = curso.getNivel();
    }

}
