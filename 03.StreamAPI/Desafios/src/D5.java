import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/*Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console. */

public class D5 {
        public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(null, 2,4,5,6);

        /*Predicato para filtrar numeros maiores que 5 */
        Predicate<Integer> maiorQ5 = x -> x != null && x > 5;

        /*Operador Binario para somar os numeros */
        BinaryOperator<Integer> somador = (x1,x2) -> x1+x2;

        /*Pegando a soma de todos os numeros maiores que 5 e dividindo pela quantidade de numeros maiores que 5 */
        Double mediaNumerosMaioresQ5 = numeros.stream().filter(maiorQ5).reduce(somador).orElse(0) 
                                      / (double) numeros.stream().filter(maiorQ5).count();

        System.out.println("Media dos numeros Maiores que 5: " + mediaNumerosMaioresQ5);
    }
}
