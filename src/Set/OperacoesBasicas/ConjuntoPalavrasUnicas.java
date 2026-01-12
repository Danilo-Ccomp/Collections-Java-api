package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra.toLowerCase());
    }

    public boolean removerPalavra(String palavra){
        return conjuntoPalavras.remove(palavra.toLowerCase());
    }

    public boolean verificarPalavra(String palavra){
        return conjuntoPalavras.contains(palavra.toLowerCase());
    }

    public void exibirPalavrasUnicas(){
        conjuntoPalavras.forEach(System.out::println);
    }
}
