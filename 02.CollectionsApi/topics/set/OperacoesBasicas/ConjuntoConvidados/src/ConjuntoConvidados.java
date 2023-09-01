import java.util.HashSet;

public class ConjuntoConvidados{
    private HashSet<Convidado> conjuntoConvidados;

    public ConjuntoConvidados() {
        conjuntoConvidados = new HashSet<Convidado>();
    }

    public ConjuntoConvidados(HashSet<Convidado> conjuntoConvidados) {
        this.conjuntoConvidados = conjuntoConvidados;
    }

    public Integer contarConvidados (){
        return conjuntoConvidados.size();
    }

    public void addConvidado(Convidado convidado){
        conjuntoConvidados.add(convidado);
    }

    public void addConvidados (HashSet<Convidado> convidados){
        for (Convidado convidado : convidados) {
            addConvidado(convidado);
        }
    }

    public void exibirConvidados(){
        for (Convidado convidado : conjuntoConvidados) {
            System.out.printf("Nome: %s | Código de Convite: %s\n", convidado.getNome(),convidado.getCodigoConvite());
        }
    }

    public String removerConvidadoPorCodigoDeConvite(String codigo){
        Convidado finder = conjuntoConvidados.stream()
                            .filter(x -> x.getCodigoConvite().contains(codigo))
                            .findFirst()
                            .orElse(null);

        if (finder != null){
            String nome =  finder.getNome();
            conjuntoConvidados.remove(finder);
            return nome;
        } else {
            return null;
        }
    }
}