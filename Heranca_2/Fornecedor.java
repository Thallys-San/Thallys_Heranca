package Thallys_Heranca_2;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(){super();}

    public Fornecedor(String nome, String telefone, String endereco, double valorCredito, double valorDivida) {
        super(nome, telefone, endereco);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    @Override
    public void imprimirResultado() {
        super.imprimirResultado();
        System.out.printf("Valor Credito: %s%n", getValorCredito());
        System.out.printf("Valor Divida: %s%n", getValorDivida());
        System.out.printf("Valor: %s%n", obterSaldo());
    }

    public double obterSaldo(){
        return getValorCredito() - getValorDivida();
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
