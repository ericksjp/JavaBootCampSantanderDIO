import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class agendaContatos {
    Set<Contato> contatos;

    public agendaContatos() {
        this.contatos = new HashSet<Contato>();
    }

    public void addContato(Contato contato) {
        if (contatos.contains(contato)){
            throw new RuntimeException("Contato ja inserido na agenda.");
        } else {
            contatos.add(contato);
        }
    }

    public void removerContato(Contato contato) {
        if (!contatos.contains(contato)) {
            throw new RuntimeException("Contato não encontrado");
        }
        contatos.remove(contato);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        return contatos.stream().filter(x -> x.getNome().startsWith(nome))
                .collect(Collectors.toCollection(HashSet::new));
    }

    public void atualizarNumero(String nome, String novoNumero) {
        Contato contato = contatos.stream()
                .filter(x -> x.getNome().equals(nome))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Contato não encontrado."));

        if (!contato.getNumero().equals(novoNumero)
                && contatos.stream().anyMatch(x -> x.getNumero().equals(novoNumero))) {
            throw new RuntimeException("Número já pertence a outro contato.");
        }

        contato.mudarNumero(novoNumero);
    }

    public void exibirContatos() {
        for (Contato contato : contatos) {
            String contatoOutF = "(" + contato.getNumero().substring(0, 2) + ") " + contato.getNumero().substring(2, 3)
                    + " " + contato.getNumero().substring(3, 7) + "-" + contato.getNumero().substring(7, 11);
            System.out.printf("Nome: %s | Numero: %s\n", contato.getNome(), contatoOutF);
        }
    }
}
