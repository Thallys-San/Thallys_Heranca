package Ativ_1;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso();

        ingresso1.setValor(10);
        ingresso1.imprimeValor();

        Ingresso ingresso2 = new Normal();
        ingresso2.setValor(15);
        ingresso2.imprimeValor();
    }
}
