package com.example.tablerpg.util;

import com.example.tablerpg.model.Classe;
import com.example.tablerpg.model.Personagem;
import com.example.tablerpg.model.Sexo;

public class UtilPersonagem {

    public static void createPersonagem(String nome, int idade, Classe classe, Sexo sexo) {

        if (classe.equals(Classe.CAVALEIRO)) {
            Personagem p1 = new Personagem(nome, classe, sexo, idade, 0, 0, 50, 0, 25, 10, 10, 8, 3, 6, 8);
        }


        if (classe.equals(Classe.ARQUEIRO)) {
            Personagem p1 = new Personagem(nome, classe, sexo, idade, 0, 0, 50, 0, 25, 10, 10, 8, 3, 6, 8);
        }


        if (classe.equals(Classe.MAGO)) {
            Personagem p1 = new Personagem(nome, classe, sexo, idade, 0, 0, 50, 0, 25, 10, 10, 8, 3, 6, 8);
        }
    }

}
/*45*/