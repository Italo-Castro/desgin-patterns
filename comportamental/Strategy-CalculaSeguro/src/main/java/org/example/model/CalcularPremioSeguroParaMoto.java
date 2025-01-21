package org.example.model;

public class CalcularPremioSeguroParaMoto implements CalculadoraPremioSeguro{
    @Override
    public double calcular(double valorVeiculo) {
        return valorVeiculo * 0.75;
    }
}
