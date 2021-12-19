public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    

    public Lutador(String no, String na, int id, float pe, float al, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.setPeso(pe);
        this.altura = al;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }



    public float getAltura() {
        return altura;
    }



    public void setAltura(float altura) {
        this.altura = altura;
    }



    public int getIdade() {
        return idade;
    }



    public void setIdade(int idade) {
        this.idade = idade;
    }



    public String getNacionalidade() {
        return nacionalidade;
    }



    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }



    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(peso);
    }

    private void setCategoria(float peso){
        if (peso<52.2){
            this.categoria = "Inválido";

        } else if (peso <= 70.3) {
            this.categoria = "Leve";

        } else if (peso <= 83.9){
            this.categoria = "Médio";

        } else if (peso <= 120.2){
            this.categoria = "Pesado";

        } else {
            this.categoria = "Inválido";
        }
    }

    public String getCategoria(){
        return this.categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);

    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);

    }

    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade() );
        System.out.println(this.getIdade() + " anos" );
        System.out.println(this.getAltura()+ " m de altura" );
        System.out.println("Pesando: " + this.getPeso() );
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates() );
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
}

