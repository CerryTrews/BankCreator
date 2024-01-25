package Exercicios.Banco.BankCreator.BankCreator.Geradores;

import java.util.Random;

public class GeradorDeConta {

    Random random = new Random();

    public int geraDigito() {
        int digito = random.nextInt(1, 10);
        return digito;
    }

    public String geraConta() {
        int conta = random.nextInt(3000, 5000);
        return String.valueOf(conta) + "-" + String.valueOf(geraDigito());
    }


}
