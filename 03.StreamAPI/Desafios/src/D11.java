import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/*Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:*/

public class D11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0,5);

        /*Função para mapear os quadrados dos numeros */
        Function<Integer, Double> quadrado = Math::sqrt;

        /*Operador binario para somar os numeros */
        BinaryOperator<Double> somador = (x1 ,x2) ->  x1 + x2;

        /*Descartando nulos e numeros menores que 0, mapeando os numeros filtrados, e acumulando seus valores */
        Double sqrtSum = numeros.stream()
                         .filter(x -> x != null && x >= 0)
                         .map(quadrado)
                         .reduce(somador).orElse(0.0);

        System.out.println("Soma dos quadrados dos numeros na lista: " + sqrtSum);
    }
}
