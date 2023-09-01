import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/*Desafio 7 - Encontrar o segundo número maior da lista:*/

public class D7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(null,null,1,2);

        /*Predicate para evitar numeros nulos */
        Predicate<Integer> notNull =  x -> x != null;

        /*Ordenando, depois pulando o primeiro da Stream, que é o maior número, e pegando o segundo */
        Integer segundoMaior = numeros.stream()
                                .filter(notNull)
                                .sorted(Comparator.reverseOrder())
                                .skip(1)
                                .findFirst().orElse(null);

        System.out.println("O segundo maior numero eh: " + segundoMaior);
    }
}
