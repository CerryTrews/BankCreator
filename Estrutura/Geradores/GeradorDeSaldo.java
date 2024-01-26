package Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores;

import java.util.Random;

public class GeradorDeSaldo {

    Random random = new Random();
    private double saldo = geraSaldo();

    private double geraSaldo() {
        return random.nextDouble(3.00,9999.99);
    }

    public double getSaldo() {
        return this.saldo;
    }

}
