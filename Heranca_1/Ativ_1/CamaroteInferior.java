package Ativ_1;

public class CamaroteInferior extends Vip {
private String Localizacao;

    public CamaroteInferior(){super();}

    public CamaroteInferior(String localizacao) {
        Localizacao = localizacao;
    }

    @Override
    public double valorTotal() {
        return super.valorTotal();
    }

    @Override
    public void imprimeValor() {
        System.out.println("-------------------- Informações do Ingresso --------------------");
        System.out.println("Tipo: Ingresso VIP + Camarote Inferior");
        System.out.printf("Valor do Ingresso VIP: R$ %.2f%n", getIngressoVip());
        System.out.printf("Taxa Adicional: R$ %.2f%n", getTaxa());
        System.out.printf("Local do Camarote: %s%n", getLocalizacao());
        System.out.printf("Valor Total: R$ %.2f%n", valorTotal());
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String localizacao) {
        Localizacao = localizacao;
    }
}
