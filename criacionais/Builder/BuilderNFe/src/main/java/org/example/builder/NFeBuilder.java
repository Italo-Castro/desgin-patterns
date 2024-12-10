package org.example.builder;

import org.example.model.ItemNota;
import org.example.model.NFePF.NFePF;
import org.example.model.NFePJ.NFePJ;
import org.example.model.NotaFiscal;
import org.example.model.TipoPessoaEnum;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class NFeBuilder {

    private NotaFiscal instancia;

    public NFeBuilder() {
        this.instancia = new NotaFiscal();
    }

    public NFeBuilder comNotaFiscalPF() {
        this.instancia.setTipoPessoaEnum(TipoPessoaEnum.PESSOA_FISICA);
        return this;
    }

    public NFeBuilder comNotaFiscalPJ() {
        this.instancia.setTipoPessoaEnum(TipoPessoaEnum.PESSOA_JURICA);
        return this;
    }

    public NFeBuilder comNumero(int numeroNfe) {
        this.instancia.setNumeroNfe(numeroNfe);
        return this;
    }

    public NFeBuilder comDataEmissao(Date data) {
         this.instancia.setDataEmissao(data);
         return this;
    }

    public NFeBuilder comItem(String nome, float quantidade, String valor) {
        ItemNota item = new ItemNota();
        item.setNome(nome);
        item.setValor(new BigDecimal(valor));
        item.setQuantidade(quantidade);

        if (this.instancia.getItemNotas() == null) {
            this.instancia.setItemNotas(new ArrayList<ItemNota>());
        }

        this.instancia.getItemNotas().add(item);

        return this;
    }

    public NotaFiscal build() {
        return instancia;
    }
}
