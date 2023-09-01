import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console. */

public class D2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*Operador binario para somar numeros */
        BinaryOperator<Integer> somador = (x1,x2) -> x1+x2;

        /*Filtrando os numeros pares e os somando num acumulador */
        int soma = numeros.stream().filter(x -> x % 2 == 0).reduce(0, somador);

        System.out.println("Soma dos numeros pares: " + soma);

    }
}
