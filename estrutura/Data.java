package Exercicios.Banco.BankCreator.BankCreator.estrutura;

import Exercicios.Banco.BankCreator.BankCreator.Geradores.GeradorDeData;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    GeradorDeData data = new GeradorDeData();


    public String inserirData() {
        this.dia = data.getDia();
        this.mes = data.getMes();
        this.ano = data.getAno();

        return (dia + "/" + mes + "/" + ano);
    }
}
