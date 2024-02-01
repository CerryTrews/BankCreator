package Exercicios.Banco.BankCreator.BankCreator.Estrutura.Impressora;

import Exercicios.Banco.BankCreator.BankCreator.Conta.Conta;

import java.text.DecimalFormat;

public class ImpressaoDeDados {
    Conta conta = new Conta();
    DecimalFormat df = new DecimalFormat();

    public String dados() {
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

    public String[] gs() {

        String nome = "Nome: " + conta.getTitular();
        String cpf = "Cpf: " + conta.getCpf();
        String tipoConta = "-- " + conta.getTipoDeConta() + " --";
        String numero = "Número: " + conta.getNumeroDaConta();
        String agencia = "Agência: " + conta.getAgencia();
        String saldo = "Saldo: R$" + df.format(conta.getSaldoConta());
        String limite = "Limite: R$" + df.format(conta.getLimite());
        String rendimento = "Rendimento: R$" + df.format(conta.getRendimento()) + "/mês";
        String dataDeAbertura = "Data de abertura da conta: " + conta.getDataAbertura();

        String jamanta[] = {nome, cpf, tipoConta, numero, agencia, saldo, limite, rendimento, dataDeAbertura};

        return jamanta;
    }

    public String[] ContaCompleta() {

        String nome = conta.getTitular();
        String cpf = conta.getCpf();
        String tipoConta = conta.getTipoDeConta();
        String numero = conta.getNumeroDaConta();
        String agencia = conta.getAgencia();
        String saldo = df.format(conta.getSaldoConta());
        String limite = df.format(conta.getLimite());
        String rendimento = df.format(conta.getRendimento());
        String dataDeAbertura = conta.getDataAbertura();

        String[] contaCompleta = {nome, cpf, tipoConta, numero, agencia, saldo, limite, rendimento, dataDeAbertura};
        return contaCompleta;
    }

    public void contaCompleta(String nome, String cpf, String tipoConta, String agencia, String saldo, String limite, String rendimento, String dataDeAbertura) {
        nome = this.conta.getNome();
        cpf = this.conta.getCpf();
        tipoConta = this.conta.getTipoDeConta();
        agencia = this.conta.getAgencia();
        saldo = df.format(this.conta.getSaldoConta());
        limite = df.format(this.conta.getLimite());
        rendimento = df.format(this.conta.getRendimento());
        dataDeAbertura = this.conta.getDataAbertura();

        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(tipoConta);
        System.out.println(agencia);
        System.out.println(saldo);
        System.out.println(limite);
        System.out.println(rendimento);
        System.out.println(dataDeAbertura);
    }




    //, tipoConta, numero, agencia, saldo, limite, rendimento, dataDeAbertura}
}


