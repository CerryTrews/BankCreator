package Exercicios.Banco.BankCreator.BankCreator.Estrutura.Impressora.Container;

import Exercicios.Banco.BankCreator.BankCreator.Conta.Conta;
import java.text.DecimalFormat;




public class DadosClienteConta {
    Conta conta = new Conta();
    DecimalFormat df = new DecimalFormat();

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

