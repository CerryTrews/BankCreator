package Exercicios.Banco.BankCreator.BankCreator.Estrutura.Seletores;

import java.util.Random;

public class SeletorDeTipoDeConta {

    Random random = new Random();

    public boolean pegaTipoDeConta() {
        random = new Random();
        return random.nextBoolean();
    }
}
