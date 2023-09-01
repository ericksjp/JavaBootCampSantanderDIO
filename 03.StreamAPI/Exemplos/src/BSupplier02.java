import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Functional Interface - Supplier<T>
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T
 * É comumente usado para criar ou obter documentos de um determinado tipo.
 */

public class BSupplier02 {
    public static void main(String[] args) {
        Consumer<Pessoa> imprimirPessoa = pessoa -> System.out.println(pessoa);
    //  Consumer<Pessoa> imprimirPessoa = System.out::println;

        // usando o supplier para gerar pessoas;
        Supplier<Pessoa> gerarPessoa = Pessoa::new;
    //  Supplier<Pessoa> gerarPessoa = () -> new Pessoa();

        // gerando uma lista de pessoas com esse suplier;
        List<Pessoa> listPessoas = Stream.generate(gerarPessoa) // (() -> Pessoa::new))
                .limit(5)
                .collect(Collectors.toList()); // collect. coleta os streams, e recebe como parametro o coletor que vc
                                               // queira usar para coletar

        listPessoas.forEach(imprimirPessoa);
    }
}
