package org.example.model;

public class CalcularPremioSeguroParaCarro implements CalculadoraPremioSeguro{
    @Override
    public double calcular(double valorVeiculo) {
        return valorVeiculo * 0.50;
    }
}
