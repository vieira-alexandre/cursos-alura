package br.com.alura.forum.modelo.repositories;


import br.com.alura.forum.modelo.entities.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    List<Topico> findByCurso_Nome(String nomeCurso);
}
