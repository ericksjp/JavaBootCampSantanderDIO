import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console. */

public class D4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*Predicato para filtrar numeros pares */
        Predicate<Integer> removerImpar = x -> x % 2 == 0;

        /*Filtrando os numeros para uma lista de numeros pares */
        List<Integer> paresList = numeros.stream().filter(removerImpar).collect(Collectors.toList());

        System.out.println("Numeros pares da lista: ");
        System.out.println(paresList);
    }
}
