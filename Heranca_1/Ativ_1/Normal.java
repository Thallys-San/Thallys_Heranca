package Ativ_1;

public class Normal extends Ingresso {
    private double ingressoNormal;

    public Normal(double valor) {
        super(valor);
    }

    public Normal(double valor,double ingressoNormal) {
        super(valor);
        this.ingressoNormal = ingressoNormal;
    }

    @Override
    public void imprimeValor() {
        System.out.println("-------------------- Informações do Ingresso --------------------");
        System.out.println("Tipo: Ingresso Normal");
        System.out.printf("Valor: R$ %.2f%n", getValor());
    }

    public double getIngressoNormal() {
        return ingressoNormal;
    }

    public void setIngressoNormal(double ingressoNormal) {
        setValor(ingressoNormal);
    }


}
