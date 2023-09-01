import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        var conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("AKAWoman");
        conjuntoPalavrasUnicas.adicionarPalavra("NakedWoman");
        conjuntoPalavrasUnicas.adicionarPalavra("NakedMan");
        conjuntoPalavrasUnicas.adicionarPalavra("NoIdeas");
        conjuntoPalavrasUnicas.adicionarPalavra("duruts");

        System.out.println("\nPalavras: ");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.print("\nInforma uma palavra do conjunto para removela: ");
        String removerPalavra = sc.nextLine();
        conjuntoPalavrasUnicas.removerPalavra(removerPalavra);

        System.out.println("\nPalavras: ");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();


        System.out.print("\nInforma uma palavra para verificar se ela esta no conjunto: ");
        String verificarPalavra = sc.nextLine();

        if (conjuntoPalavrasUnicas.verificarPalavra(verificarPalavra)){
            System.out.printf("A palavra %s esta presente no conjunto.\n", removerPalavra);
        } else {
            System.out.printf("A palavra %s não está presente no conjunto.\n", removerPalavra);
        }

        sc.close();
    }
}
