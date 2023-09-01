import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        var testeSet = new ConjuntoConvidados();
        testeSet.addConvidado(new Convidado("Marlon"));
        testeSet.addConvidado(new Convidado("Jorge"));
        testeSet.addConvidado(new Convidado("Lucas"));
        testeSet.addConvidado(new Convidado("Rudy"));
        testeSet.addConvidado(new Convidado("Rudy"));

        System.out.println(testeSet.contarConvidados());
        System.out.println("\nConvidados: ");
        testeSet.exibirConvidados();
        System.out.print("\nInforme o codigo do convite do convidado que deseja remover: ");
        String codigoConvite = sc.nextLine();

        String convidadoRemovido = testeSet.removerConvidadoPorCodigoDeConvite(codigoConvite);

        if (convidadoRemovido != null) {
            System.out.printf("%s foi removido do conjunto de convidados!\n",convidadoRemovido);
        } else {
            System.out.println("O codigo de convite não pertence ao conjunto de convidados.");
        }

        System.out.println("\nConvidados: ");
        testeSet.exibirConvidados();
        sc.close();
    }
}
