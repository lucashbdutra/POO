package Luta;

import java.util.Random;

//* Resumindo quando vou passar os atributos de uma classe posso passar ao inves de tipos primitivos
//* como int, etc, posso usar outra classe como sendo o "tipo" de forma abstrata, ou seja,
//* é um objeto instanciado dentro de outro objeto e posso usar métodos de ambas as classes.

//* É a mesma coisa de eu ter um atributo que é do tipo inteiro, ou seja, ele tem que 
//*receber um número instanciado na classe int, e eu passar pra ele um objeto
//* que tenha um valor de um número inteiro.

/*
class fodas
private int numero;

public void setNumero(int num){
    this.numero=num
}
Ai então eu crio um objto instanciado na classe int, e uso ele como parametro
int num = 5;
Fodas obj = new Fodas();
obj.setNumero(num) faço ele receber a variavel como parametro
*/

public class Luta{
    //*Atributos
    private Lutador desafiado; //! Isso é uma agregação, onde eu pego elementos de outra classe 
    private Lutador desafiante; //! Isso são tipos abstratos de dados, onde eu uso outra classe como parâmetro para essa.
    private boolean aprovada;
   

    //*Getters e Setters
    public Lutador getDesafiado() {
        return this.desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }


    
    //* Métdodos especiais
    public void marcarLutra(Lutador l1, Lutador l2){ 
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            System.out.println(this.desafiado.apresentar());

            System.out.println("### DESAFIANTE ###");
            System.out.println(this.desafiante.apresentar());

            Random aleatorio = new Random(); //Classe ramdom pra gerar número aleatório
            int vencedor = aleatorio.nextInt(3); // gera um inteiro aleatório de 0 a 2
            System.out.println("### RESULTADO ###");
            switch(vencedor){
            case 0: // empate
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
            case 1: // desafiado vence
                System.out.println("O lutador " + this.desafiado.getNome() + " venceu o combate" );
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2:// desafiante vence
                System.out.println("O lutador " + this.desafiante.getNome() + " venceu o combate" );
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                break;
            
        }
        System.out.println("==============================");
    } else{
        System.out.println("A luta não pode acontecer!!");
    }
        
    }
}
