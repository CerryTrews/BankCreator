package Exercicios.Banco.BankCreator.BankCreator.Conta;

import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores.GeradorDeConta;
import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores.GeradorDeSaldo;
import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Seletores.SeletorDeTipoDeConta;

public class Conta extends Cliente{

    private final String titular = new Cliente().getNome();

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    private final boolean seletorTipoDeConta = new SeletorDeTipoDeConta().pegaTipoDeConta();
    private final int corpoDaConta = new GeradorDeConta().geraConta();
    private final int digitoDaConta = new GeradorDeConta().geraDigito();
    private final String numeroDaConta = String.valueOf(corpoDaConta) + "-" + String.valueOf(digitoDaConta);
    private final double saldo = new GeradorDeSaldo().getSaldo();
    private final String dataAbertura = new Data().inserirData();


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
        double limite;
        if(seletorTipoDeConta()) {
            limite = saldo * 1.13;
        } else {
            limite = saldo * 0;
        }
        return limite;
    }

    public double getRendimento() {
        double rendimento;
        if(seletorTipoDeConta()) {
            rendimento = saldo * 0.01;
        } else {
            rendimento = saldo * 0.10;
        }
        return rendimento;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public String getTipoDeConta() {
        String tipoDeConta;
        if (seletorTipoDeConta()) {
            tipoDeConta = "Conta corrente";
        } else {
            tipoDeConta = "Conta poupança";
        }
        return tipoDeConta;
    }



    private final String[] agenciaBancaria = {"Dígito 1 - Bradesco", "Dígito 2 - Itaú", "Dígito 3 - Unibanco"
                                            , "Digito 4 - Santander", "Dígito 5 - Banco do Brasil",
                                              "Dígito 6 - NuBank", "Dígito 7 - C6Bank", "Dígito 8 - Caixa Econômica Federal",
                                              "Dígito 9 - Banco Inter", "Dígito 10 - Banco Real"};

    public String getAgencia() {
        String agencia;
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
