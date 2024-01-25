package Exercicios.Banco.BankCreator.BankCreator.Geradores;

public class GeradorDeCpf {
    private int min = 100000000;
    private int max = 999999999;
    private int range = ((max - min) + 1) + min;

    public String geraCpf() {

        int corpoCpf = (int)(Math.random() * (range - min) + 1);
        int digitoCpf = (int) (Math.random() * ((99 - 10) + 1) + 10);

        return String.valueOf(corpoCpf) + "-" + String.valueOf(digitoCpf);
    }
}



