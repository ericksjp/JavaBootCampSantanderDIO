import java.text.NumberFormat;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        var item1 = new Item(3500.0, 2, "Playstation 5");
        var item2 = new Item(200.0, 3, "Relogio de Prata");
        var item3 = new Item(50.0, 4, "Memoria RAM");

        var carrinhaDeCompras = new CarrinhaDeCompras();
        carrinhaDeCompras.addItem(item1);
        carrinhaDeCompras.addItem(item2);
        carrinhaDeCompras.addItem(item3);

        System.out.println("\nItens no carrinho de compras: ");
        carrinhaDeCompras.exibirItens();

        System.out.printf("Valor total: %s - Quantidade de itens: %d\n", NumberFormat.getCurrencyInstance(Locale.getDefault()).format(carrinhaDeCompras.calcularValorTotal()), carrinhaDeCompras.totalItems());

        System.out.println("\n-------------------------------------------------------------------------------------------------------");

        carrinhaDeCompras.removeItemByName("Playstation 5");
        System.out.println("Itens no carrinho de compras: ");
        carrinhaDeCompras.exibirItens();

        System.out.printf("\nValor total: %s - Quantidade de itens: %d\n", NumberFormat.getCurrencyInstance(Locale.getDefault()).format(carrinhaDeCompras.calcularValorTotal()), carrinhaDeCompras.totalItems());


    }
}
