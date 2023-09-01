import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/*Desafio 14 - Encontre o maior número primo da lista:*/

public class D14 {        
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, null);

        /*Predicato para filtrar os numeros primos */
        Predicate<Integer> primoFilter = D14::isPrimo;

        /*Filtrando itens, e pegando o valor maximo, usando o comparator de ordem natural como parametro */
        Integer maiorNumPrimo = numeros.stream()
                                .filter(primoFilter)
                                .max(Comparator.naturalOrder()).orElse(null);

        System.out.println("Maior numero primo na lista: " + maiorNumPrimo);
    }

    /*Função para verificar se o numero eh primo */
    public static boolean isPrimo (Integer num){
        if (num == null || num < 2){
            return false;
        } else {
            int verifier = 0;
            for (int c = 1; c <= num; c++){
                if (num % c == 0)
                    verifier++;
            }

            return verifier == 2;
        }
    }
}
