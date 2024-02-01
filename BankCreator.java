package Exercicios.Banco.BankCreator.BankCreator;

import Exercicios.Banco.BankCreator.BankCreator.Conta.Conta;
import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Impressora.ImpressaoDeDados;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class BankCreator {
    public static void main(String[] args) throws IOException {
        ImpressaoDeDados dados = new ImpressaoDeDados();
        Conta[] minhasContas = new Conta[80]; // número de contas que serão criadas


        /*Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        FileWriter salvar = new FileWriter("carteiraBancaria" + ".json");*/

        for(Conta conta : minhasContas) {
            System.out.println((dados.dados()));

        }
    }
}



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
 - programar para o resultado da execução do código gerar um json com todas as informações --
 - arrumar o código para que o resultado da criação, da impressão no console e as informações
   colocadas dentro do arquivo json, sejam as mesmas.
 - desenvolver uma interface --
*/


