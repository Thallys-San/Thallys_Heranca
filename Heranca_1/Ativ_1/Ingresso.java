package Ativ_1;

public class Ingresso {
    private double valor;

    public Ingresso(){}

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimeValor(){
        System.out.println("-------------------- Informações do Ingresso --------------------");
        System.out.printf("Valor: R$ %.2f%n", getValor());
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
