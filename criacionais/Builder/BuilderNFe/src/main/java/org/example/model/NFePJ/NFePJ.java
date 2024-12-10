package org.example.model.NFePJ;

import org.example.model.NFe;
import org.example.model.NotaFiscal;

import java.math.BigDecimal;

public class NFePJ extends NotaFiscal implements NFe {

    @Override
    public BigDecimal calculaImposto() {
         return this.getItemNotas()
                .stream()
                .reduce(BigDecimal.ZERO, (soma, item) -> soma.add(item.getValor()), BigDecimal::add).multiply(new BigDecimal(0.4));
    }
}
