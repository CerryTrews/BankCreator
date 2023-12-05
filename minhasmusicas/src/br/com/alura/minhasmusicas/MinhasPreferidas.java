package br.com.alura.minhasmusicas;

import br.com.alura.minhasmusicas.modelos.Audio;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");

        } else {
            System.out.println(audio.getTitulo() + " também curtem!");
        }
    }
}