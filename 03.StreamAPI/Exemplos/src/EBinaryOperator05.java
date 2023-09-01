import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Functional Interface - BinaryOperator<T>
 * Representa uma operação que combina dois arguntos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de lementos, como somar números ou combinar objetos.
 */

public class EBinaryOperator05 {
    public static void main(String[] args) {
        /* Consumer para imprimir pessoas */
        Consumer<Pessoa> imprimirPessoa = System.out::println;

        /* Supplier que gera pessoas */
        Supplier<Pessoa> gerarPessoa = Pessoa::new;

        /* Function que deixa o nome das pessoas em Upcase */
        Function<Pessoa, Pessoa> upCaseName = pessoa -> {
            pessoa.setNome(pessoa.getNome().toUpperCase());
            return pessoa;
        };

        /* Predicate para filtrar as pessoas com idade maior que 20 anos */
        Predicate<Pessoa> menorIdade = pessoa -> pessoa.getIdade() < 18;

        /* BinaryOperator para somar juntar duas pessoas em 1 so */
        BinaryOperator<Pessoa> juntarPessoas = (pessoa1, pessoa2) -> {
            String newPersonName = pessoa1.getNome() + " " + pessoa2.getNome();
            Integer newPersonAge = pessoa1.getIdade() + pessoa2.getIdade();
            return new Pessoa(newPersonName, newPersonAge);
        };

        /* Gerando uma lista de pessoas com o Suplier */
        List<Pessoa> listPessoas = Stream.generate(gerarPessoa).limit(5).collect(Collectors.toList());

        /* Colocando o nome das pessoas da lista em upperCase */
        listPessoas = listPessoas.stream().map(upCaseName).collect(Collectors.toList());

        /* Filtrando as pessoas que são menores de idade */
        List<Pessoa> menoresdeIdade = listPessoas.stream().filter(menorIdade).collect(Collectors.toList());

        /* Juntando todas pessoas*/
        Pessoa franksteinPessoas = listPessoas.stream().reduce(new Pessoa("", 0), juntarPessoas);

        /* Imprimindo as pessoas menores de idade */
        menoresdeIdade.stream().forEach(imprimirPessoa);

        /* printandos a pessoa frankstein */
        System.out.println(franksteinPessoas);

    }
}
