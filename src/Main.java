public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();

        product1.setNome("Fulano");

        System.out.println(product1.getNome());

        Product product2 = new Product("M2","Attack Shark",150.00,12);

        product2.exibirProduto();

        Product product3 = new Hardware();

        product3.setQuantidade(19);

        System.out.println(product3.getQuantidade());

        Product product4 = new Hardware("Memoria Ram", "Kingstom",680.0,12,"DDR4 16GB 3600GHZ");

        product4.exibirProduto();

        Product product5 = new Periferico("Fone Gamer","TGT",1000.0,15,"Cleiton");

        product5.exibirProduto();
    }
}