package Ativ_2;

public class Empregado {
    protected double salario;
    protected String nome;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format(
                "--------------------------%n" +
                        " Nome: %s%n" +
                        " Salário: R$ %.2f%n" +
                        "--------------------------",
                getNome(), getSalario()
        );
    }
}
