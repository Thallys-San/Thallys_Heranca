package Ativ_1;

public class CamaroteSuperior extends Vip {
    private String LocalizacaoSup;
    private double taxaSup;

    public CamaroteSuperior(){super();}

    public CamaroteSuperior(double ingressoVip, double taxa, String localizacaoSup, double taxaSup) {
        super(ingressoVip, taxa);
        LocalizacaoSup = localizacaoSup;
        this.taxaSup = taxaSup;
    }

    @Override
    public void imprimeValor() {
        System.out.println("-------------------- Informações do Ingresso --------------------");
        System.out.println("Tipo: Ingresso VIP + Camarote Superior");
        System.out.printf("Valor do Ingresso VIP: R$ %.2f%n", getIngressoVip());
        System.out.printf("Taxa Adicional: R$ %.2f%n", getTaxa());
        System.out.printf("Taxa Camarote: R$ %.2f%n", getTaxaSup());
        System.out.printf("Local do Camarote: %s%n", getLocalizacaoSup());
        System.out.printf("Valor Total: R$ %.2f%n", valorTotal());
    }

    @Override
    public double valorTotal() {
        return getIngressoVip() + getTaxaSup();
    }

    public String getLocalizacaoSup() {
        return LocalizacaoSup;
    }

    public void setLocalizacaoSup(String localizacaoSup) {
        LocalizacaoSup = localizacaoSup;
    }

    public double getTaxaSup() {
        return taxaSup;
    }

    public void setTaxaSup(double taxaSup) {
        this.taxaSup = taxaSup;
    }
}
