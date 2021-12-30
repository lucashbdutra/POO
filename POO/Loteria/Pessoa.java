package Loteria;

import java.util.*;

public class Pessoa {
    //Atributos
    private String nome;
    private int id;
    private int[] jogo = new int[6];


    //Getters e setters
    public String getNome() {
        return nome;
    }
    public int[] getJogo() {
        return jogo;
    }
    public void setJogo(int[] jogo) {
        this.jogo = jogo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void gerarJogo(){
        Random rand = new Random();
        for(int i = 0; i < 6; i++){
            this.jogo[i] = rand.nextInt(100);
        }
    }
    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", jogo=" + Arrays.toString(jogo) + ", nome=" + nome + "]";
    }


}
