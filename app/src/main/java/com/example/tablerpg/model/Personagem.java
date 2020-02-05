package com.example.tablerpg.model;

public class Personagem {

    private String nome;
    private Classe classe;
    private Raca raca;
    private Sexo sexo;
    private int idade;

    private int nivel;
    private double xpAtual;
    private double xpNecessario;

    private int pVida;
    private int pMana;

    private int forca;
    private int destreza;
    private int agilidade;
    private int inteligencia;
    private int percepcao;
    private int resistencia;

    public Personagem() {
    }

    public Personagem(String nome, Classe classe, Sexo sexo, int idade, int nivel, int xp, int pVida, int pMana, int pStamina, int forca, int destreza, int agilidade, int inteligencia, int percepcao, int resistencia) {
        this.nome = nome;
        this.classe = classe;
        this.sexo = sexo;
        this.idade = idade;
        this.nivel = nivel;
        this.pVida = pVida;
        this.pMana = pMana;
        this.forca = forca;
        this.destreza = destreza;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.percepcao = percepcao;
        this.resistencia = resistencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public int getpVida() {
        return pVida;
    }

    public void setpVida(int pVida) {
        this.pVida = pVida;
    }

    public int getpMana() {
        return pMana;
    }

    public void setpMana(int pMana) {
        this.pMana = pMana;
    }


    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getPercepcao() {
        return percepcao;
    }

    public void setPercepcao(int percepcao) {
        this.percepcao = percepcao;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }


}
