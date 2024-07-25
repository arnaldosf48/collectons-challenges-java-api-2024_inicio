package MAP.OrdenacaoMAP;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibitAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        // o treemap extend do Comparable e so por isso ele ja se orgaiza da main recente para a mais distante
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }

    }

    public void obterProximoEvento(){
//        Set<LocalDate> dataSet = eventosMap.keySet();
//        Collection<Evento> values = eventosMap.values();
//        eventosMap.get() // --> ele precisa receber a chave
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual) ){
                System.out.println("O proximo evento: " + entry.getValue() + " Acontecera na data: " + entry.getKey());
                break; // o break e indispensavel pois assim que achar um evento ele anula
            }


        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 07, 9), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 01, 10), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 07, 25), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 07, 26), "Evento 5", "Atracao: 5");

        agendaEventos.exibitAgenda();

        agendaEventos.obterProximoEvento();



    }

}
