package dev.gildeonbs.champifs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usr_coord")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CoordenadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_coordenador")
    private Long id;

    @Column(name = "nome_coord", length = 100, nullable = false)
    private String nome;

    @Column(name = "matricula_coord", length = 15, nullable = false)
    private String matricula;

    @Column(name = "email_coord", length = 100, nullable = false)
    private String email;

    @Column(name = "senha_hash", length = 255, nullable = false)
    private String senha;

    @OneToMany(mappedBy = "coordenador", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<CursoEntity> cursos = new ArrayList<>();

}
