package Thallys_Heranca_2;

public class Pessoa {
    private String nome;
    private String telefone;
    private String Endereco;

    public Pessoa(){}

    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.Endereco = endereco;
    }

    public void imprimirResultado(){
        System.out.println("---------------------Resultado------------------------");
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("Telefone: %s%n", getTelefone());
        System.out.printf("Endereço: %s%n", getEndereco());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
}
