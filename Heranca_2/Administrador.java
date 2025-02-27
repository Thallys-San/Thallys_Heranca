package Thallys_Heranca_2;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(){super();}

    public Administrador(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public void imprimirResultado() {
        System.out.println("---------------------Resultado------------------------");
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("Telefone: %s%n", getTelefone());
        System.out.printf("Endereço: %s%n", getEndereco());
        System.out.printf("Salario Base: %s%n",getSalarioBase());
        System.out.printf("Imposto: %s%%%n", getImposto());
        System.out.printf("Ajuda De Custo: %s%%%n", getAjudaDeCusto());
        System.out.printf("Salario Liquido: %s%n", calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() - (super.calcularSalario() * getAjudaDeCusto()/100);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
