package Set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private final String nome;
    private final int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() { return nome; }

    public int getCodigoConvite() { return codigoConvite; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Convidado convidado = (Convidado) obj;
        return codigoConvite == convidado.codigoConvite;
    }

    public int hashCode() {
        return Objects.hash(codigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
