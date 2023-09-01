import java.text.NumberFormat;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class LivrariaOnline {
    private TreeMap<String, Livro> livros;

    public LivrariaOnline() {
        livros = new TreeMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        livros.values().removeIf(x -> x.getTitulo().equalsIgnoreCase(titulo));
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        return livros.values().stream().filter(x -> x.getAutor().equalsIgnoreCase(autor)).collect(Collectors.toList());
    }

    public List<Livro> obterLivroMaisCaro() {
        double maxPrice = livros.values()
                .stream()
                .mapToDouble(Livro::getPreco) // mapeando todos os precos
                .max() // pegando o maior preco
                .orElse(0.0); // se não tiver nada pra mapear retorna 0.0

        return livros.values()
                .stream()
                .filter(x -> x.getPreco() == maxPrice) // mapeando todos os precos, se o preco for igual ao max price,
                                                       // ele vai se filtrado
                .collect(Collectors.toList()); // pegando todos os livro filtrados e criando uma list;
    }

    public List<Livro> obteLivroMaisBararo() {
        double maxPrice = livros.values()
                .stream()
                .mapToDouble(Livro::getPreco) // mapeando todos os precos
                .min() // pegando o maior preco
                .orElse(0.0); // se não tiver nada pra mapear retorna 0.0

        return livros.values()
                .stream()
                .filter(x -> x.getPreco() == maxPrice) // mapeando todos os precos, se o preco for igual ao max price,
                                                       // ele vai se filtrado
                .collect(Collectors.toList()); // pegando todos os livro filtrados e criando uma list;
    }

    public void exibirLivrosOrdenadosPorPreco() {
       List<Livro> sortedBooks = livros.values()
                .stream()
                .sorted(Comparator.comparingDouble(Livro::getPreco)) // this order by the book prices;
                .collect(Collectors.toList());
            
        printBooks(sortedBooks);
    }

    public void exibirLivrosPorOrdemAlfabetica() {
        List<Livro> sortedBooks = livros.values()
                .stream()
                .sorted(Comparator.comparing(Livro::getTitulo)) // this order by the book prices;
                .collect(Collectors.toList());
            
        printBooks(sortedBooks);
    }

    public static void printBooks(List<Livro> books) {
        books.forEach(livro -> {
            System.out.println("Title: " + livro.getTitulo() + "\n" +
                    "Autor: " + livro.getAutor());

            if (livro.getPreco() == null)
                System.out.println("Price: not Defined");
            else
                System.out.println("Price: " + NumberFormat.getCurrencyInstance(Locale.getDefault())
                        .format(livro.getPreco()));
        });
    }

}
