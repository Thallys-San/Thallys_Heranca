package Ativ_3;

public class TestarAnimal {
    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo",150,4,"Amarelo","Terra",2.0f);
        camelo.ImprimeValor();

        Peixe tubarao = new Peixe("tubarao",300,0,"Cinzento","Mar",1.5f,"Barbatanas e Cauda");
        tubarao.dadosPeixe();

        Mamifero UrsoDoCanada = new Mamifero("Urso Do Canada", 180,4,"vermelho","Terra",0.5f,"Mel");
        UrsoDoCanada.dadosMamifero();
    }
}
