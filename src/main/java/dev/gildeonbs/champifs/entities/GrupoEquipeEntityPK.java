package dev.gildeonbs.champifs.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Objects;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GrupoEquipeEntityPK {

    @ManyToOne
    @JoinColumn(name = "id_grupo_pk_fk")
    @EqualsAndHashCode.Include
    private GrupoEntity grupo;

    @ManyToOne
    @JoinColumn(name = "id_equipe_pk_fk")
    @EqualsAndHashCode.Include
    private EquipeEntity equipe;

}
