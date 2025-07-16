package dev.gildeonbs.champifs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cmp_campus")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CampusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_campus", nullable = false)
    private Long id;

    @Column(name = "nome_campus", length = 100, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "campus", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<CursoEntity> cursos = new ArrayList<>();

}
