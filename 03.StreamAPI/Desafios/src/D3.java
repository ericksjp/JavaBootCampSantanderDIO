import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console. */

public class D3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /* Predicato para filtrar numeros positivos */
        Predicate<Integer> numerosPositivos = x -> x > 0;

        /* Filtrando os numeros e os transformando numa lista */
        List<Integer> numerosPositivosList = numeros.stream().filter(numerosPositivos).collect(Collectors.toList());

        System.out.println("Numeros positivos da lista: ");
        System.out.println(numerosPositivosList);
    }
}
