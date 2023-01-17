package br.com.attornatus.JavaTeste.controladores;

import br.com.attornatus.JavaTeste.entidades.Endereco;
import br.com.attornatus.JavaTeste.servicos.EnderecoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnderecoControlador {

    @Autowired
    EnderecoServico enderecoServico;

    // Post, cadastra um endereco
    @PostMapping(value = "/pessoa/{idPessoa}/endereco")
    public ResponseEntity cadastraEndereco(@PathVariable long idPessoa,
                                           @RequestBody Endereco endereco){

        Endereco enderecoCreado = enderecoServico.cadastraEndereco(idPessoa, endereco);

        return ResponseEntity.ok(enderecoCreado);
    }



}