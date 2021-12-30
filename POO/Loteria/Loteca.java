package Loteria;

import java.util.*;

public class Loteca implements Interface{
    //Atributos
    private Pessoa ganhador;
    private boolean comprouBilhete;
    private int[] jogoGanho = new int[6];
    private Pessoa concorrente;
    

    //Setters e Getters
    public Pessoa getGanhador() {
        return ganhador;
    }
    public Pessoa getConcorrente() {
        return concorrente;
    }
    public void setConcorrente(Pessoa concorrente) {
        this.concorrente = concorrente;
    }
    public int[] getJogoGanho() {
        return jogoGanho;
    }
    public void setJogoGanho(int[] jogoGanho) {
        this.jogoGanho = jogoGanho;
    }
    public boolean isComprouBilhete() {
        return comprouBilhete;
    }
    public void setComprouBilhete(boolean comprouBilhete) {
        this.comprouBilhete = comprouBilhete;
    }
    public void setGanhador(Pessoa ganhador) {
        this.ganhador = ganhador;
    }
    
    public void anunciar(){
        if (this.ganhador != null){
            System.out.println("E o nosso ganhador foi: " + this.getGanhador());
        }
    }

    @Override
    public void comprar() {
        this.comprouBilhete = true;
         
    }
    @Override
    public void sortear(){
        if(comprouBilhete == false){
            throw new RuntimeException("É necessário primeiro comprar seu bilhete para participar do sorteio.");
        } else {
            Random ran = new Random();
            for(int i = 0; i < 6 ; i++){
                this.jogoGanho[i] = ran.nextInt(100);
            }

        }
        
    }

    @Override
    public String verificar(){
        if(this.getJogoGanho() != null){
            if (this.getJogoGanho() == concorrente.getJogo()){
                StringBuilder sb = new StringBuilder("Parabéns!!! Você acertou todos os 6 números");
                setGanhador(this.concorrente); 
                return sb.toString(); 
            } 
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Os números sorteados foram: \n");
        for (int i : getJogoGanho()) {
            sb.append(i + " ");
        }
        sb.append("\nInfelizmente não foi dessa vez, fica pra próxima");
        return sb.toString();
    
    }


    
}
