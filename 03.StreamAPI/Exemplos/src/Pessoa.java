import java.util.Random;

public class Pessoa {
    private String[] nomes = {
        "Alice", "Bob", "Charlie", "David", "Emma",
        "Fiona", "George", "Hannah", "Isaac", "Julia",
        "Kevin", "Linda", "Michael", "Nina", "Oscar",
        "Paula", "Quincy", "Rachel", "Samuel", "Tina"
    };

    private String nome;
    private int idade;

    public Pessoa(){
        var random = new Random();
        nome = nomes[random.nextInt(20)];
        idade = random.nextInt(100);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
