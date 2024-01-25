package Exercicios.Banco.BankCreator.BankCreator;

import Exercicios.Banco.BankCreator.BankCreator.estrutura.Conta;
import Exercicios.Banco.BankCreator.BankCreator.estrutura.ImpressaoDeDados;


/*
todo
 - terminar os construtores -- funcionando
 - criar classe para gerar data de abertura -- funcionando
 - criar classe para gerar numero da agencia -- funcionando
 - criar classe para gerar cpf aleatório -- funcionando
 - agregar o Random à Classe GeradorDeCpf --
 - criar dígitos aleatórios e ifs para definir qual agencia a conta pertence -- parcial
 - criar classe para dar nomes aleatórios aos titulares das contas -- funcionando
 - arrumar métodos deposita e saca --
 - distribuir melhor as funções de cada classe e métodos.

 */


public class ProgramaContaArray {
    public static void main(String[] args) {
        Conta[] minhasContas = new Conta[20];
        ImpressaoDeDados print = new ImpressaoDeDados();

        for (int j = 0; j <= minhasContas.length - 1; j++) {
            minhasContas[j] = new Conta();
        }

        for (int i = 0; i <= (minhasContas.length - 1); i++) {
            System.out.println(print.dados());
        }
    }
}
