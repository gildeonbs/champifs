package dev.gildeonbs.champifs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "eqp_equipe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EquipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipe", nullable = false)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "nome_equipe", length = 50, nullable = false)
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_curso_fk", nullable = false)
    private CursoEntity curso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_esporte_fk", nullable = false)
    private EsporteEntity esporte;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_evento_fk", nullable = false)
    private EventoEntity evento;

    @OneToMany(mappedBy = "equipe", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<AtletaEntity> atletas = new ArrayList<>();

    /*
    Se precisar fazer buscas reversas como equipe.getJogosComoEquipeA()
    @OneToMany(mappedBy = "equipeA")
    @JsonIgnore
    private List<JogoEntity> jogosComoEquipeA = new ArrayList<>();

    @OneToMany(mappedBy = "equipeB")
    @JsonIgnore
    private List<JogoEntity> jogosComoEquipeB = new ArrayList<>();
    */

}
