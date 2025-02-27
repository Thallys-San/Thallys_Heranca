package Ativ_1;

public class Vip extends Ingresso {
    private double ingressoVip;
    private double taxa;

    public Vip() {
        super();
    }

    public Vip(double ingressoVip, double taxa) {
        super(ingressoVip);
        this.ingressoVip = ingressoVip;
        this.taxa = taxa;
    }

    @Override
    public void imprimeValor() {
        System.out.println("-------------------- Informações do Ingresso --------------------");
        System.out.println("Tipo: Ingresso VIP");
        System.out.printf("Valor do Ingresso VIP: R$ %.2f%n", getIngressoVip());
        System.out.printf("Taxa Adicional: R$ %.2f%n", getTaxa());
        System.out.printf("Valor Total: R$ %.2f%n", valorTotal());
    }

    public double valorTotal() {
        return getIngressoVip() + getTaxa();
    }

    public double getIngressoVip() {
        return ingressoVip;
    }

    public void setIngressoVip(double ingressoVip) {
        this.ingressoVip = ingressoVip;
        super.setValor(ingressoVip);
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
