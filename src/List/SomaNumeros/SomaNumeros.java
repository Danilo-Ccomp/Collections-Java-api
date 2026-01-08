package List.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros(){
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(int numero :  listaNumeros){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorValor(){
        if (listaNumeros.isEmpty()) throw new RuntimeException("Lista vazia");
        int maior = Integer.MIN_VALUE;
        for(int numero :  listaNumeros){
            if(numero > maior){
                maior = numero;
            }
        }
        return maior;
    }

    public int encontrarMenorValor(){
        if (listaNumeros.isEmpty()) throw new RuntimeException("Lista vazia");
        int menor = Integer.MAX_VALUE;
        for(int numero :  listaNumeros){
            if(numero < menor){
                menor = numero;
            }
        }
        return menor;
    }

    public List<Integer> getListaNumeros(){
        return listaNumeros;
    }

    @Override
    public String toString() {
        return "Lista de Numeros: " + listaNumeros;
    }
}
