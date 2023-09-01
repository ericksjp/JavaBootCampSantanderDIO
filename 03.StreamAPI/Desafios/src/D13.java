import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* Desafio 13 - Filtrar os números que estão dentro de um intervalo:*/

public class D13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /*Predicato que define o intervalo */
        Predicate<Integer> intervaloFilter =  x -> x != null && x > 5 && x < 10 ;

        /*Filtrando os numeros com base no predicato */
        List<Integer> numerosNoIntervalo = numeros.stream()
                            .filter(intervaloFilter)
                            .collect(Collectors.toList());

        System.out.println("Numeros entre 5 e 10 da lista: " + numerosNoIntervalo);
    }
}
