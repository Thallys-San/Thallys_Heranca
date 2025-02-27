public class Product {
    private String nome;
    private String marca;
    private Double valor;
    private int quantidade;


    public Product(){}

    public Product(String nome, String marca, Double valor,int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.marca = marca;
    }

    public void exibirProduto(){
        System.out.println("------------Informações do Produto----------------");
        System.out.println("Nome: "+ getNome());
        System.out.println("Marca: "+ getMarca());
        System.out.println("Valor: "+getValor());
        System.out.println("Quantidade: "+getQuantidade());

    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
