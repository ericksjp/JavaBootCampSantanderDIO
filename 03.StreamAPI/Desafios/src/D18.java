import java.util.Arrays;
import java.util.List;

/* Desafio 18 - Verifique se todos os números da lista são iguais:*/

public class D18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(null,null,1);

        /*Usando distinct para descartar dulplicados e comparando com 1, que seria apenas 1 elemento na lista */
        Boolean resposta = numeros.stream().distinct().count() == 1;

        System.out.println("Todos os numeros da lista são iguais ? " + resposta);
    }
}
