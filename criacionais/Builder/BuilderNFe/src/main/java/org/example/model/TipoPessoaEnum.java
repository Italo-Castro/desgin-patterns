package org.example.model;

public enum TipoPessoaEnum {


    PESSOA_FISICA(1),
    PESSOA_JURICA(2);

    private int codigo;

    TipoPessoaEnum(int codigo) {
        this.codigo = codigo;
    }
}
