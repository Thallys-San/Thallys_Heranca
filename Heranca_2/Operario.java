package Thallys_Heranca_2;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(){super();}

    public Operario(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    @Override
    public void imprimirResultado() {
        System.out.printf("Salario Base: %s%n",getSalarioBase());
        System.out.printf("Imposto: %s%n", getImposto());
        System.out.printf("Salario Liquido: %s%n", calcularSalario());
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
