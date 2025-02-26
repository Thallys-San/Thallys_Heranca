package Ativ_1;

public class CamaroteInferior extends Vip {
private String Localizacao;

    public CamaroteInferior(String localizacao) {
        Localizacao = localizacao;
    }

    @Override
    public void imprimeValor() {
        System.out.println("-------------------- Informações do Ingresso --------------------");
        System.out.println("Tipo: Ingresso VIP");
        System.out.printf("Valor do Ingresso VIP: R$ %.2f%n", getIngressoVip());
        System.out.printf("Taxa Adicional: R$ %.2f%n", getTaxa());
        System.out.printf("Valor Total: R$ %.2f%n", valorTotal());
        System.out.printf("Local do Camarote: ");
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String localizacao) {
        Localizacao = localizacao;
    }
}
