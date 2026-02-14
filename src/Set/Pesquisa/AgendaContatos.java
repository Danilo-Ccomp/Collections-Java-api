package Set.Pesquisa;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        contatos.forEach(System.out::println);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        return contatos.stream()
                .filter(contato -> contato.getNome().toLowerCase().startsWith(nome.toLowerCase()))
                .collect(Collectors.toSet());
    }

    public Contato atualizarContato(String nome, int novoTelefone) {
        return contatos.stream()
                .filter(contato -> contato.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .map(contato -> {
                    contato.setTelefone(novoTelefone);
                    return contato;
                })
                .orElse(null);
    }

}
