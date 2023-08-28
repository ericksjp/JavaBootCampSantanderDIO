import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<String> listaTarefas;

    public ListaTarefas() {
        listaTarefas = new ArrayList<String>();
    }

    public ListaTarefas(ArrayList<String> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(descricao);
    }

    public void removerTarefa(String descricao){
        listaTarefas.remove(descricao);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public ArrayList<String> obterDescricoesTarefas(){
        return this.listaTarefas;
    }
    
}
