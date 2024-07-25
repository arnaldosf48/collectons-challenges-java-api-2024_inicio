package SET.OperacosBasicasSET;

import java.util.Objects;

public class Convidado {
    //atributos

    private String convidado;
    private int codigoConvidado;

    public Convidado(String convidado, int codigoConvidado) {
        this.convidado = convidado;
        this.codigoConvidado = codigoConvidado;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    public String getConvidado() {
        return convidado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvidado() == convidado.getCodigoConvidado();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvidado());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "convidado='" + convidado + '\'' +
                ", codigoConvidado=" + codigoConvidado +
                '}';
    }
}
