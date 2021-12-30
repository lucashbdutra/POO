package Loteria;
public class Main{
public static void main(String[] args) {
   Pessoa a = new Pessoa();
   a.setNome("jota");
   a.gerarJogo();
   System.out.println(a);
   
   /*for (int j : a.getJogo()) {
    System.out.println(j);
   }*/

   Loteca loto = new Loteca();
   loto.setConcorrente(a);
   loto.comprar();
   try{
      loto.sortear();
      System.out.println(loto.verificar());
   } catch(RuntimeException e){
      System.out.println(e.getMessage());
   }
   
   
   
   
}
}