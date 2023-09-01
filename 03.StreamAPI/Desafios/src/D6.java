import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*Desafio 6 - Verificar se a lista contém algum número maior que 10:*/

public class D6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /* Predicado para filtrar numeros maiores que 10 */
        Predicate<Integer> maiorq10 = x -> x > 10;

        /* Filtrando numeros maiores que 10*/
        List<Integer> maiorQ10 = numeros.stream().filter(maiorq10).collect(Collectors.toList());
        System.out.println("Numeros maiores que 10 presente na lista: " + maiorQ10);
    }
}
