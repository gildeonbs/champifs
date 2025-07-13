package dev.gildeonbs.champifs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cmp_curso")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_curso", nullable = false)
    private long id;

    @Column(name = "nome_curso", length = 100, nullable = false)
    private String nome;

    @Column(name = "nivel_curso", length = 20, nullable = false)
    private String nivel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_coordenador_fk", nullable = false)
    private CoordenadorEntity coordenador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_campus_fk", nullable = false)
    private CampusEntity campus;

    @OneToMany(mappedBy = "curso", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<EquipeEntity> equipes = new ArrayList<>();

}
