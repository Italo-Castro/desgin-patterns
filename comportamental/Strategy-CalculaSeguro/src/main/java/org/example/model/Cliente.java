package org.example.model;

public class Cliente {

    private Integer id;

    private String nome;

    private Integer idade;

    private SexoEnum sexo;


    public Cliente(Integer id, String nome, Integer idade, SexoEnum sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }
}



