public class App {
    public static void main(String[] args) throws Exception {
        var somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(14);

        System.out.println("Numeros adicionados: ");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos numeros: " + somaNumeros.calcularSoma());
        System.out.println("Maior numero: " + somaNumeros.maiorNum());
        System.out.println("Menor numero: " + somaNumeros.menorNum());

    }
}
