import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var agendaContatos = new agendaContatos();
        agendaContatos.addContato(new Contato("erick", "83996545619"));
        agendaContatos.addContato(new Contato("Jorge", "83979862321"));
        agendaContatos.addContato(new Contato("Bottle", "85987965619"));
        agendaContatos.addContato(new Contato("Sting", "11697316519"));
        agendaContatos.addContato(new Contato("John", "98765459865"));

        System.out.println("\nContatos na agenda: ");
        agendaContatos.exibirContatos();

        try (var sc = new Scanner(System.in)) {
            System.out.println("\n--Adicionar Contato--");
            System.out.print("Nome: ");
            String nomeContato = sc.nextLine();
            System.out.print("Numero: ");
            String numeroContato = sc.nextLine();
            agendaContatos.addContato(new Contato(nomeContato, numeroContato));
            System.out.println("Contato adicionado com sucesso!");
            System.out.println("\nContatos na agenda: ");
            agendaContatos.exibirContatos();

            System.out.println("\n--Remover Contato--");
            System.out.print("Nome: ");
            nomeContato = sc.nextLine();
            System.out.print("Numero: ");
            numeroContato = sc.nextLine();
            agendaContatos.removerContato(new Contato(nomeContato, numeroContato));
            System.out.println("Contato removido com sucesso!");
            System.out.println("\nContatos na agenda: ");
            agendaContatos.exibirContatos();

            System.out.println("\n--Atualizar Contato--");
            System.out.print("Nome: ");
            nomeContato = sc.nextLine();
            System.out.print("Numero: ");
            numeroContato = sc.nextLine();
            agendaContatos.atualizarNumero(nomeContato, numeroContato);
            System.out.println("Contato atualizado com sucesso!");
            System.out.println("\nContatos na agenda: ");
            agendaContatos.exibirContatos();

            System.out.println("\n--Procurar Contato--");
            System.out.print("Nome: ");
            nomeContato = sc.nextLine();
            System.out.printf("Contatos com o nome %s:\n", nomeContato);
            for (Contato contato : agendaContatos.pesquisarPorNome(nomeContato)) {
                System.out.printf("Nome: %s | Numero: %s\n", contato.getNome(), contato.getNumero());
            };
        } catch (RuntimeException ex) {
            System.out.println("\nError: " + ex.getMessage());
        }
    }
}
