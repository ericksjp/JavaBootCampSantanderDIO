import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:*/

public class D10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(null,1,3,5,15);

        /*Predicato para filtrar os numeros */
        Predicate<Integer> verifier = x -> x != null &&
                                           x % 2 != 0 &&
                                          (x % 3 == 0 || x % 5 == 0);

        /*Printando os numeros que atendem as condições */
        System.out.println("Numeros impares multiplos de 3 ou de 5: " + numeros.stream().filter(verifier).collect(Collectors.toList()));

    }
}
