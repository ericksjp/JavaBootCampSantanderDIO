import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
*Functional Interface - Consumer<T>
*Representa uma operação que aceita um argumentodo tipo T e não retorna nenhum resultado. 
*É utilizada principalmente para realizar acçoes, ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor. }
*/

public class AConsumer {
    public static void main(String[] args) throws Exception {

        List<Pessoa> pessoas = Arrays.asList(new Pessoa(), new Pessoa(), new Pessoa(),new Pessoa(),new Pessoa(),new Pessoa(),new Pessoa());

        //Usar o Consumer com expressão lambda para imprimir as pessoas com idade par
        Consumer<Pessoa> imprimirPessoa = pessoa -> {
            if (pessoa.getIdade() % 2 == 0) {
                System.out.println(pessoa.toString());
            }
        };

        //usando o consumer no foreach
        pessoas.stream().forEach(imprimirPessoa);
    }
}
