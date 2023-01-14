package br.com.attornatus.JavaTeste.entidades;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Atributos

    private Long id;
    private String nome;

    private Date dataNascimento;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<Endereco> endereco;

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
