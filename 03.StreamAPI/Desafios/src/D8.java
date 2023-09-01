import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class D8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,null,358);

        /*Função para mapear os elementos e aplicar a função somaDigitos */
        Function<Integer,Integer> somaDigitos = D8::somaDigitos;

        /*Operador Binario para somar os elementos */
        BinaryOperator<Integer> somador =  (x1, x2) -> x1 + x2;

        int numSomaDigits = numeros.stream().map(somaDigitos).reduce(0, somador);

        System.out.println("Soma dos digitos de todos os numeros da lista: " + numSomaDigits);
    }

    /*Função estática para calcular a quantidade de digitos do número */
    public static Integer somaDigitos (Integer num){
        if (num == null)
            return 0;
        return num.toString().replace("-", "").replace(".", "").replace(",", "").length();
    }

}
