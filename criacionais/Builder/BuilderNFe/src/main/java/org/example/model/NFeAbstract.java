package org.example.model;

public abstract class NFeAbstract {

    protected abstract NFe imposto();

    public void geraImposto() {
        imposto().calculaImposto();
    }
}
