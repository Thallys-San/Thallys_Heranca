package Thallys_Heranca_2;

public class Empregado extends Pessoa {
    private int CodigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(){super();}

    public Empregado(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto) {
        super(nome, telefone, endereco);
        this.CodigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    @Override
    public void imprimirResultado() {
        super.imprimirResultado();
        System.out.printf("Codigo Setor: %d%n", getCodigoSetor());
        System.out.printf("Salario Base: %s%n",getSalarioBase());
        System.out.printf("Imposto: %s%%%n", getImposto());
        System.out.printf("Salario Liquido: %s%n", calcularSalario());
    }

    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * getImposto() / 100);
    }

    public int getCodigoSetor() {
        return CodigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        CodigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
