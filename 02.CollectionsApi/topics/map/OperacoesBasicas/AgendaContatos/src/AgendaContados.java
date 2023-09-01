import java.util.Map;
import java.util.TreeMap;

public class AgendaContados {
    private TreeMap<String, Integer> agendaContados;

    public AgendaContados() {
        agendaContados = new TreeMap<String, Integer>(new CustomComparator());
    }

    public void addContato(String name, Integer number) {
        if (agendaContados.containsKey(name)) {
            throw new Error("Value Already in the agenda");
        } else {
            agendaContados.put(name, number);
        }
    }

    public void removerContato(String name) {
        agendaContados.remove(name);
    }

    public Integer pesquisaPorNome(String nome) {
        return agendaContados.get(nome);
    }

    public void exibirContatos() {
        for (Map.Entry<String, Integer> entry : agendaContados.entrySet()) {
            System.out.printf("Nome: %s | Contato: %d\n", entry.getKey(), entry.getValue());
        }
    }

}
