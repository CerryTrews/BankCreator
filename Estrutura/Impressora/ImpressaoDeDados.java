package Exercicios.Banco.BankCreator.BankCreator.Estrutura.Impressora;

import Exercicios.Banco.BankCreator.BankCreator.Conta.Conta;
import java.text.DecimalFormat;

public class ImpressaoDeDados {
    Conta conta = new Conta();
    DecimalFormat df = new DecimalFormat("#.##");

    public String print() {

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

    public Object gs() {

        String nome = "Nome: " + conta.getTitular();
        String cpf = "Cpf: " + conta.getCpf();
        String tipoConta = "-- " + conta.getTipoDeConta() + " --";
        String numero = "Número: " + conta.getNumeroDaConta();
        String agencia = "Agência: " + conta.getAgencia();
        String saldo = "Saldo: R$" + df.format(conta.getSaldoConta());
        String limite= "Limite: R$" + df.format(conta.getLimite());
        String rendimento= "Rendimento: R$" + df.format(conta.getRendimento()) + "/mês";
        String dataDeAbertura= "Data de abertura da conta: " + conta.getDataAbertura();

        String[] dadosJson = {nome, cpf, tipoConta, numero, agencia, saldo, limite, rendimento, dataDeAbertura};

        return dadosJson;
    }









}
