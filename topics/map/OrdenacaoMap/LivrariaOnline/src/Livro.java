import java.security.InvalidParameterException;

public class Livro {
    private String titulo;
    private String autor;
    private Double preco;

    public Livro(String titulo, String autor, Double preco) {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty() || titulo.isBlank()) {
            throw new InvalidParameterException("Invalid title name");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isEmpty() || autor.isBlank()) {
            throw new InvalidParameterException("Invalid autor name");
        }
        this.autor = autor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco == null|| preco < 0.1) {
            throw new InvalidParameterException("Invalid price value");
        } else
            this.preco = preco;
    }

}