package org.example;

import org.example.builder.NFeBuilder;
import org.example.model.NotaFiscal;

import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        NotaFiscal notaFiscalPF = new NFeBuilder().comNumero(1).comDataEmissao(new Date()).comItem("Produto", 2, "25").comNotaFiscalPF().build();
        System.out.println(notaFiscalPF);


        NotaFiscal notaFiscalPJ = new NFeBuilder().comNumero(1).comDataEmissao(new Date()).comItem("Teste pattern build", 4, "125").comNotaFiscalPJ().build();
        System.out.println(notaFiscalPJ);
    }
}