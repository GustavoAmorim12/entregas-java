package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.model.Livro;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    Page<Livro> findAll(Pageable pageable);
}
