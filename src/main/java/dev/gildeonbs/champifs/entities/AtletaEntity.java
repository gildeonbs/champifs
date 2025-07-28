package dev.gildeonbs.champifs.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usr_atleta")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class AtletaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atleta")
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "nome_comp_atleta", length = 100, nullable = false)
    private String nomeCompleto;

    @Column(name = "apelido_atleta", length = 30, nullable = false)
    private String apelido;

    @Column(name = "matricula_atleta", length = 15, nullable = false)
    private String matricula;

    @Column(name = "telefone_atleta", length = 20, nullable = false)
    private String telefone;

    @Column(name = "senha_hash", length = 255, nullable = false)
    private String senhaHash;

    @Column(name = "tipo", length = 10, nullable = false)
    private String tipo;

    // Relacionamento muitos-para-um entre esta entidade e EquipeEntity.
    // Muitos objetos desta entidade podem estar associados a uma única equipe.
    // Este é o lado "dono" da relação e conterá a chave estrangeira no banco de dados (equipe_id).
    // O carregamento da equipe é feito de forma preguiçosa (LAZY), ou seja, só é feito quando o atributo for acessado.
    @ManyToOne (fetch = FetchType.LAZY) // lado "dono"
    @JoinColumn(name = "id_equipe_fk")
    private EquipeEntity equipe;
}

