package Exercicios.Banco.BankCreator.BankCreator;

import Exercicios.Banco.BankCreator.BankCreator.Conta.Conta;
import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Impressora.ImpressaoDeDados;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class BankCreator {
    public static void main(String[] args) throws IOException {
        Conta[] minhasContas = new Conta[20];
        ImpressaoDeDados dados = new ImpressaoDeDados();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        FileWriter salvar = new FileWriter("carteiraBancaria" + ".json");

        for (Conta conta : minhasContas) {
            System.out.println(dados.print());
        }

        for (Conta conta : minhasContas) {
            salvar.write(gson.toJson(dados.gs()));
        }
        salvar.close();

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
 - desenvolver uma interface --
*/


