import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoNumeros {
    private ArrayList<Integer> numbers;

    public OrdenacaoNumeros() {
        numbers = new ArrayList<Integer>();
    }

    public OrdenacaoNumeros(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public void add(Integer num) {
        numbers.add(num);
    }

    public void showNumbers() {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public void ordenarAscendente() {
        Collections.sort(numbers, new OrdemAscendente());
    }

    public void ordenarDescendente() {
        Collections.sort(numbers, new OrdemDescendente());
    }
}

class OrdemAscendente implements Comparator<Integer> {
    @Override
    public int compare(Integer arg0, Integer arg1) {
        return arg0.compareTo(arg1);
    }
}

class OrdemDescendente implements Comparator<Integer> {
    @Override
    public int compare(Integer arg0, Integer arg1) {
        return -arg0.compareTo(arg1);
    }
}