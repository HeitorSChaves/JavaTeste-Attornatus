package br.com.attornatus.JavaTeste.controladores;

import br.com.attornatus.JavaTeste.entidades.Pessoa;
import br.com.attornatus.JavaTeste.servicos.PessoaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PessoaControlador {

    @Autowired
    PessoaServico pessoaServico;

    // Post, cadastra uma pessoa
    @PostMapping(value = "/pessoa")
    public ResponseEntity cadastroPessoa(@RequestBody Pessoa pessoa) {
        pessoaServico.cadastrarPessoa(pessoa);
        return ResponseEntity.ok("");
    }

    // Get, devolve uma pessoa requisitada pelo ID.
    @GetMapping(value = "/pessoa/{id}")
    public ResponseEntity devolvePessoa (@PathVariable long id){
        Pessoa pessoa = pessoaServico.devolverPessoa(id);
        return ResponseEntity.ok(pessoa);
    }

    // Put, atualiza uma pessoa pelo ID informado.
    @PutMapping(value = "/pessoa/{id}")
    public ResponseEntity atualizaPessoa (@PathVariable long id, @RequestBody Pessoa pessoa) {
        Pessoa pessoaRetorno = pessoaServico.atualizarPessoa (id, pessoa);
        return ResponseEntity.ok(pessoaRetorno);
    }

    @DeleteMapping(value = "/pessoa/{id}")
    public ResponseEntity deletaPessoa (@PathVariable long id){
        pessoaServico.excluirPessoa (id);
        return ResponseEntity.ok("");
    }
}
