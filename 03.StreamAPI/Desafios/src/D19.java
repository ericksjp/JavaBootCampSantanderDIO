import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5: */

public class D19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(null, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        /*Predicato para filtrar os numeros */
        Predicate<Integer> condition = x -> x != null && x % 3 == 0 && x % 5 ==0;

        /*Printando o resultado de uma vez. Filtrando a Stream e a transformando de volta numa lista. */
        System.out.println("Todos os numeros da lista divisiveis por 3 e 5: " + numeros.stream().filter(condition).collect(Collectors.toList()));

    }
}
