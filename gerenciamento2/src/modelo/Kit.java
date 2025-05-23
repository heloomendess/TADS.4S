package modelo;

import java.util.ArrayList;
import java.util.List;

public class Kit extends Produto {

    private String nome;
    private List<Produto> lista;

    public Kit(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

    public void adicionar(Produto produto) {
        lista.add(produto);
    }

    public void remover(Produto produto) {
        lista.remove(produto);
    }

    @Override
    public String toString() {
        return "Kit{" +
                "nome='" + nome + '\'' +
                ", lista=" + lista +
                ", getPreco=" + getPreco +
                '}';
    }

    @Override
    public double getPreco() {
        double total = 0;
        for(Produto produto:lista) {
            total += produto.getPreco();
        }
        return total;
    }
}
