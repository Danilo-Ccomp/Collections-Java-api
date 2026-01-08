package List.CatálogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(int anoLancamento, String titutlo, String autor){
        Livro livro = new Livro(anoLancamento, titutlo, autor);
        listaLivros.add(livro);
    }

    public List<Livro> buscarPorAutor(String autor) {
        List<Livro> livrosAutor = new ArrayList<>();
        if (listaLivros == null || listaLivros.isEmpty()) {
            return livrosAutor;
        }
        for (Livro livro : listaLivros) {
            if (livro.getAutor().equalsIgnoreCase(autor.trim())) {
                livrosAutor.add(livro);
            }
        }
        return livrosAutor;
    }

    public List<Livro> buscarPorIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> livrosAno = new ArrayList<>();
        if (listaLivros == null || listaLivros.isEmpty()) {
            return livrosAno;
        }
        for (Livro livro : listaLivros) {
            if (livro.getAnoLancamento() >= anoInicial && livro.getAnoLancamento() <= anoFinal) {
                livrosAno.add(livro);
            }
        }
        return livrosAno;
    }

    public Livro buscaPorTitulo(String titulo) {
        Livro livro = null;
        if (listaLivros != null && !listaLivros.isEmpty()) {
            for (Livro livro1 : listaLivros) {
                if (livro1.getTitulo().equalsIgnoreCase(titulo)) {
                    return  livro1;

                }
            }
        }
        return null;
    }
}
