public class Livro {
    private short anoPublicacao;
    private String autor;
    private String titulo;

    public Livro() {
    }

    public Livro(String autor, String titulo, short anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.titulo = titulo;
    }

    public short getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(short anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
