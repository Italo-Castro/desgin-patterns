package org.example.model;

public class PropostaSeguro {

    private CalculadoraPremioSeguro calculadoraPremioSeguro;


    public PropostaSeguro(){}


    public double gerar(double valorVeiculo){
       return this.calculadoraPremioSeguro.calcular(valorVeiculo);
    }

    public CalculadoraPremioSeguro getCalculadoraPremioSeguro() {
        return calculadoraPremioSeguro;
    }

    public void setCalculadoraPremioSeguro(CalculadoraPremioSeguro calculadoraPremioSeguro) {
        this.calculadoraPremioSeguro = calculadoraPremioSeguro;
    }
}


