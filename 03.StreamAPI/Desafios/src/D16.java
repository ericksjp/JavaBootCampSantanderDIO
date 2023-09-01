import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* Desafio 16 - Agrupe os números em pares e ímpares: */

public class D16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        /* Predicatos para filtrar numeros pares e impares */
        Predicate<Integer> pares = x -> x % 2 == 0;
        Predicate<Integer> impares = x -> x % 2 != 0;

        /*Filtrando com base no preticato e criando uma lista de pares e impares */
        List<Integer> parList = numeros.stream().filter(pares).collect(Collectors.toList());
        List<Integer> imparList = numeros.stream().filter(impares).collect(Collectors.toList());

        System.out.println("Numeros pares da lista: " + parList);
        System.out.println("Numeros impares da lista: " + imparList);

    }
}
