package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new  Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        convidadoSet.removeIf(c -> c.getCodigoConvite() == codigoConvite);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        convidadoSet.forEach(convidado -> System.out.println(convidado.getNome()));
    }

}
