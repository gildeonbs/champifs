-- Inserindo dados na tabela de Campus (tabela pai, sem dependências)
INSERT INTO cmp_campus (nome_campus) VALUES ('Lagarto');
INSERT INTO cmp_campus (nome_campus) VALUES ('Aracaju');
INSERT INTO cmp_campus (nome_campus) VALUES ('Itabaiana');

-- Inserindo dados na tabela de Coordenadores (tabela pai, sem dependências)
INSERT INTO usr_coord (nome_coord, matricula_coord, email_coord, senha_hash) VALUES ('Mariana Costa', 1996234, 'mariana.coord@instituicao.com', '$2y$10$stuvwxyzabcdefghijklmno'); -- Exemplo de hash

-- Inserindo dados na tabela de Cursos (depende de cmp_campus)
-- Assumindo que o id_campus_fk corresponde aos campus inseridos acima (1: Lagarto, 2: Aracaju, 3: Itabaiana)
INSERT INTO cmp_curso (nome_curso, id_coordenador_fk, nivel_curso, id_campus_fk) VALUES ('BSI - Bacharelado em Sistemas de Informação', 1, 'Superior', 1);
INSERT INTO cmp_curso (nome_curso, id_coordenador_fk, nivel_curso, id_campus_fk) VALUES ('Engenharia Elétrica', 1, 'Superior', 2);
INSERT INTO cmp_curso (nome_curso, id_coordenador_fk, nivel_curso, id_campus_fk) VALUES ('Redes', 1, 'Integrado', 1);
INSERT INTO cmp_curso (nome_curso, id_coordenador_fk, nivel_curso, id_campus_fk) VALUES ('Eletromecânica', 1, 'Integrado', 2);
INSERT INTO cmp_curso (nome_curso, id_coordenador_fk, nivel_curso, id_campus_fk) VALUES ('Eletrônica', 1, 'Técnico', 1);
INSERT INTO cmp_curso (nome_curso, id_coordenador_fk, nivel_curso, id_campus_fk) VALUES ('Redes', 1, 'Integrado', 3);

-- Inserindo dados na tabela de Esportes (tabela pai, sem dependências)
INSERT INTO cmp_esporte (nome_esporte, min_jogadores, max_jogadores) VALUES ('Futebol de Campo', 11, 22);
INSERT INTO cmp_esporte (nome_esporte, min_jogadores, max_jogadores) VALUES ('Voleibol', 6, 12);
INSERT INTO cmp_esporte (nome_esporte, min_jogadores, max_jogadores) VALUES ('Futsal', 5, 10);
INSERT INTO cmp_esporte (nome_esporte, min_jogadores, max_jogadores) VALUES ('Basquete', 5, 12);

-- Inserindo dados na tabela de Árbitros (tabela pai, sem dependências)
INSERT INTO usr_arbitro (nome_arbitro, matricula_arbitro, senha_hash) VALUES ('Carlos Pereira', 'ARB1001', '$2y$10$abcdefghijklmnopqrstuv'); -- Exemplo de hash
INSERT INTO usr_arbitro (nome_arbitro, matricula_arbitro, senha_hash) VALUES ('Ana Souza', 'ARB1002', '$2y$10$wxyzabcdefghijklmnopqr'); -- Exemplo de hash

-- Inserindo dados na tabela de Eventos (tabela pai, sem dependências)
INSERT INTO evt_evento (nome_evento, nivel_evento, ano_evento, semestre_evento) VALUES ('Jogos Internos IFS 2025', 'Institucional', 2025, 2);

-- Inserindo dados na tabela de Equipes (depende de cmp_esporte e ext_evento)
-- Assumindo id_esporte_fk (1: Futebol, 2: Vôlei, 3: Futsal) e id_evento_fk (1: Jogos Internos)
INSERT INTO eqp_equipe (nome_equipe, id_esporte_fk, id_evento_fk, id_curso_fk) VALUES ('BSI Caimans', 3, 1, 1); -- Futsal, BSI
INSERT INTO eqp_equipe (nome_equipe, id_esporte_fk, id_evento_fk, id_curso_fk) VALUES ('Elétrica Volts', 4, 1, 2); -- Basquete, Eng. Elétrica
INSERT INTO eqp_equipe (nome_equipe, id_esporte_fk, id_evento_fk, id_curso_fk) VALUES ('Tinha que ser de Redes', 2, 1, 3); -- Vôlei, Redes
INSERT INTO eqp_equipe (nome_equipe, id_esporte_fk, id_evento_fk, id_curso_fk) VALUES ('EletoMec', 1, 1, 4); -- Futebol, Eletromecânica

-- Inserindo dados na tabela de Grupos (depende de evt_evento)
INSERT INTO grp_grupo (codigo_grupo, id_evento_fk) VALUES ('FUTSAL-A', 1);
INSERT INTO grp_grupo (codigo_grupo, id_evento_fk) VALUES ('BASQUETE-A', 1);
INSERT INTO grp_grupo (codigo_grupo, id_evento_fk) VALUES ('VOLEI-A', 1);
INSERT INTO grp_grupo (codigo_grupo, id_evento_fk) VALUES ('FUT-CAM-A', 1);

-- Inserindo dados na tabela de associação grp_equipe (Muitos-para-Muitos entre Grupo e Equipe)
-- Assumindo id_grupo_fk (1: Futsal, 2: Basquete, 3: Vôlei, 4: Futebol de Campo)
-- Assumindo id_equipe_fk (1: BSI, 2: Elétrica, 3: Redes, 4: EletroMec)
INSERT INTO grp_equipe (id_grupo_fk, id_equipe_fk) VALUES (1, 1); -- Grupo Futsal <- Equipe BSI Caimans
INSERT INTO grp_equipe (id_grupo_fk, id_equipe_fk) VALUES (2, 2); -- Grupo Basquete <- Equipe Elétrica Volts
INSERT INTO grp_equipe (id_grupo_fk, id_equipe_fk) VALUES (3, 3); -- Grupo Vôlei <- Equipe Medicina Serpentes

-- Inserindo dados na tabela de Atletas (depende de eqp_equipe)
-- Assumindo id_equipe_fk (1: BSI, 2: Elétrica, 3: Medicina, 4: Direito)
INSERT INTO usr_atleta (nome_comp_atleta, apelido_atleta, matricula_atleta, telefone_atleta, senha_hash, id_equipe_fk, tipo) VALUES ('João Silva', 'Jão', '20230101', '79911111111', '$2y$10$....', 1, 'Capitão');
INSERT INTO usr_atleta (nome_comp_atleta, apelido_atleta, matricula_atleta, telefone_atleta, senha_hash, id_equipe_fk, tipo) VALUES ('Pedro Martins', 'MC Pedrinho', '20230102', '79911111112', '$2y$10$....', 1, 'Atleta');
INSERT INTO usr_atleta (nome_comp_atleta, apelido_atleta, matricula_atleta, telefone_atleta, senha_hash, id_equipe_fk, tipo) VALUES ('Lucas Santos', 'Simba', '20220201', '79922222221', '$2y$10$....', 2, 'Capitão');
INSERT INTO usr_atleta (nome_comp_atleta, apelido_atleta, matricula_atleta, telefone_atleta, senha_hash, id_equipe_fk, tipo) VALUES ('Maria Oliveira', 'Maruaia', '20210301', '79933333331', '$2y$10$....', 3, 'Capitão');
INSERT INTO usr_atleta (nome_comp_atleta, apelido_atleta, matricula_atleta, telefone_atleta, senha_hash, id_equipe_fk, tipo) VALUES ('Julia Almeida', 'Ju', '20210302', '79933333332', '$2y$10$....', 3, 'Atleta');
INSERT INTO usr_atleta (nome_comp_atleta, apelido_atleta, matricula_atleta, telefone_atleta, senha_hash, id_equipe_fk, tipo) VALUES ('Marcos Lima', 'Marcola', '20200401', '79944444441', '$2y$10$....', 4, 'Capitão');

-- Inserindo dados na tabela de Jogos (depende de várias tabelas)
-- Assumindo IDs das equipes, árbitros, grupos e evento.
-- Para simplificar, o primeiro jogo será entre as equipes 1 e uma hipotética equipe 5 (não cadastrada para exemplo)
INSERT INTO jgs_jogo (id_grupo_fk, fase_jogo, data_jogo, hora_jogo, id_equipe_a_fk, id_equipe_b_fk, placar_a, placar_b, wo_equipe_a, wo_equipe_b, id_arbitro_fk, id_evento_fk) VALUES (1, 'Fase de Grupos', '2025-09-15', '19:00:00', 1, 1, 0, 0, false, false, 1,  1); -- Jogo de exemplo, placar 0x0, sem W.O. BSI Caimans vs BSI Caimans (deveria ser outra equipe do mesmo grupo)
INSERT INTO jgs_jogo (id_grupo_fk, fase_jogo, data_jogo, hora_jogo, id_equipe_a_fk, id_equipe_b_fk, placar_a, placar_b, wo_equipe_a, wo_equipe_b, id_arbitro_fk, id_evento_fk) VALUES (2, 'Fase de Grupos', '2025-09-15', '20:00:00', 2, 2, 0, 0, false, false, 2, 1); -- Elétrica Volts vs Elétrica Volts
INSERT INTO jgs_jogo (id_grupo_fk, fase_jogo, data_jogo, hora_jogo, id_equipe_a_fk, id_equipe_b_fk, placar_a, placar_b, wo_equipe_a, wo_equipe_b, id_arbitro_fk, id_evento_fk) VALUES (3, 'Fase de Grupos', '2025-09-16', '19:00:00', 3, 3, 0, 0, false, false, 1,  1); -- Medicina Serpentes vs Medicina Serpentes

-- Fim do script