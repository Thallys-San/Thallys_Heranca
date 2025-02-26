package Ativ_2;

public class Vendedor extends Empregado {
    private float percentualComissao;
    private float totalVendas;

    public Vendedor(String nome, double salario, float percentualComissao) {
        super.setNome(nome);
        super.setSalario(salario);
        this.percentualComissao = percentualComissao;
        this.totalVendas = 0;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float calcularSalarioFinal(float totalVendas) {
        float comissao = (percentualComissao / 100) * this.totalVendas;
        return (float) getSalario() + comissao;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public String toString() {
        return String.format(
                "----------------------\n" +
                        " Nome: %s%n" +
                        " Salário Base: R$ %.2f%n" +
                        " Total de Vendas: R$ %.2f%n" +
                        " Percentual de Comissão: %.2f%%%n" +
                        " Salário com Comissão: R$ %.2f%n" +
                        "----------------------",
                getNome(), getSalario(), getTotalVendas(), getPercentualComissao(), calcularSalarioFinal(totalVendas)
        );
    }
}
