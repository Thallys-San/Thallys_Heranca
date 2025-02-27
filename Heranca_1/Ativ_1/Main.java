package Ativ_1;

public class Main {
    public static void main(String[] args) {

        Ingresso ingresso1 = new Ingresso(10);
        ingresso1.imprimeValor();

        Normal ingressoNormal = new Normal(15);
        ingressoNormal.imprimeValor();

        Vip ingressoVip = new Vip(15, 10);
        ingressoVip.imprimeValor();

        CamaroteInferior camaroteInferior1 = new CamaroteInferior("");
        camaroteInferior1.setIngressoVip(15);
        camaroteInferior1.setTaxa(10);
        camaroteInferior1.setLocalizacao("Setor A");
        camaroteInferior1.imprimeValor();

        CamaroteSuperior camaroteSuperior1 = new CamaroteSuperior();
        camaroteSuperior1.setIngressoVip(15);
        camaroteSuperior1.setTaxaSup(20);
        camaroteSuperior1.setTaxa(10);
        camaroteSuperior1.setLocalizacaoSup("Setor B");
        camaroteSuperior1.imprimeValor();
    }
}



