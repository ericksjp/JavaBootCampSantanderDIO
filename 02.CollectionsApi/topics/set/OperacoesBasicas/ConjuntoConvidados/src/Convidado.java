public class Convidado {
    private String nome;
    private String codigoConvite;

    public Convidado(String nome) {
        this.nome = nome;
        codigoConvite = new GerarCodigo().gerarCodigo(5);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoConvite() {
        return codigoConvite;
    }
    
}
