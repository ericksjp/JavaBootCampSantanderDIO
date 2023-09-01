import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* Desafio 17 - Filtrar os números primos da lista:*/

public class D17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        /*Predicato para filtrar numeros primos */
        Predicate<Integer> primos = D17::isPrimo;

        System.out.println("Numeros primos da lista: " + numeros.stream().filter(primos).collect(Collectors.toList()));
    }

    /*Função para determinar se um numero eh primo */
    public static boolean isPrimo(Integer num) {
        if (num == null || num < 2) {
            return false;
        } else {
            int verifier = 0;
            for (int c = 1; c <= num; c++) {
                if (num % c == 0)
                    verifier++;
            }

            return verifier == 2;
        }
    }
}
