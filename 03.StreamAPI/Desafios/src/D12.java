import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*Desafio 12 - Encontre o produto de todos os números da lista:*/

public class D12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(9, 9, 9, 0);

        /*Operador Binario para multiplicar todos os numeros da lista */
        BinaryOperator<Integer> multiplicador = (x1, x2) -> x1 * x2;

        /*Retirando os nulos, e acumulando os resultados */
        Integer produto = numeros.stream().filter(x -> x != null).reduce(multiplicador).orElse(0);

        System.out.println("Produto dos numeros da lista: " + produto);

    }
}
