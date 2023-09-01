import java.security.SecureRandom;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private HashMap<Integer, Produto> estoqueProdutos;

    // private long randon = SecureRandom(10000000);
    public EstoqueProdutos() {
        estoqueProdutos = new HashMap<>();
    }

    public void addProduto(Produto produto) {
        if (estoqueProdutos.entrySet().stream()
                .anyMatch(x -> x.getValue().getNome().equalsIgnoreCase(produto.getNome()))) {
            throw new IllegalArgumentException("Product " + produto.getNome() + " is already in stock.");
        } else {
            var random = new SecureRandom();
            var key = random.nextInt(89999999) + 10000000;
            while (estoqueProdutos.keySet().contains(key)) {
                key = random.nextInt(89999999) + 10000000;
            }
            estoqueProdutos.put(key, produto);
        }
    }

    public void addProduto(String name, Integer quantidade, Double preco) {
        var produto = new Produto(name, quantidade, preco);
        if (estoqueProdutos.entrySet().stream()
                .anyMatch(x -> x.getValue().getNome().equalsIgnoreCase(produto.getNome()))) {
            throw new IllegalArgumentException("Product " + produto.getNome() + " is already in stock.");
        } else {
            var random = new SecureRandom();
            var key = random.nextInt(89999999) + 10000000;
            while (estoqueProdutos.keySet().contains(key)) {
                key = random.nextInt(89999999) + 10000000;
            }
            estoqueProdutos.put(key, produto);
        }
    }

    public Double calcularEstoque() {
        return estoqueProdutos.values().stream().mapToDouble(Produto::totalValue).sum();
    }

    public Produto produtoMaisCaro() {
        return estoqueProdutos.values().stream().max(Comparator.comparingDouble(Produto::getPreco)).orElse(null);
    }

    public Produto produtoMaisBarato() {
        return estoqueProdutos.values().stream().min(Comparator.comparingDouble(Produto::getPreco)).orElse(null);
    }

    public Produto produtoEmMaiorQuantidadeEstoque() {
        return estoqueProdutos.values().stream().max(Comparator.comparingDouble(Produto::getQuantidade)).orElse(null);
    }

    public Integer getProductKey(String productName) {
        return estoqueProdutos.entrySet()
                .stream()
                .filter(x -> x.getValue().getNome().equalsIgnoreCase(productName))
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public Integer getProductKey(Produto produto) {
        return estoqueProdutos.entrySet()
                .stream()
                .filter(x -> x.getValue().equals(produto))
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);
    }

}
