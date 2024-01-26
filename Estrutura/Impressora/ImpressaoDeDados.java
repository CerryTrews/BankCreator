package Exercicios.Banco.BankCreator.BankCreator.Estrutura.Impressora;

import Exercicios.Banco.BankCreator.BankCreator.Conta.Conta;

import java.text.DecimalFormat;

public class ImpressaoDeDados {

    public static String dados() {
        Conta conta = new Conta();
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("------------------------------------");
        String dados = "Mostrando os dados da conta.";
        dados += ("\nNome: " + conta.getTitular());
        dados += ("\nCPF: " + conta.getCpf());
        dados += ("\n-- " + conta.getTipoDeConta() + " --");
        dados += ("\nNúmero: " + conta.getNumeroDaConta());
        dados += ("\nAgência: " + conta.getAgencia());
        dados += ("\nSaldo: R$" + df.format(conta.getSaldoConta()));
        dados += ("\nLimite: R$" + df.format(conta.getLimite()));
        dados += ("\nRendimento: R$" + df.format(conta.getRendimento()) + "/mês");
        dados += ("\nData de abertura da conta: " + conta.getDataAbertura());
        System.out.println("------------------------------------");
        return dados;
    }
}