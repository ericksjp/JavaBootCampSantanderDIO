import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Functional Interface - Function<T, R>
 * Function Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */

public class CFunction03 {
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

        /* Gerando uma lista de pessoas com o Suplier */
        List<Pessoa> listPessoas = Stream.generate(gerarPessoa).limit(5).collect(Collectors.toList());

        /* Colocando o nome das pessoas da lista em upperCase */
        listPessoas = listPessoas.stream().map(upCaseName).collect(Collectors.toList());

        /* Imprimindo as pessoas da lista */
        listPessoas.stream().forEach(imprimirPessoa);

    }
}
