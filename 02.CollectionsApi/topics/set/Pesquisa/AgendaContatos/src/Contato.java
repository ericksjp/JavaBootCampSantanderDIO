import java.util.Objects;

public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        mudarNome(nome);
        mudarNumero(numero);
    }

    public void mudarNumero(String numero) {
        if (numero == null || numero.isEmpty() || numero.isBlank()) {
            throw new RuntimeException("Numero invalido");
        } else {
            String numFormatado = validatorPhoneNumber.numeroFormatter(numero);
            if (validatorPhoneNumber.numeroValido(numFormatado))
                this.numero = numFormatado;
            else
                throw new RuntimeException("Numero invalido");
        }
    }

    public void mudarNome(String nome) {
        if (nome == null | nome.isEmpty() || nome.isBlank()) {
            throw new RuntimeException("Nome invalido");
        } else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) &&
                Objects.equals(numero, contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

}