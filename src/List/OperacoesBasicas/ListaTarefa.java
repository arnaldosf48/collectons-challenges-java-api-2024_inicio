package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarfas(){
       return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lsita e:  " + listaTarefa.obterNumeroTotalDeTarfas());

        listaTarefa.adicionarTarefa("Tarefa UM");
        listaTarefa.adicionarTarefa("Tarefa DOIS");
        listaTarefa.adicionarTarefa("Tarefa TRES");
        System.out.println("O numero total de elementos na lsita e:  " + listaTarefa.obterNumeroTotalDeTarfas());

        listaTarefa.removerTarefa("Tarefa DOIS");
        System.out.println("O numero total de elementos na lsita e:  " + listaTarefa.obterNumeroTotalDeTarfas());

        listaTarefa.obterDescricoesTarefas();


    }

}

