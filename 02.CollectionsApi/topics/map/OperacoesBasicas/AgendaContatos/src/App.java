public class App {
    public static void main(String[] args) {
        var agendaContados = new AgendaContados();
        agendaContados.addContato("Erick", 98765);
        agendaContados.addContato("Jorge", 65987);
        agendaContados.addContato("Mario", 36598);
        agendaContados.addContato("Lucas", 35698);
        agendaContados.addContato("Fernando", 78945);
        agendaContados.addContato("Guti", 36598);
        agendaContados.addContato("Crazy8", 22222);

        agendaContados.exibirContatos();
        System.out.println();

        agendaContados.removerContato("Erick");

        agendaContados.exibirContatos();
        System.out.println();

        Integer num = agendaContados.pesquisaPorNome("Crazy8");

        System.out.println(num);

    }
}
