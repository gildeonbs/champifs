package dev.gildeonbs.champifs.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "grp_equipe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GrupoEquipeEntity {

    @EmbeddedId
    @EqualsAndHashCode.Include
    private GrupoEquipeEntityPK id = new GrupoEquipeEntityPK();

}
