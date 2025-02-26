package Ativ_1;

public class Main {
    public static void main(String[] args) {

        Ingresso ingresso1 = new Ingresso(10);
        ingresso1.imprimeValor();

        Normal ingressoNormal = new Normal(15);
        ingressoNormal.imprimeValor();

        Vip ingressoVip = new Vip(15, 10);
        ingressoVip.imprimeValor();
    }
}



