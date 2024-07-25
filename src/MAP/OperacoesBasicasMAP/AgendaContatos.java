package MAP.OperacoesBasicasMAP;

import List.OperacoesBasicas.ListaTarefa;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaCotatoMap;

    public AgendaContatos() {
        this.agendaCotatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaCotatoMap.put(nome, telefone);
    }

    public void removerCOntato(String nome){
        if(!agendaCotatoMap.isEmpty()){
            agendaCotatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaCotatoMap);
    }

    public void pesquisarPorNome(String nome){
        String name = nome;
        Integer numeroPorNome = null;
        if(!agendaCotatoMap.isEmpty()){
           numeroPorNome = agendaCotatoMap.get(nome);

        }
        System.out.println( "O numero de " + name + " e: " + numeroPorNome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 12345);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalvante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 645645);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContato();

        agendaContatos.removerCOntato("Maria Silva");
        agendaContatos.exibirContato();
        agendaContatos.pesquisarPorNome("Camila");

    }

}
