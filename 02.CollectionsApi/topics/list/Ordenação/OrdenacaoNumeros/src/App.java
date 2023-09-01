public class App {
    public static void main(String[] args) throws Exception {
        var oN = new OrdenacaoNumeros();
        oN.add(5);
        oN.add(4);
        oN.add(7);
        oN.add(-9);
        oN.add(57);
        oN.add(13);
        oN.add(56);

        System.out.println("Ordem por inserção: ");
        oN.showNumbers();

        System.out.println("\nOrdem ascendente: ");
        oN.ordenarAscendente();
        oN.showNumbers();

        System.out.println("\nOrdem descendente: ");
        oN.ordenarDescendente();
        oN.showNumbers();

    }
}
