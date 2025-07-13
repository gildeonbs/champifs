package dev.gildeonbs.champifs.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "jgs_jogo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class JogoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_jogo", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_evento_fk", nullable = false)
    private EventoEntity evento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_grupo_fk")
    private GrupoEntity grupo;

    @Column(name = "fase_jogo", length = 20, nullable = false)
    private String fase;

    @Column(name = "data_jogo", nullable = false)
    private LocalDate data;

    @Column(name = "hora_jogo", nullable = false)
    private LocalTime hora;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_equipe_a_fk", nullable = false)
    private EquipeEntity equipeA;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_equipe_b_fk", nullable = false)
    private EquipeEntity equipeB;

    @Column(name = "placar_a")
    private Integer placarA;

    @Column(name = "placar_b")
    private Integer placarB;

    @Column(name = "wo_equipe_a")
    private Boolean woEquipeA;

    @Column(name = "wo_equipe_b")
    private Boolean woEquipeB;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_arbrito_fk", nullable = false)
    private ArbitroEntity arbitro;
}
