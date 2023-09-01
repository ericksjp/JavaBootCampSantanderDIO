public class Produto {
    private String nome;
    private Integer quantidade;
    private Double preco;

    public Produto(String nome) {
        setNome(nome);
        quantidade = null;
        preco = null;
    }

    public Produto(String nome, Integer quantidade, Double preco) {
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("Invalid product Name");
        } else {
            this.nome = nome;
        }
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        if (quantidade != null && quantidade < 0)
            this.quantidade = 0;
        else
            this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco != null && preco < 0)
            this.preco = 0.0;
        else
            this.preco = preco;
    }

    public Double totalValue() {
        if (quantidade != null && preco != null)
            return quantidade * preco;
        else
            return null;
    }

}
