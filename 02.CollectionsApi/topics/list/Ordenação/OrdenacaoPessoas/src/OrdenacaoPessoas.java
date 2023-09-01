import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class OrdenacaoPessoas {

    public static void ordenandoIdade(ArrayList<Pessoa> pessoas) {
        Collections.sort(pessoas);
    }

    public static void ordenarAltura(ArrayList<Pessoa> pessoas, int order) {
        Collections.sort(pessoas, new PessoaComparatorAltura(order));
    }

    public static void ordernarNome(ArrayList<Pessoa> pessoas, int order) {
        Collections.sort(pessoas, new PessoaComparatorName(order));
    }

    public static void mostrarPessoas(ArrayList<Pessoa> pessoas){
        for (Pessoa pessoa : pessoas) {
            System.out.printf("Nome: %s - Idade: %d - Altura: %.2f\n", pessoa.getName(),pessoa.getIdade(),pessoa.getAltura());
        }
    }

}

abstract class ComparatorStructure {
    protected int order = 0;

    public ComparatorStructure() {
    }

    public ComparatorStructure(int order) {
        this.order = order;
    }
}

class PessoaComparatorName extends ComparatorStructure implements Comparator<Pessoa> {
    public PessoaComparatorName() {
        super();
    };

    public PessoaComparatorName(int order) {
        super(order);
    }

    @Override
    public int compare(Pessoa arg0, Pessoa arg1) {
        if (order < 0) {
            return -arg0.getName().compareTo(arg1.getName());
        } else {
            return arg0.getName().compareTo(arg1.getName());
        }
    }
}

class PessoaComparatorAltura extends ComparatorStructure implements Comparator<Pessoa> {
    public PessoaComparatorAltura() {
        super();
    };

    public PessoaComparatorAltura(int order) {
        super(order);
    }

    @Override
    public int compare(Pessoa arg0, Pessoa arg1) {
        if (order < 0) {
            return -arg0.getAltura().compareTo(arg1.getAltura());
        } else {
            return arg0.getAltura().compareTo(arg1.getAltura());
        }
    }
}
