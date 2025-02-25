package Ativ_1;

public class Vip extends Ingresso {
    private double ingressoVip;

    public Vip(){super();}

    public Vip(double ingressoVip) {
        this.ingressoVip = ingressoVip;
    }

    @Override
    public void imprimeValor() {
        super.imprimeValor();
        System.out.println("Valor: "+getIngressoVip());
    }

    public double getIngressoVip() {
        return ingressoVip;
    }

    public void setIngressoVip(double ingressoVip) {
        this.ingressoVip = ingressoVip;
    }
}
