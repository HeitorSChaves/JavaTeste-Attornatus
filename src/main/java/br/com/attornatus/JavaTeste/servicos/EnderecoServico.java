package br.com.attornatus.JavaTeste.servicos;

import br.com.attornatus.JavaTeste.entidades.Endereco;
import br.com.attornatus.JavaTeste.entidades.Pessoa;
import br.com.attornatus.JavaTeste.repositorios.EnderecoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServico {

    @Autowired
    private EnderecoRepositorio enderecoRepositorio;

    @Autowired
    private PessoaServico pessoaServico;

    public Endereco cadastraEndereco(long idPessoa, Endereco endereco) {

        Pessoa pessoa = pessoaServico.devolverPessoa(idPessoa);

        endereco.setPessoa(pessoa);


        Endereco enderecoSalvo = enderecoRepositorio.save(endereco);

        return enderecoSalvo;
    }
}