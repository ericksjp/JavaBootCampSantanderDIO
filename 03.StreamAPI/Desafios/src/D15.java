import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*Desafio 15 - Verifique se a lista contém pelo menos um número negativo:*/

public class D15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(null, 2, 3, 4, 5, 6, 7, 8, 9, -1, 11);

        
        /*Predicato para filtrr numeros negativos */
        Predicate<Integer> negativeFilter = x -> x != null && x < 0;

        /*Verificando se pelo menos 1 numero da minha lista atende ao predicato */
        Boolean resposta = numeros.stream().anyMatch(negativeFilter);

        System.out.println("A lista contem pelo menos 1 numero negativo ? " + resposta);
    }
}
