package Exercicios.Banco.BankCreator.BankCreator.Conta;

import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores.GeradorDeConta;
import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores.GeradorDeSaldo;
import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Seletores.SeletorDeTipoDeConta;
import Exercicios.Banco.BankCreator.BankCreator.Conta.TipoDeConta.ContaPoupanca;

public class Conta extends Cliente{

    private String titular = new Cliente().getNome();

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    private boolean seletorTipoDeConta = new SeletorDeTipoDeConta().pegaTipoDeConta();
    private String tipoDeConta;
    private int corpoDaConta = new GeradorDeConta().geraConta();
    private int digitoDaConta = new GeradorDeConta().geraDigito();
    private String numeroDaConta = String.valueOf(corpoDaConta) + "-" + String.valueOf(digitoDaConta);
    private String agencia;
    private double saldo = new GeradorDeSaldo().getSaldo();
    private double limite;
    private double rendimento;
    private String dataAbertura = new Data().inserirData();


    public String getTitular() {
        return titular;
    }

    public boolean seletorTipoDeConta() {
        return seletorTipoDeConta;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldoConta() {
        return saldo;
    }

    public double getLimite() {
        if(seletorTipoDeConta() == true) {
            this.limite = saldo * 1.13;
        } else {
            this.limite = new ContaPoupanca().getLimite();
        }
        return limite;
    }

    public double getRendimento() {
        if(seletorTipoDeConta() == true) {
            this.rendimento = saldo * 0.01;
        } else {
            this.rendimento = new ContaPoupanca().getRendimento();
        }
        return rendimento;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public String getTipoDeConta() {
        if (seletorTipoDeConta() == true) {
            tipoDeConta = "Conta corrente";
        } else {
            tipoDeConta = "Conta poupança";
        }
        return tipoDeConta;
    }



    private String[] agenciaBancaria = {"Dígito 1 - Bradesco", "Dígito 2 - Itaú", "Dígito 3 - Unibanco", "Digito 4 - Santander",
                                 "Dígito 5 - Banco do Brasil", "Dígito 6 - NuBank", "Dígito 7 - C6Bank",
                                 "Dígito 8 - Caixa Econômica Federal", "Dígito 9 - Banco Inter",
                                 "Dígito 10 - Banco Real"};

    public String getAgencia() {
        if(digitoDaConta <= 1) {
            agencia = agenciaBancaria[0];
        } else if (digitoDaConta == 2) {
            agencia = agenciaBancaria[1];
        } else if (digitoDaConta == 3) {
            agencia = agenciaBancaria[2];
        } else if (digitoDaConta == 4) {
            agencia = agenciaBancaria[3];
        } else if (digitoDaConta == 5) {
            agencia = agenciaBancaria[4];
        } else if (digitoDaConta == 6) {
            agencia = agenciaBancaria[5];
        } else if (digitoDaConta == 7) {
            agencia = agenciaBancaria[6];
        } else if (digitoDaConta == 8) {
            agencia = agenciaBancaria[7];
        } else if (digitoDaConta == 9) {
            agencia = agenciaBancaria[8];
        } else {
            agencia = agenciaBancaria[9];
        }
        return agencia;
    }
}
