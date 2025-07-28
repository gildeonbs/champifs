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

    // Define o identificador (ID) da entidade como sendo composto, ou seja, formado por mais de um campo.
    // Usa uma instância da classe GrupoEquipeEntityPK, que encapsula os campos da chave composta.
    // Essa abordagem é útil quando a tabela possui uma chave primária baseada em múltiplas colunas.
    // A instância do ID é "embutida" na entidade principal, e seus campos são tratados como parte da própria tabela.
    // A JPA usa os valores desse ID embutido como base para persistência, buscas, comparações, etc.
    @EmbeddedId
    @EqualsAndHashCode.Include
    private GrupoEquipeEntityPK id = new GrupoEquipeEntityPK();

    // RELACIONAMENTO 1: com GrupoEntity
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idGrupoFk") // Mapeia o FK 'grupo' para o atributo 'idGrupoFk' da classe PK
    @JoinColumn(name = "id_grupo_fk")
    private GrupoEntity grupo;

    // RELACIONAMENTO 2: com EquipeEntity
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idEquipeFk") // Mapeia o FK 'equipe' para o atributo 'idEquipeFk' da classe PK
    @JoinColumn(name = "id_equipe_fk")
    private EquipeEntity equipe;

}
