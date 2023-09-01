import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private HashSet<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        palavrasUnicas = new HashSet<String>();
    }

    public ConjuntoPalavrasUnicas(HashSet<String> palavrasUnicas) {
        this.palavrasUnicas = palavrasUnicas;
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        for (String string : palavrasUnicas) {
            System.out.println(string);
        }
    }


}
