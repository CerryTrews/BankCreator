package Exercicios.Banco.BankCreator.BankCreator;

import Exercicios.Banco.BankCreator.BankCreator.Conta.Conta;
import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Impressora.ImpressaoDeDados;


/*
todo
 - terminar os construtores -- funcionando
 - criar classe para gerar data de abertura -- funcionando
 - criar classe para gerar numero da agencia -- funcionando
 - criar classe para gerar cpf aleatório -- funcionando
 - agregar o Random à Classe GeradorDeCpf -- funcionando
 - criar dígitos aleatórios e ifs para definir qual agencia a conta pertence -- funcionando
 - criar classe para dar nomes aleatórios aos titulares das contas -- funcionando
 - arrumar métodos deposita, saca e transfere --
 - distribuir melhor as funções de cada classe e métodos --
 - diferenciar método de transferência comum e pix, transferência deve conter uma taxa para cada transação, já o pix
   deverá ser gratuito --
*/


public class BankCreator {
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
