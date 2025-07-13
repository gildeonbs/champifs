package dev.gildeonbs.champifs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;


@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GrupoEquipeEntityPK {

    @Column(name = "id_grupo_pk_fk")
    private Long idGrupoFk;

    @Column(name = "id_equipe_pk_fk")
    private Long idEquipeFk;

}
