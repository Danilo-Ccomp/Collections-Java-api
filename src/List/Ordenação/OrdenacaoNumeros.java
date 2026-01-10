package List.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaAscedente = new ArrayList<>(listaNumeros);
        Collections.sort(listaAscedente);
        return listaAscedente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaDescendente = new ArrayList<>(listaNumeros);
        listaDescendente.sort(Collections.reverseOrder());
        return listaDescendente;
    }
}
