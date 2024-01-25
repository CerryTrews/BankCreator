package Exercicios.Banco.BankCreator.BankCreator.TipoDeConta;

import Exercicios.Banco.BankCreator.BankCreator.Geradores.GeradorDeConta;
import Exercicios.Banco.BankCreator.BankCreator.Geradores.GeradorDeSaldo;
import Exercicios.Banco.BankCreator.BankCreator.estrutura.Conta;

public class ContaPoupanca extends Conta {
    private String conta = new GeradorDeConta().geraConta();
    private double saldo = new GeradorDeSaldo().getSaldo();

    @Override
    public double getLimite() {
        return super.getSaldoConta() * 0;
    }

    @Override
    public double getRendimento() {
        return super.getSaldoConta() * 0.10;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
