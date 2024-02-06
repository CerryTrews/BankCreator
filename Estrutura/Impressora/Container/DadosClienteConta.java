package Exercicios.Banco.BankCreator.BankCreator.Estrutura.Impressora.Container;

import Exercicios.Banco.BankCreator.BankCreator.Conta.Conta;
import java.text.DecimalFormat;




public class DadosClienteConta {
    Conta conta = new Conta();
    DecimalFormat df = new DecimalFormat();

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getSaldo() {
        return saldo;
    }

    public String getLimite() {
        return limite;
    }

    public String getRendimento() {
        return rendimento;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

     String nome = conta.getTitular();
     String cpf = conta.getCpf();
     String tipoConta = conta.getTipoDeConta();
     String numero = conta.getNumeroDaConta();
     String agencia = conta.getAgencia();
     String saldo = df.format(conta.getSaldoConta());
     String limite = df.format(conta.getLimite());
     String rendimento = df.format(conta.getRendimento());
     String dataDeAbertura = conta.getDataAbertura();
}

