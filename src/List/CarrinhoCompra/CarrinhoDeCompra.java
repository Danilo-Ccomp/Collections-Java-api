package List.CarrinhoCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> listaItens;

    public CarrinhoDeCompra() {
        listaItens = new ArrayList<>();
    }

    public void  adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.listaItens.add(item);
    }

    public void removerItem(String nome) {
       List<Item> listaRemover = new ArrayList<>();
        if(!listaItens.isEmpty()) {
            for(Item item : listaItens) {
                if(item.getNome().equalsIgnoreCase(nome)) {
                    listaRemover.add(item);
                }
            }
            listaItens.removeAll(listaRemover);
        }else System.out.println("Lista Vazia");
    }

    public double calcularTotal() {
        double total = 0d;
        if(!listaItens.isEmpty()){
            for(Item item : listaItens) {
                total += item.getSubtotal();
            }
            return total;
        }
        else {
            throw new RuntimeException("Lista Vazia");
        }
    }


    public void exibirItens() {
        if(!listaItens.isEmpty()) {
            System.out.println(this.listaItens);
        }else
            System.out.println("Lista Vazia");
    }


    @Override
    public String toString() {
        return "CarrinhoDeCompra{" +
                "Itens=" + listaItens + '}';
    }
}
