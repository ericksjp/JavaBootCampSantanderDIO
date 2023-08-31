import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private HashMap<String, String> dicionario;

    public Dicionario() {
        dicionario = new HashMap<String, String>();
    }

    public void addPalavra(String palavra, String definicao) {
        if (dicionario.containsKey(palavra)) {
            throw new RuntimeException("Word already in dictionary");
        } else
            dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        dicionario.remove(palavra);
    }

    public String pesquisarPorPalavra(String palavra){
        return dicionario.get(palavra);
    }

    public void atualizarDefinicao(String palavra, String definicao) {
        if (!dicionario.containsKey(palavra)) {
            throw new RuntimeException("Word not found in dictionary");
        } else
            dicionario.put(palavra, definicao);
    }

    public void limparDicionario(){
        dicionario.clear();
    }

    public void exibirDicionario(){
        for (Map.Entry<String,String> element : dicionario.entrySet()) {
            System.out.printf("\nWord: %s \nDefinition: %s\n",element.getKey(),element.getValue());
        }
    }

}
