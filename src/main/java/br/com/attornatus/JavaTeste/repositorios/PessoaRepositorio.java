package br.com.attornatus.JavaTeste.repositorios;

import br.com.attornatus.JavaTeste.entidades.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Cria o Repositório de "Pessoa" no H2,tal como controla o mesmo nas suas tabelas.
@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {
}
