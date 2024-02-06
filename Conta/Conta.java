package Exercicios.Banco.BankCreator.BankCreator.Conta;

import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores.GeradorDeConta;
import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores.GeradorDeSaldo;
import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Seletores.SeletorDeTipoDeConta;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.DecimalFormat;

public class Conta {

    DecimalFormat df = new DecimalFormat("#.##");



    private final String titular = new Cliente().getNome();

    private final String cpf = new Cliente().getCpf();
    private final boolean seletorTipoDeConta = new SeletorDeTipoDeConta().pegaTipoDeConta();
    private final int corpoDaConta = new GeradorDeConta().geraConta();
    private final int digitoDaConta = new GeradorDeConta().geraDigito();
    private final String numeroDaConta = corpoDaConta + "-" + digitoDaConta;
    private final double saldo = new GeradorDeSaldo().getSaldo();
    private final String dataAbertura = new Data().inserirData();

    public boolean seletorTipoDeConta() {
        return seletorTipoDeConta;
    }

    @JsonProperty(value = "Número", index = 3)
    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    @JsonProperty(value = "Saldo", index = 5)
    public String getSaldoConta() {
        return "R$" + df.format(saldo);
    }

    @JsonProperty(value = "Titular", index = 0)
    public String getTitular() {
        return titular;
    }

    @JsonProperty(value = "CPF", index = 1)
    public String getCpf() {
        return cpf;
    }

    @JsonProperty(value = "Limite", index = 6)
    public String getLimite() {
        double limite;
        if (seletorTipoDeConta()) {
            limite = saldo * 1.13;
        } else {
            limite = saldo * 0;
        }
        return "R$" + df.format(limite);
    }

    @JsonProperty(value = "Rendimento", index = 7)
    public String getRendimento() {
        double rendimento;
        if (seletorTipoDeConta()) {
            rendimento = saldo * 0.01;
        } else {
            rendimento = saldo * 0.10;
        }
        return "R$" + df.format(rendimento) + "/mês";
    }

    @JsonProperty(value = "Data de abertura", index = 8)
    public String getDataAbertura() {
        return dataAbertura;
    }

    @JsonProperty(value = "Tipo", index = 2)
    public String getTipoDeConta() {
        String tipoDeConta;
        if (seletorTipoDeConta()) {
            tipoDeConta = " -- Conta corrente -- ";
        } else {
            tipoDeConta = " -- Conta poupança -- ";
        }
        return tipoDeConta;
    }



    private final String[] agenciaBancaria = {"Dígito 1 - Bradesco", "Dígito 2 - Itaú", "Dígito 3 - Unibanco"
                                            , "Digito 4 - Santander", "Dígito 5 - Banco do Brasil",
                                              "Dígito 6 - Nu Bank", "Dígito 7 - C6 Bank", "Dígito 8 - Caixa Econômica Federal",
                                              "Dígito 9 - Banco Inter", "Dígito 10 - Banco Real"};

    @JsonProperty(value = "Agência", index = 4)
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
