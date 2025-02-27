public class Hardware extends Product {
private String descricao;

    public Hardware(){
        super();
    }

    public Hardware(String nome, String marca, Double valor, int quantidade, String descricao) {
        super(nome, marca, valor, quantidade);
        this.descricao = descricao;
    }

    @Override
    public void exibirProduto() {
        super.exibirProduto();
        System.out.println("Descrição: "+getDescricao());
        System.out.println("--------------------------------------------------");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
