public class Fight {
    public static void main(String[] args){
        /*//* Posso instanciar um por um ocupando várias variáveis diferentes.
        Lutador a1 = new Lutador("Tretudo", "XingLIng", 22, 92.4f, 1.80f, 15, 5, 2);
        a1.status();
        System.out.println(a1.getPeso());*/

        //* Ou posso instanciar uma única variável array que vai guardar todos
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Tretudo", "XingLIng", 22, 92.4f, 1.80f, 15, 5, 2);
        //* E assim por diante eu posso cadastrar os outros 5 lutadores
        l[1] = new Lutador("Xerasacul", "Arábia", 31, 93.3f, 1.98f, 20, 0, 1);


        Luta UEC01 = new Luta();
        UEC01.marcarLutra(l[0], l[1]);
        UEC01.lutar();

        //* Posso pegar informações da classe Lutador pelo objeto instanciado na classe Luta
        //* pois uma está agregada a outra.
        System.out.println(UEC01.getDesafiado().getEmpates());
        //*Ou eu poderia simplesmente printar na tela o método original, pois ele teve seus 
        //* atributos alterados pela classe luta.
        l[0].status();
        


        
        
    }
}
