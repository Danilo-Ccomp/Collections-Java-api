package Set.Pesquisa;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public Set<Tarefa> exibirTarefas() {
        return Collections.unmodifiableSet(tarefas);
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        return tarefas.stream()
                .filter(Tarefa::isConcluida)
                .collect(Collectors.toSet());
    }

    public Set<Tarefa> obterTarefasPendentes() {
        return tarefas.stream()
                .filter(Predicate.not(Tarefa::isConcluida))
                .collect(Collectors.toSet());
    }

    public void marcarTarefaConcluida(String descricao) {
        tarefas.stream()
                .filter(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao.toLowerCase()))
                .findFirst()
                .ifPresent(Tarefa::setConcluida);
    }

    public void marcarTarefaPendente(String descricao) {
        tarefas.stream()
                .filter(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao.toLowerCase()))
                .findFirst()
                .ifPresent(Tarefa::setPendente);
    }

    public void limparTarefas() {
        this.tarefas.clear();
    }
}
