package SET.OperacosBasicasSET;

import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjutoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadePorCodigo(int codigoConviado){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvidado() == codigoConviado){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjutoConvidados conjutoConvidados = new ConjutoConvidados();

        System.out.println("Existem " + conjutoConvidados.contarConvidados() + "  do Set de Convidados");
        conjutoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjutoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjutoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjutoConvidados.adicionarConvidado("Convidado 4", 1236);

        conjutoConvidados.exibirConvidados();

        System.out.println("Existem " + conjutoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjutoConvidados.removerConvidadePorCodigo(1234);
        conjutoConvidados.exibirConvidados();

        System.out.println("Existem " + conjutoConvidados.contarConvidados() + " dentro do Set de Convidados");


    }


}
