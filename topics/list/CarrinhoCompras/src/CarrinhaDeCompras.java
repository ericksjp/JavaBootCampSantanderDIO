import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class CarrinhaDeCompras {
    private ArrayList<Item> items;

    public CarrinhaDeCompras() {
        items = new ArrayList<Item>();
    }

    public CarrinhaDeCompras(ArrayList<Item> items) {
        for (Item item : items) {
            addItem(item);
        }
    }

    public void addItens(ArrayList<Item> items) {
        for (Item item : items) {
            addItem(item);
        }
    }

    public void addItem(Item item) {
        if (!(item.getNome() == null || item.getQuantidade() == null || item.getPreco() == null))
            items.add(item);
    }

    public void removeItem(Item Item) {
        items.removeIf(item -> item.equals(Item));
    }

    public void removeItemByName(String nameItem) {
        items.removeIf(item -> item.getNome().equals(nameItem));
    }

    public void clearCarrinho() {
        items.removeAll(items);
    }

    public Double calcularValorTotal() {
        Double soma = 0.0;
        for (Item item : items) {
            soma += item.totalPrice();
        }
        return soma;
    }

    public int totalItems(){
        int total = 0; 
        for (Item item : items) {
            total += item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        for (Item item : items) {
            System.out.printf("Name: %s - Price: %s - Quantity: %d \n", item.getNome(),
                    NumberFormat.getCurrencyInstance(Locale.getDefault()).format(item.getPreco()),
                    item.getQuantidade());
        }
    }
}
