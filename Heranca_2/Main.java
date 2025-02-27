package Thallys_Heranca_2;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setNome("Thallys");
        fornecedor1.setTelefone("13209309813");
        fornecedor1.setEndereco("ainnnnnnnnnn");
        fornecedor1.setValorCredito(12000);
        fornecedor1.setValorDivida(5000);
        fornecedor1.imprimirResultado();

        Empregado empregado1 = new Empregado();
        empregado1.setNome("Thallys");
        empregado1.setTelefone("13209309813");
        empregado1.setEndereco("ainnnnnnnnnn");
        empregado1.setCodigoSetor(123);
        empregado1.setSalarioBase(12000);
        empregado1.setImposto(20);
        empregado1.imprimirResultado();

        Administrador administrador1 = new Administrador();
        administrador1.setNome("Thallys");
        administrador1.setTelefone("13209309813");
        administrador1.setEndereco("ainnnnnnnnnn");
        administrador1.setSalarioBase(12000);
        administrador1.setImposto(20);
        administrador1.setAjudaDeCusto(20);
        administrador1.imprimirResultado();
    }
}
