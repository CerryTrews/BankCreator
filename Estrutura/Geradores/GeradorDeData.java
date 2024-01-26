package Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores;

import java.util.GregorianCalendar;
import java.util.Random;

public class GeradorDeData {
    GregorianCalendar calendario = new GregorianCalendar();
    Random random = new Random();

    private int ano, mes, dia;

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
