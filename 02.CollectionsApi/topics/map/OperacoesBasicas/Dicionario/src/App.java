public class App {
    public static void main(String[] args) throws Exception {
        var dicionario = new Dicionario();
        dicionario.addPalavra("Ovo", "Iguaria de galinhas");
        dicionario.addPalavra("Computador", "Dispositivo eletrônico de processamento de dados");
        dicionario.addPalavra("Montanha", "Elevação natural do terreno");
        dicionario.addPalavra("Felicidade", "Estado emocional de alegria e contentamento");
        dicionario.addPalavra("Floresta", "Área extensa de terra coberta por árvores e vegetação");
        dicionario.addPalavra("Astronomia", "Ciência que estuda os corpos celestes");
        dicionario.addPalavra("Guitarra", "Instrumento musical de cordas");
        dicionario.addPalavra("Chocolate", "Produto alimentício doce feito de cacau");
        dicionario.addPalavra("Avião", "Aparelho mais pesado que o ar capaz de voar");
        dicionario.addPalavra("Amizade", "Relação de afeto e confiança entre pessoas");

        System.out.println("Dictionary: ");
        dicionario.exibirDicionario();

        dicionario.removerPalavra("Ovo");
        dicionario.removerPalavra("Amizade");
        dicionario.removerPalavra("Felicidade");
        dicionario.removerPalavra("Montanha");
        dicionario.removerPalavra("Chocolate");

        System.out.println("\nDictionary: ");
        dicionario.exibirDicionario();

        System.out.printf("\n%s\n", dicionario.pesquisarPorPalavra("Avião"));
        dicionario.atualizarDefinicao("Avião", "Qualquer coisa ai");
        System.out.printf("\n%s\n", dicionario.pesquisarPorPalavra("Avião"));

        dicionario.limparDicionario();
        dicionario.exibirDicionario();

        // Verificar se as palavras foram adicionadas corretamente
    }
}
