package Exercicios.Banco.BankCreator.BankCreator.estrutura;

import Exercicios.Banco.BankCreator.BankCreator.Geradores.GeradorDeConta;
import Exercicios.Banco.BankCreator.BankCreator.Geradores.GeradorDeSaldo;
import Exercicios.Banco.BankCreator.BankCreator.Seletores.SeletorDeAgencia;

public class ContaArray {

    private String titular = new Cliente().getNome();
    private String cpf = new Cliente().getCpf();
    private GeradorDeConta numero = new GeradorDeConta();
    private SeletorDeAgencia agencia = new SeletorDeAgencia();
    private Data dataAbertura = new Data();
    private GeradorDeSaldo liquido = new GeradorDeSaldo();

    public String getTitular() {
        return titular;
    }

    public String getCpf() {
        return cpf;
    }

    public GeradorDeConta getNumero() {
        return numero;
    }

    public SeletorDeAgencia getAgencia() {
        return agencia;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public GeradorDeSaldo getLiquido() {
        return liquido;
    }
}
// TODO criar transações de saque, depósito e transferência
 /*public GeradorDeSaldo getSaldo() {
        return new GeradorDeSaldo();
    }

     */

//public void setDataAbertura(Data dataAbertura) {
//this.dataAbertura = dataAbertura;
//}

 /*
    public void saca(double valor) {

        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
        }
    }
    */

    /*
    public void deposita(double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido");
        } else {
            saldo += valor;
        }
    }
    */

