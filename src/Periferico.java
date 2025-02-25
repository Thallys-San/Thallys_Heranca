public class Periferico extends Product {

    private String tipoConexao;

    public Periferico() {
        super();
    }

    public Periferico(String nome, String marca, Double valor, int quantidade, String tipoConexao) {
        super(nome, marca, valor, quantidade);
        this.tipoConexao = tipoConexao;
    }

    @Override
    public void exibirProduto() {
        super.exibirProduto();
        System.out.println("Tipo de Conexão: "+getTipoConexao());
        System.out.println("--------------------------------------------------");
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }
}
