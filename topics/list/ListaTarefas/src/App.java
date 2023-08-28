
public class App {
    public static void main(String[] args) throws Exception {
        var listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Varrer chão");
        listaTarefas.adicionarTarefa("Tomar banho");
        listaTarefas.adicionarTarefa("lavar prato");

        System.out.println("\nLista de tarefas: ");
        for (String tarefa : listaTarefas.obterDescricoesTarefas()) {
            System.out.println("-> " + tarefa);
        }

        listaTarefas.removerTarefa("Varrer chão");

        System.out.println("\nNova lista de tarefas: ");
        for (String tarefa : listaTarefas.obterDescricoesTarefas()) {
            System.out.println("-> " + tarefa);
        }

        System.out.println("\nTamanho da lista de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

    }
}
