import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<Integer>();
    }

    public SomaNumeros(List<Integer> nums) {
        numeros = nums;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer integer : numeros) {
            if (integer != null)
                soma += integer;
        }
        return soma;
    }

    public Integer menorNum() {
        if (numeros.isEmpty()) {
            return null;
        }
        return Collections.min(numeros);
    }

    public Integer maiorNum() {
        if (numeros.isEmpty()) {
            return null;
        }
        return Collections.max(numeros);
    }

    public void exibirNumeros() {
        for (Integer integer : numeros) {
            System.out.println(integer);
        }
    }
}
