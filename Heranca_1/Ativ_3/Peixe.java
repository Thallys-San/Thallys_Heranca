package Ativ_3;

public class Peixe extends Animal {
    private String Caracteristica;



    public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        Caracteristica = caracteristica;
    }

    public void dadosPeixe(){
        System.out.println("------------------------------Informações-----------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento() + " metros");
        System.out.println("Número de Patas: " + getNumeroDePatas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade Média: " + getVelocidadeMedia() + " km/h");
        System.out.println("Característica do Peixe: " + Caracteristica);
    }

    public String getCaracteristica() {
        return Caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        Caracteristica = caracteristica;
    }
}
