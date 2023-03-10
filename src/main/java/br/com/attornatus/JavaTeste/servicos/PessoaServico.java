package br.com.attornatus.JavaTeste.servicos;

import br.com.attornatus.JavaTeste.entidades.Pessoa;
import br.com.attornatus.JavaTeste.repositorios.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServico {

    @Autowired
    private PessoaRepositorio pessoaRepositorio;

    // Função cadastrar pessoa
    public void cadastrarPessoa(Pessoa pessoa) {
        pessoaRepositorio.save(pessoa);
    }

    //Função devolver pessoa
    public Pessoa devolverPessoa (long id) {
       Pessoa pessoa = pessoaRepositorio.findById(id).get();
       return pessoa;
    }

    //Função atualizar pessoa
    public Pessoa atualizarPessoa(long id, Pessoa pessoa) {
        Pessoa pessoaSalvaBanco = devolverPessoa(id);
        pessoaSalvaBanco.setNome(pessoa.getNome());
        pessoaSalvaBanco.setDataNascimento(pessoa.getDataNascimento());
        pessoaRepositorio.save(pessoaSalvaBanco);
        return pessoaSalvaBanco;
    }

    public void excluirPessoa(long id) {
        pessoaRepositorio.deleteById(id);
    }
}
