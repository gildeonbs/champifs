package dev.gildeonbs.champifs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usr_arbitro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ArbitroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_arbitro")
    private Long id;

    @Column(name = "nome_arbitro", length = 100, nullable = false)
    private String nome;

    @Column(name = "matricula_arbitro", length = 15, nullable = false)
    private String matricula;

    @Column(name = "senha_hash", length = 255, nullable = false)
    private String senha;

    @OneToMany(mappedBy = "arbitro", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<JogoEntity> jogos = new ArrayList<>();

}
