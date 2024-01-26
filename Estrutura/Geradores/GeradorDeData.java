package Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores;

import java.util.Random;

public class GeradorDeData {
    Random random = new Random();

    private final int ano;
    private final int mes;
    private final int dia;

    public GeradorDeData () {

        this.ano = random.nextInt(1992, 2024);
        this.mes = random.nextInt(1,12);
        this.dia = random.nextInt(1,30);
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }
}
