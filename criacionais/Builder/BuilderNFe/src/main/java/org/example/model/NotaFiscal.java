package org.example.model;

import org.example.model.NFePJ.NFePJ;

import java.util.Date;
import java.util.List;


public class NotaFiscal extends NFeAbstract{

    private Integer numeroNfe;

    private Date dataEmissao;

    private TipoPessoaEnum tipoPessoaEnum;

    private List<ItemNota> itemNotas;


    public NotaFiscal() { }

    public NotaFiscal(Integer numeroNfe, Date dataEmissao, TipoPessoaEnum tipoPessoaEnum, List<ItemNota> itemNotas) {
        this.numeroNfe = numeroNfe;
        this.dataEmissao = dataEmissao;
        this.tipoPessoaEnum = tipoPessoaEnum;
        this.itemNotas = itemNotas;
    }

    public Integer getNumeroNfe() {
        return numeroNfe;
    }

    public void setNumeroNfe(Integer numeroNfe) {
        this.numeroNfe = numeroNfe;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public TipoPessoaEnum getTipoPessoaEnum() {
        return tipoPessoaEnum;
    }

    public void setTipoPessoaEnum(TipoPessoaEnum tipoPessoaEnum) {
        this.tipoPessoaEnum = tipoPessoaEnum;
    }

    public List<ItemNota> getItemNotas() {
        return itemNotas;
    }

    public void setItemNotas(List<ItemNota> itemNotas) {
        this.itemNotas = itemNotas;
    }

    @Override
    protected NFe imposto() {
        if (this.tipoPessoaEnum == TipoPessoaEnum.PESSOA_FISICA) {
             new NFePJ().calculaImposto();
        }else if (this.tipoPessoaEnum == TipoPessoaEnum.PESSOA_JURICA) {
            new NFePJ().calculaImposto();
        }
        return null;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "numeroNfe=" + numeroNfe +
                ", dataEmissao=" + dataEmissao +
                ", tipoPessoaEnum=" + tipoPessoaEnum +
                ", itemNotas=" + itemNotas +
                '}';
    }
}
