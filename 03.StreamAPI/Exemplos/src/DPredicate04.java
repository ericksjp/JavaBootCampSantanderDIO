import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Functional Interface - Predicate <T>
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

public class DPredicate04 {
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

        /*Predicate para filtrar as pessoas com idade maior que 20 anos */
        Predicate <Pessoa> menorIdade = pessoa -> pessoa.getIdade() < 18;

        /* Gerando uma lista de pessoas com o Suplier */
        List<Pessoa> listPessoas = Stream.generate(gerarPessoa).limit(5).collect(Collectors.toList());

        /* Colocando o nome das pessoas da lista em upperCase */
        listPessoas = listPessoas.stream().map(upCaseName).collect(Collectors.toList());

        /* Filtrando as pessoas que são menores de idade*/
        List<Pessoa> menoresdeIdade = listPessoas.stream().filter(menorIdade).collect(Collectors.toList());

        /* Imprimindo as pessoas menores de idade */
        menoresdeIdade.stream().forEach(imprimirPessoa);

    }
}
