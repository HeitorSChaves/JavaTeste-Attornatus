package br.com.attornatus.JavaTeste.repositorios;

import br.com.attornatus.JavaTeste.entidades.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {
}
