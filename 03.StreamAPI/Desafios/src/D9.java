import java.util.Arrays;
import java.util.List;

/*Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem)*/

public class D9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,null,null);

        /*Usando o distinct para descartar duplicados, e comparando com o tamanho da lista original */
        Boolean verificador = numeros.stream()
                              .distinct()
                              .count() != numeros.size();

        System.out.println("A lista contem números repetidos ? " + verificador);
    }
}
