import java.util.ArrayList;
import java.util.stream.Collectors;

public class CatalogoLivros {
    ArrayList<Livro> livros;

    public CatalogoLivros() {
        livros = new ArrayList<Livro>();
    }

    public CatalogoLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Livro> pesquisarPorAutor(String autor) {
        return livros.stream() // transformando numa stream
                .filter(livro -> livro.getAutor().equals(autor)) // filtrando essa stream
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Livro> pesquisarPorIntervalosAnos(short anoInicial, short anoFinal) {
        return livros.stream()
                .filter(livro -> livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Livro> pesquisarPorTitulo(String titulo) {
        return livros.stream()
                .filter(livro -> livro.getTitulo().equals(titulo))
                    .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void addLivro (Livro livro){
        this.livros.add(livro);
    }
}
