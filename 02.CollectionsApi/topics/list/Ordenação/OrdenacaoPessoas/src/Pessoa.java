public class Pessoa implements Comparable <Pessoa>{
    private Integer idade;
    private String name;
    private Double altura;

    public Pessoa() {
    }

    public Pessoa(String name,Integer idade, Double altura) {
        this.idade = idade;
        this.name = name;
        this.altura = altura;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.idade.compareTo(o.idade);
    }

}

