package List.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;
    public ListaTarefas() {
        tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<Tarefa>();
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(tarefa);
            }
        }
        tarefas.removeAll(tarefasRemover);
    }
    public int numTotalTarefa(){
        return tarefas.size();
    }

    public void todasDescricoesTarefas(){
        System.out.println(tarefas.toString());
    }

    static void main() {
        ListaTarefas lista = new ListaTarefas();
        System.out.println(lista.numTotalTarefa());

        lista.adicionarTarefa("Descricao1");
        lista.adicionarTarefa("Descricao1");
        lista.adicionarTarefa("Descricao2");
        System.out.println(lista.numTotalTarefa());

        lista.removerTarefa("Descricao2");
        System.out.println(lista.numTotalTarefa());

        lista.todasDescricoesTarefas();
    }
}
