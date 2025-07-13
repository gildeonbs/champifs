package dev.gildeonbs.champifs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "grp_grupo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GrupoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupo", nullable = false)
    @EqualsAndHashCode.Include
    private long id;

    @Column(name = "codigo_grupo", length = 10, nullable = false)
    private String codigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_evento_fk", nullable = false)
    private EventoEntity evento;

    @OneToMany(mappedBy = "grupo", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<JogoEntity> jogos = new ArrayList<>();

}
