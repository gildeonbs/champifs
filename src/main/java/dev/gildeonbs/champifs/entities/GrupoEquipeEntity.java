package dev.gildeonbs.champifs.entities;

import jakarta.persistence.*;
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

    // RELACIONAMENTO 1: com GrupoEntity
    @ManyToOne
    @MapsId("idGrupoFk") // Mapeia o FK 'grupo' para o atributo 'idGrupoFk' da classe PK
    @JoinColumn(name = "id_grupo_fk")
    private GrupoEntity grupo;

    // RELACIONAMENTO 2: com EquipeEntity
    @ManyToOne
    @MapsId("idEquipeFk") // Mapeia o FK 'equipe' para o atributo 'idEquipeFk' da classe PK
    @JoinColumn(name = "id_equipe_fk")
    private EquipeEntity equipe;

}
