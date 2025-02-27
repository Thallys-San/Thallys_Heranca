package Ativ_3;

public class Mamifero extends Animal {
    private String Alimento;



    public Mamifero(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        Alimento = alimento;
    }

    public void dadosMamifero(){
        System.out.println("------------------------------Informações-----------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento() + " metros");
        System.out.println("Número de Patas: " + getNumeroDePatas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade Média: " + getVelocidadeMedia() + " km/h");
        System.out.println("Alimento: " + Alimento);
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String alimento) {
        Alimento = alimento;
    }
}
