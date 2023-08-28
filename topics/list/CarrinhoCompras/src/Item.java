public class Item {
    private Double preco;
    private Integer quantidade;
    private String nome;

    public Item() {
    }

    public Item(Double preco, Integer quantidade, String nome) {
        setPreco(preco);
        setQuantidade(quantidade);
        setNome(nome);
    }

    public Double totalPrice(){
        if (preco == null || quantidade == null)
            return null;
        return preco * quantidade;
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

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        if (quantidade != null && quantidade < 0)
            this.quantidade = 0;
        else 
            this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty() == true || nome.isBlank() == true)
            this.nome = null;
        else 
            this.nome = nome;
    }
}
