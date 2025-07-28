package dev.gildeonbs.champifs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

// Classe que representa a chave primária composta da entidade GrupoEquipeEntity.
// Essa classe é marcada com @Embeddable, o que indica ao JPA que ela pode ser incorporada em outras entidades.
// Não é uma entidade independente no banco, mas sim um "componente" que será embutido na entidade principal.
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
