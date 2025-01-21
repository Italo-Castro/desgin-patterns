package org.example;

import org.example.model.CalcularPremioSeguroParaCarro;
import org.example.model.CalcularPremioSeguroParaMoto;
import org.example.model.PropostaSeguro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner sc = new  Scanner(System.in);
         System.out.println("Digite o valor do veiculo");
         var valorVeiculo = sc.nextDouble();

        System.out.println("Informe o tipo de veiculo \n 1 - Moto \n 2 - Carro");
        var tipoVeiculo = sc.nextInt();

        PropostaSeguro propostaSeguro = new PropostaSeguro();
        if (tipoVeiculo == 1) {
            propostaSeguro.setCalculadoraPremioSeguro(new CalcularPremioSeguroParaMoto());
        } else {
            propostaSeguro.setCalculadoraPremioSeguro(new CalcularPremioSeguroParaCarro());
        }
        System.out.println("Valor premio seguro é de : "+ propostaSeguro.gerar(valorVeiculo)) ;
    }
}