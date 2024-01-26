package Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores;

import java.util.Random;

public class GeradorDeCpf {
    Random random = new Random();

    public String geraCpf() {

        int corpoCpf = random.nextInt(111111111, 999999999);
        int digitoCpf = random.nextInt(10, 99);

        return String.valueOf(corpoCpf) + "-" + String.valueOf(digitoCpf);
    }
}



