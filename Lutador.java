public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    // Métodos Públicos
    public void apresentar() {

    }
    public void status(){

    }
    public void ganharLuta() {

    }
    public void perderLuta() {

    }
    public void empatarLuta() {

    }


    // Métodos Especiais 
    
    //Método Construtor:
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
    }    


}
