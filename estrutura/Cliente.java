package Exercicios.Banco.BankCreator.BankCreator.estrutura;

import Exercicios.Banco.BankCreator.BankCreator.Geradores.GeradorDeCpf;
import Exercicios.Banco.BankCreator.BankCreator.Geradores.GeradorDeNome;

public class Cliente {
        private String nome = new GeradorDeNome().geraNome();
        private String endereco;
        private String cpf = new GeradorDeCpf().geraCpf();
        private int idade;

        /*
        public void mudaCPF (String cpf) {
            validaCPF (cpf);
            this.cpf = cpf;
        }

        private void validaCPF (String cpf) {
            //série de regras aqui falha caso não seja válido
            if (this.idade <= 60) {
                validaCPF(cpf);
            }
            this.cpf = cpf;
        }
        */

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
}

