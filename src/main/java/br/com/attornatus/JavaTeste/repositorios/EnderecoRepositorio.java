package br.com.attornatus.JavaTeste.repositorios;

import br.com.attornatus.JavaTeste.entidades.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepositorio extends JpaRepository <Endereco, Long> {
}
