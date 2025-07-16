package dev.gildeonbs.champifs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cmp_esporte")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EsporteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_esporte", nullable = false)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "nome_esporte", length = 50, nullable = false)
    private String nome;

    @Column(name = "min_jogadores", nullable = false)
    private Integer minJogadores;

    @Column(name = "max_jogadores", nullable = false)
    private Integer maxJogadores;

    @OneToMany(mappedBy = "esporte", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<EquipeEntity> equipes = new ArrayList<>();

}
