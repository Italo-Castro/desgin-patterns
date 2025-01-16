package com.example.bean.impl;

import java.math.BigDecimal;

import com.example.bean.CalculadoraImposto;

public class CalculadoraImpostoImpl implements CalculadoraImposto {

	@Override
    public BigDecimal calcular(BigDecimal valor) {
	    return valor.multiply(new BigDecimal("0.15"));
    }

}
