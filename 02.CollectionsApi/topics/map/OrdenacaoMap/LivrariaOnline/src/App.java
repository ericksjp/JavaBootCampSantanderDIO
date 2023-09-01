import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Livraria Online ====");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Pesquisar Livros por Autor");
            System.out.println("4. Obter Livro Mais Caro");
            System.out.println("5. Obter Livro Mais Barato");
            System.out.println("6. Exibir Livros Ordenados por Preço");
            System.out.println("7. Exibir Livros por Ordem Alfabética");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Link: ");
                    String link = scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    livraria.adicionarLivro(link, titulo, autor, preco);
                    break;
                case 2:
                    System.out.print("Título do livro a ser removido: ");
                    String tituloRemover = scanner.nextLine();
                    livraria.removerLivro(tituloRemover);
                    break;
                case 3:
                    System.out.print("Autor: ");
                    String autorPesquisa = scanner.nextLine();
                    System.out.printf("\nLivro(s) do autor %s: \n", autorPesquisa);
                    LivrariaOnline.printBooks(livraria.pesquisarLivrosPorAutor(autorPesquisa));
                    break;
                case 4:
                    System.out.println("\nLivro(s) mais caro(s): ");
                    LivrariaOnline.printBooks(livraria.obterLivroMaisCaro());
                    break;
                case 5:
                    System.out.println("\nLivro(s) mais baratos(s): ");
                    LivrariaOnline.printBooks(livraria.obteLivroMaisBararo());
                    break;
                case 6:
                    System.out.println("\nLivros ordenados por preço: ");
                    livraria.exibirLivrosOrdenadosPorPreco();
                    break;
                case 7:
                    System.out.println("\nLivros em ordem Alfabetica: ");
                    livraria.exibirLivrosPorOrdemAlfabetica();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

}
