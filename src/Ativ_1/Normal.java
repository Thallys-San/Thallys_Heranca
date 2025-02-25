package Ativ_1;

public class Normal extends Ingresso {
    private double ingressoNormal;

    public Normal(){super();}

    public Normal(double valor, double ingressoNormal) {
        super(valor);
        this.ingressoNormal = ingressoNormal;
    }

    @Override
    public void imprimeValor() {
        super.imprimeValor();
        System.out.println("Valor: "+getIngressoNormal());
    }

    public String ingressoNormal(){
        System.out.println("Ingresso Normal");
        return "";
    }

    public double getIngressoNormal() {
        return ingressoNormal;
    }

    public void setIngressoNormal(double ingressoNormal) {
        this.ingressoNormal = ingressoNormal;
    }


}
