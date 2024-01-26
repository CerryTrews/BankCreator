package Exercicios.Banco.BankCreator.BankCreator.Conta;

import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores.GeradorDeCpf;
import Exercicios.Banco.BankCreator.BankCreator.Estrutura.Geradores.GeradorDeNome;

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

    public String getCpf() {
        return cpf;
    }
}

