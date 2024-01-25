package Exercicios.Banco.BankCreator.BankCreator.Geradores;

import Exercicios.Banco.BankCreator.BankCreator.Seletores.SeletorDeAgencia;

import java.util.Random;

public class GeradorDeConta {

    Random random = new Random();
    private int digito = geraDigito();


    public String geraConta() {
        int conta = random.nextInt(3000, 5000);
        return String.valueOf(conta) + "-" + String.valueOf(digito);
    }

    public int geraDigito() {
        random = new Random();
        return random.nextInt(1,10);
    }



}
