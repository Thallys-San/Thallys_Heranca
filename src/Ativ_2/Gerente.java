package Ativ_2;

public class Gerente extends Empregado {
    protected String departamento;

    public Gerente(String departamento) {
        super();
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return String.format(
                "--------------------------%n" +
                        " Nome: %s%n" +
                        " Salario: R$ %.2f%n" +
                        " Departamento: %s%n" +
                        "--------------------------",
                getNome(), getSalario(), getDepartamento()
                );

    }
}
