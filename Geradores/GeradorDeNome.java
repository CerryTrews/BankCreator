package Exercicios.Banco.BankCreator.BankCreator.Geradores;

import java.util.Random;

public class GeradorDeNome {
    String[] nomes = {
            "João", "Maria", "Pedro", "Ana", "Luiz",
            "Carla", "Rafael", "Julia", "Fernando", "Camila",
            "Lucas", "Isabela", "Miguel", "Amanda", "Rodrigo",
            "Beatriz", "Gustavo", "Larissa", "Marcos", "Raquel",
            "Mateus", "Bianca", "Eduardo", "Vivian", "Felipe",
            "Daniela", "Renato", "Thais", "Gabriel", "Natália",
            "Carlos", "Cristino", "Eliéser", "Denise", "Letícia",
            "Antonio", "Igor", "Tonin", "Marta", "Denis", "Papinho",
            "Afonso", "Geralda", "Cibeli", "Clara", "Diva", "Bento"
    };

    public String geraNome() {
        Random random = new Random();
        return nomes[random.nextInt(0,44)];
    }
}
