package Exercicios.Banco.BankCreator.BankCreator.estrutura;

import Exercicios.Banco.BankCreator.BankCreator.Geradores.GeradorDeConta;
import Exercicios.Banco.BankCreator.BankCreator.Geradores.GeradorDeSaldo;
import Exercicios.Banco.BankCreator.BankCreator.Seletores.SeletorDeAgencia;
import Exercicios.Banco.BankCreator.BankCreator.Seletores.SeletorDeTipoDeConta;
import Exercicios.Banco.BankCreator.BankCreator.TipoDeConta.ContaPoupanca;

import java.lang.annotation.Inherited;

public class Conta extends Cliente{

    private String titular = new Cliente().getNome();

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    private boolean seletorTipoDeConta = new SeletorDeTipoDeConta().pegaTipoDeConta();
    private String tipoDeConta;
    private String numeroDaConta = new GeradorDeConta().geraConta();
    private SeletorDeAgencia agencia;
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

    public String getAgencia() {
        return agencia.seletorDeAgencia();
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
}
