package Exercicios.Banco.BankCreator.BankCreator.Geradores;

import java.util.Random;

public class GeradorDeConta {

    Random random = new Random();
    private int conta = geraConta();
    private int digito = geraDigito();


    public int geraConta() {
        random = new Random();
        return random.nextInt(3000, 5000);
    }

    public int geraDigito() {
        random = new Random();
        return random.nextInt(1,10);
    }

}
