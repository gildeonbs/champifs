package dev.gildeonbs.champifs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "evt_evento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EventoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento", nullable = false)
    @EqualsAndHashCode.Include
    private long id;

    @Column(name = "nome_evento", length = 100, nullable = false)
    private String nome;

    @Column(name = "nivel_evento", length = 20, nullable = false)
    private String nivel;

    @Column(name = "ano_evento", nullable = false)
    private Integer ano;

    @Column(name = "semestre_evento", nullable = false)
    private Integer semestre;

    @OneToMany(mappedBy = "evento", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<JogoEntity> jogos = new ArrayList<>();

    @OneToMany(mappedBy = "evento", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<EquipeEntity> equipes = new ArrayList<>();

    @OneToMany(mappedBy = "evento", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<GrupoEntity> grupos = new ArrayList<>();


}
