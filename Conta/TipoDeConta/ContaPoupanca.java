package Exercicios.Banco.BankCreator.BankCreator.Conta.TipoDeConta;

import Exercicios.Banco.BankCreator.BankCreator.Conta.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public double getLimite() {
        return super.getSaldoConta() * 0;
    }

    @Override
    public double getRendimento() {
        return super.getSaldoConta() * 0.10;
    }

}
