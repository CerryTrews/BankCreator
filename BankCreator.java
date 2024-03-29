package Exercicios.Banco.BankCreator.BankCreator;

import Exercicios.Banco.BankCreator.BankCreator.Conta.Conta;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.FileWriter;
import java.io.IOException;


public class BankCreator {
    public static void main(String[] args) throws IOException {
        Conta[] minhasContas = new Conta[10]; // número de contas que serão criadas
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        for (int i = 0; i < minhasContas.length; i++) {
            minhasContas[i] = new Conta();
        }

        try {
            String json = objectMapper.writeValueAsString(minhasContas);
            System.out.println(json);
            FileWriter salvar = new FileWriter("relatorioDeContas" + ".json");
            salvar.write(json);
            salvar.close();
        } catch (Exception e) {
            e.printStackTrace();
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


