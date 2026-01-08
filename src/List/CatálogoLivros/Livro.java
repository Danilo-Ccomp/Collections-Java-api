package List.CatálogoLivros;

public class Livro {
    private final String autor;
    private final String titulo;
    private final int anoLancamento;

    public Livro(int anoLancamento, String titulo, String autor) {
        this.anoLancamento = anoLancamento;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
}
