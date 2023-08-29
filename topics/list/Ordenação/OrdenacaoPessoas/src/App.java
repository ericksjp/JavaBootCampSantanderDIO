import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        var pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Bob", 30, 1.8));
        pessoas.add(new Pessoa("Eve", 28, 1.6));
        pessoas.add(new Pessoa("Charlie", 22, 1.73));
        pessoas.add(new Pessoa("Diana", 29, 1.57));

        System.out.println("\nOrdem natural: ");
        OrdenacaoPessoas.mostrarPessoas(pessoas);

        OrdenacaoPessoas.ordenandoIdade(pessoas);

        System.out.println("\nOrdem por idade: ");
        OrdenacaoPessoas.mostrarPessoas(pessoas);

        OrdenacaoPessoas.ordenarAltura(pessoas, 1);

        System.out.println("\nOrdem por altura: ");
        OrdenacaoPessoas.mostrarPessoas(pessoas);

        OrdenacaoPessoas.ordernarNome(pessoas, 1);

        System.out.println("\nOrdem pelo nome: ");
        OrdenacaoPessoas.mostrarPessoas(pessoas);

    }
}
