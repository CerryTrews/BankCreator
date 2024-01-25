package Exercicios.Banco.BankCreator.BankCreator.Seletores;

import Exercicios.Banco.BankCreator.BankCreator.Geradores.GeradorDeConta;

import java.lang.annotation.Inherited;


public class SeletorDeAgencia extends GeradorDeConta {

    private String agencia;
    private GeradorDeConta digito;


    public String seletorDeAgencia() {

        if (digito.geraDigito() == 1) {
            agencia = "Dígito 1 - Banco das Américas";
        } else if (digito.geraDigito() == 2) {
            agencia = "Dígito 2 - Banespa";
        } else if (digito.geraDigito() == 3) {
            agencia = "Dígito 3 - Santander";
        } else if (digito.geraDigito() == 4) {
            agencia = "Dígito 4 - Itaú";
        } else if (digito.geraDigito() == 5) {
            agencia = "Dígito 5 - Banco do Brasil";
        } else if (digito.geraDigito() == 6) {
            agencia = "Dígito 6 - Bradesco";
        } else if (digito.geraDigito() == 7) {
            agencia = "Dígito 7 - NuBank";
        } else if (digito.geraDigito() == 8) {
            agencia = "Dígito 8 - C6 Bank";
        } else if (digito.geraDigito() == 9) {
            agencia = "Dígito 9 - Caixa Econômico Federal";
        } else if (digito.geraDigito() == 10) {
            agencia = "Dígito 10 - Zé Delívery";
        }
        return agencia;
    }
}

