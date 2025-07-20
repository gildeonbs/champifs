package dev.gildeonbs.champifs.dto;

import dev.gildeonbs.champifs.entities.EsporteEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EsporteMinDTO {

    private Long id;
    private String nome;

    public EsporteMinDTO(EsporteEntity esporte) {
        this.id = esporte.getId();
        this.nome = esporte.getNome();
    }

}
