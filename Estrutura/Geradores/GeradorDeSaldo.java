package Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores;

import java.util.Random;

public class GeradorDeSaldo {
//-- Gerador de saldo em conjunto com gerador de limite e rendimento.

    Random random = new Random();
    private double saldo = geraSaldo();

    private double geraSaldo() {
        return random.nextDouble(3.00,9999.99);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimite() {
        return this.saldo * 1.13;
    }

    public double getRendimento() {
        return this.saldo * 0.01;
    }
}
