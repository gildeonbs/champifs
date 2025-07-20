package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.CursoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CursoDTO {

    private Long id;
    private String nome;
    private String nivel;
    private CoordenadorMinDTO coordenador;
    private CampusMinDTO campus;

    public CursoDTO(CursoEntity entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.nivel = entity.getNivel();
        if (entity.getCoordenador() != null) {
            this.coordenador = new CoordenadorMinDTO(entity.getCoordenador());
        }
        if (entity.getCampus() != null) {
            this.campus = new CampusMinDTO(entity.getCampus());
        }

    }

}
