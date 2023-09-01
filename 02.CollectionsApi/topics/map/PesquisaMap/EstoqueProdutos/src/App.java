public class App {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.addProduto("Produto1", 10, 50.0);
        estoque.addProduto("Produto2", 5, 30.0);
        estoque.addProduto("Produto3", 20, 100.0);

        System.out.println("Estoque total: " + estoque.calcularEstoque());

        Produto produtoMaisCaro = estoque.produtoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro.getNome());

        Produto produtoMaisBarato = estoque.produtoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato.getNome());

        Produto produtoMaiorQuantidade = estoque.produtoEmMaiorQuantidadeEstoque();
        System.out.println("Produto com maior quantidade: " + produtoMaiorQuantidade.getNome());

        String productName = "Produto1";
        Integer productKeyByName = estoque.getProductKey(productName);
        System.out.println("Chave do produto '" + productName + "': " + productKeyByName);

        Produto produtoToFind = new Produto("Produto2", 5, 30.0);
        Integer productKeyByObject = estoque.getProductKey(produtoToFind);
        System.out.println("Chave do produto por objeto: " + productKeyByObject);
    }
}
