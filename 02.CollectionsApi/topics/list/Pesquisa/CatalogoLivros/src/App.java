public class App {

    public static void main(String[] args) throws Exception {

        var catalogoLivros = new CatalogoLivros();
        catalogoLivros.addLivro(new Livro("J.R.R. Tolkien", "The Lord of the Rings", (short) 1954));
        catalogoLivros.addLivro(new Livro("Agatha Christie", "Murder on the Orient Express", (short) 1934));
        catalogoLivros.addLivro(new Livro("Jane Austen", "Pride and Prejudice", (short) 1813));
        catalogoLivros.addLivro(new Livro("F. Scott Fitzgerald", "The Great Gatsby", (short) 1925));
        catalogoLivros.addLivro(new Livro("Gabriel García Márquez", "One Hundred Years of Solitude", (short) 1967));
        catalogoLivros.addLivro(new Livro("Leo Tolstoy", "War and Peace", (short) 1869));
        catalogoLivros.addLivro(new Livro("Mark Twain", "The Adventures of Huckleberry Finn", (short) 1884));
        catalogoLivros.addLivro(new Livro("Charles Dickens", "Great Expectations", (short) 1861));
        catalogoLivros.addLivro(new Livro("Herman Melville", "Moby-Dick", (short) 1851));
        catalogoLivros.addLivro(new Livro("Emily Bronte", "Wuthering Heights", (short) 1847));

        System.out.println("\nLivros do século 19: ");
        for (Livro livro : catalogoLivros.pesquisarPorIntervalosAnos((short) 1800, (short) 1900)) {
            System.out.printf("Titulo: %s | Autor: %s | Ano de publicação: %d\n", livro.getTitulo(), livro.getAutor(),
                    livro.getAnoPublicacao());
        }

        System.out.println("\nLivros escritos por J.R.R. Tolkien: ");
        for (Livro livro : catalogoLivros.pesquisarPorAutor("J.R.R. Tolkien")) {
            System.out.printf("Titulo: %s | Autor: %s | Ano de publicação: %d\n", livro.getTitulo(), livro.getAutor(),
                    livro.getAnoPublicacao());
        }

        System.out.println("\nMoby-Dick: ");
        for (Livro livro : catalogoLivros.pesquisarPorTitulo("Moby-Dick")) {
            System.out.printf("Titulo: %s | Autor: %s | Ano de publicação: %d\n", livro.getTitulo(), livro.getAutor(),
                    livro.getAnoPublicacao());
        }

        System.out.println();
    }
}
